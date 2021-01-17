package com.simpanpinjam.backend.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.simpanpinjam.backend.dao.MemberDao;
import com.simpanpinjam.backend.entity.Member;

@Component
public class MemberServiceImpl implements MemberService{
    @Resource
    MemberDao memberDao;
    @Override
    public List<Member> findAll() {
        return memberDao.findAll();
    }
    @Override
    public void insertMember(Member member) {
        memberDao.insertMember(member);

    }
    @Override
    public void updateMember(Member member) {
        memberDao.updateMember(member);

    }
    @Override
    public void executeUpdateMember(Member member) {
        memberDao.executeUpdateMember(member);

    }

    @Override
    public void deleteMember(Member member) {
        memberDao.deleteMember(member);

    }
}