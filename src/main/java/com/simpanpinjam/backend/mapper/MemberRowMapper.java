package com.simpanpinjam.backend.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.simpanpinjam.backend.entity.Member;

public class MemberRowMapper implements RowMapper<Member> {

    @Override
    public Member mapRow(ResultSet rs, int arg1) throws SQLException {
        Member emp = new Member();
        emp.setMemberId(rs.getString("id"));
        emp.setMemberName(rs.getString("name"));
        emp.setMemberBirthDate(rs.getDate("birthDate"));
        emp.setMemberAddress(rs.getString("address"));

        return emp;
    }


}
