package com.simpanpinjam.backend.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.*;

import com.simpanpinjam.backend.entity.Member;
import com.simpanpinjam.backend.service.MemberService;

@RestController
@RequestMapping("/simpanPinjam")
public class ApplicationController {

    @Resource
    MemberService memberService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(value = "/memberList")
    public List<Member> getMembers() {
        return memberService.findAll();

    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value = "/createEmp")
    public void createMember(@RequestBody Member member) {
        memberService.insertMember(member);

    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping(value = "/updateEmp")
    public void updateMember(@RequestBody Member member) {
        memberService.updateMember(member);

    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping(value = "/executeUpdateEmp")
    public void executeUpdateMember(@RequestBody Member member) {
        memberService.executeUpdateMember(member);

    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping(value = "/deleteEmpById")
    public void deleteMember(@RequestBody Member member) {
        memberService.deleteMember(member);

    }


}