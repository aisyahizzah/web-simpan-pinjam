package com.simpanpinjam.backend.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simpanpinjam.backend.entity.Member;
import com.simpanpinjam.backend.service.MemberService;

@RestController
@RequestMapping("/postgressApp")
public class ApplicationController {

    @Resource
    MemberService memberService;

    @GetMapping(value = "/memberList")
    public List<Member> getMembers() {
        return memberService.findAll();

    }

    @PostMapping(value = "/createEmp")
    public void createMember(@RequestBody Member emp) {
        memberService.insertMember(emp);

    }
    @PutMapping(value = "/updateEmp")
    public void updateMember(@RequestBody Member emp) {
        memberService.updateMember(emp);

    }
    @PutMapping(value = "/executeUpdateEmp")
    public void executeUpdateMember(@RequestBody Member emp) {
        memberService.executeUpdateMember(emp);

    }

    @DeleteMapping(value = "/deleteEmpById")
    public void deleteMember(@RequestBody Member emp) {
        memberService.deleteMember(emp);

    }


}