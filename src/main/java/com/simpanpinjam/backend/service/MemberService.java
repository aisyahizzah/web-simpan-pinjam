package com.simpanpinjam.backend.service;

import java.util.List;

import com.simpanpinjam.backend.entity.Member;

public interface MemberService {
    List<Member> findAll();

    void insertMember(Member emp);

    void updateMember(Member emp);

    void executeUpdateMember(Member emp);

    void deleteMember(Member emp);

}