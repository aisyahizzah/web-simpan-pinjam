package com.simpanpinjam.backend.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.simpanpinjam.backend.entity.Mutation;

public class MutationRowMapper implements RowMapper<Mutation> {

    @Override
    public Mutation mapRow(ResultSet rs, int arg1) throws SQLException {
        Mutation member = new Mutation();
        member.setMutationId(rs.getString("mutationId"));
        member.setMutationDate(rs.getDate("date"));
        member.setMutationTransactionTypeId(rs.getString("transactionTypeId"));
        member.setMutationMemberId(rs.getString("memberId"));
        member.setMutationNominal(rs.getString("nominal"));

        return member;
    }


}
