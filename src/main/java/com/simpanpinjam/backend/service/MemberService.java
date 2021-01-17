package com.simpanpinjam.backend.service;

import java.util.List;

import com.simpanpinjam.backend.entity.Member;

public interface MemberService {
    List<Member> findAll();

    void insertMember(Member member);

    void updateMember(Member member);

    void executeUpdateMember(Member member);

    void deleteMember(Member member);

}