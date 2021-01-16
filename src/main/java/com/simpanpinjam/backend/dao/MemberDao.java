package com.simpanpinjam.backend.dao;

import java.util.List;

import com.simpanpinjam.backend.entity.Member;

public interface MemberDao {

    List<Member> findAll();

    void insertMember(Member member);

    void updateMember(Member member);

    void executeUpdateMember(Member member);

    public void deleteMember(Member member);

}
