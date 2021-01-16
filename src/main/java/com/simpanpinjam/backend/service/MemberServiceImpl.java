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
    public void insertMember(Member emp) {
        memberDao.insertMember(emp);

    }
    @Override
    public void updateMember(Member emp) {
        memberDao.updateMember(emp);

    }
    @Override
    public void executeUpdateMember(Member emp) {
        memberDao.executeUpdateMember(emp);

    }

    @Override
    public void deleteMember(Member emp) {
        memberDao.deleteMember(emp);

    }
}