package com.simpanpinjam.backend.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
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
    public void insertMember(Member emp) {
        final String sql = "insert into member(id, name , address,birthDate) values(:id,:name,:birthDate,:address)";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", emp.getMemberId())
                .addValue("name", emp.getMemberName())
                .addValue("birthDate", emp.getMemberBirthDate())
                .addValue("address", emp.getMemberAddress());
        template.update(sql,param, holder);

    }

    @Override
    public void updateMember(Member emp) {
        final String sql = "update member set name=:name, address=:address, birthDate=:birthDate where id=:id";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", emp.getMemberId())
                .addValue("name", emp.getMemberName())
                .addValue("birthDate", emp.getMemberBirthDate())
                .addValue("address", emp.getMemberAddress());
        template.update(sql,param, holder);

    }

    @Override
    public void executeUpdateMember(Member emp) {
        final String sql = "update member set name=:name, address=:address, birthDate=:birthDate where id=:id";


        Map<String,Object> map=new HashMap<String,Object>();
        map.put("id", emp.getMemberId());
        map.put("name", emp.getMemberName());
        map.put("birthDate", emp.getMemberBirthDate());
        map.put("address", emp.getMemberAddress());

        template.execute(sql,map,new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });


    }

    @Override
    public void deleteMember(Member emp) {
        final String sql = "delete from member where id=:id";


        Map<String,Object> map=new HashMap<String,Object>();
        map.put("id", emp.getMemberId());

        template.execute(sql,map,new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });


    }

}