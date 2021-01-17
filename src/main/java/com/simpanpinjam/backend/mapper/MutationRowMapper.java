package com.simpanpinjam.backend.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.simpanpinjam.backend.entity.Mutation;

public class MutationRowMapper implements RowMapper<Mutation> {

    @Override
    public Mutation mapRow(ResultSet rs, int arg1) throws SQLException {
        Mutation mutation = new Mutation();
        mutation.setMutationId(rs.getString("mutationId"));
        mutation.setMutationDate(rs.getDate("date"));
        mutation.setMutationTransactionType(rs.getString("transactionType"));
        mutation.setMutationMemberName(rs.getString("memberName"));
        mutation.setMutationNominal(rs.getInt("nominal"));

        return mutation;
    }


}
