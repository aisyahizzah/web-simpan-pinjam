package com.simpanpinjam.backend.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.simpanpinjam.backend.entity.Member;
import com.simpanpinjam.backend.mapper.MemberRowMapper;

@Repository
public class MemberDaoImpl implements MemberDao{

    public MemberDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }
    NamedParameterJdbcTemplate template;

    @Override
    public List<Member> findAll() {
        return template.query("select * from member", new MemberRowMapper());
    }

    @Override
    public List<String> findAllNames() {
        return template.query("select membername from member", new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet rs, int i) throws SQLException {
                return rs.getString("memberName");
            }
        });
    }

    @Override
    public void insertMember(Member member) {
        final String sql = "insert into member(memberId, memberName , memberAddress,memberBirthDate) values(:memberId,:memberName,:memberBirthDate,:memberAddress)";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("memberId", member.getMemberId())
                .addValue("memberName", member.getMemberName())
                .addValue("memberBirthDate", member.getMemberBirthDate())
                .addValue("memberAddress", member.getMemberAddress());
        template.update(sql,param, holder);

    }

    @Override
    public void updateMember(Member member) {
        final String sql = "update member set memberName=:memberName, memberAddress=:memberAddress, memberBirthDate=:memberBirthDate where memberId=:memberId";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("memberId", member.getMemberId())
                .addValue("memberName", member.getMemberName())
                .addValue("memberBirthDate", member.getMemberBirthDate())
                .addValue("memberAddress", member.getMemberAddress());
        template.update(sql,param, holder);

    }

    @Override
    public void executeUpdateMember(Member member) {
        final String sql = "update member set memberName=:memberName, memberAddress=:memberAddress, memberBirthDate=:memberBirthDate where memberId=:memberId";


        Map<String,Object> map=new HashMap<String,Object>();
        map.put("memberId", member.getMemberId());
        map.put("memberName", member.getMemberName());
        map.put("memberBirthDate", member.getMemberBirthDate());
        map.put("memberAddress", member.getMemberAddress());

        template.execute(sql,map,new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });


    }

    @Override
    public void deleteMember(Member member) {
        final String sql = "delete from member where memberId=:memberId";


        Map<String,Object> map=new HashMap<String,Object>();
        map.put("memberId", member.getMemberId());

        template.execute(sql,map,new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });

    }

}