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

import com.simpanpinjam.backend.entity.Mutation;
import com.simpanpinjam.backend.mapper.MutationRowMapper;

@Repository
public class MutationDaoImpl implements MutationDao{

    public MutationDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }
    NamedParameterJdbcTemplate template;

    @Override
    public List<Mutation> findAll() {
        return template.query("select * from mutation", new MutationRowMapper());
    }

    @Override
    public void insertMutation(Mutation mutation) {

        final String sql = "insert into mutation(date, transactionType , memberName, nominal) values(:date,:transactionType,:memberName,:nominal)";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("date", mutation.getMutationDate())
                .addValue("transactionType", mutation.getMutationTransactionType())
                .addValue("memberName", mutation.getMutationMemberName())
                .addValue("nominal", mutation.getMutationNominal());
        template.update(sql,param, holder);

    }

    @Override
    public void updateMutation(Mutation mutation) {
        final String sql = "update mutation set date=:date, transactionType=:transactionType, memberName=:memberName, nominal=:nominal where mutationId=:mutationId";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("date", mutation.getMutationDate())
                .addValue("transactionType", mutation.getMutationTransactionType())
                .addValue("memberName", mutation.getMutationMemberName())
                .addValue("nominal", mutation.getMutationNominal());
        template.update(sql,param, holder);

    }

    @Override
    public void executeUpdateMutation(Mutation mutation) {
        final String sql = "update mutation set transactionType=:transactionType, memberName=:memberName, date=:date, nominal=:nominal where mutationId=:mutationId";

        Map<String,Object> map=new HashMap<String,Object>();
        map.put("mutationId", mutation.getMutationId());
        map.put("date", mutation.getMutationDate());
        map.put("transactionType", mutation.getMutationTransactionType());
        map.put("memberName", mutation.getMutationMemberName());
        map.put("nominal", mutation.getMutationNominal());

        template.execute(sql,map,new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });

    }

    @Override
    public void deleteMutation(Mutation mutation) {
        final String sql = "delete from mutation where mutationId=:mutationId";
        
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("mutationId", mutation.getMutationId());

        template.execute(sql,map,new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });

    }

}