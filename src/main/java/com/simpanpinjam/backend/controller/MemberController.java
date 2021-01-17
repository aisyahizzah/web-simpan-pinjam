package com.simpanpinjam.backend.controller;

import java.util.List;

import javax.annotation.Resource;

import com.simpanpinjam.backend.service.MutationService;
import org.springframework.web.bind.annotation.*;

import com.simpanpinjam.backend.entity.Member;
import com.simpanpinjam.backend.service.MemberService;

@RestController
@RequestMapping("/simpanPinjam/member")
public class MemberController {

    @Resource
    MemberService memberService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(value = "/all")
    public List<Member> getMembers() {
        return memberService.findAll();

    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value = "/create")
    public void createMember(@RequestBody Member member) {
        memberService.insertMember(member);

    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping(value = "/update")
    public void updateMember(@RequestBody Member member) {
        memberService.updateMember(member);

    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping(value = "/execute-update")
    public void executeUpdateMember(@RequestBody Member member) {
        memberService.executeUpdateMember(member);

    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping(value = "/delete-by-id")
    public void deleteMember(@RequestBody Member member) {
        memberService.deleteMember(member);

    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(value = "/name")
    public List<String> getMembersName() {
        return memberService.findAllNames();

    }

}