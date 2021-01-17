package com.simpanpinjam.backend.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.simpanpinjam.backend.entity.Member;

public class MemberRowMapper implements RowMapper<Member> {

    @Override
    public Member mapRow(ResultSet rs, int arg1) throws SQLException {
        Member member = new Member();
        member.setMemberName(rs.getString("memberName"));
        member.setMemberBirthDate(rs.getDate("memberBirthDate"));
        member.setMemberAddress(rs.getString("memberAddress"));

        return member;
    }


}
