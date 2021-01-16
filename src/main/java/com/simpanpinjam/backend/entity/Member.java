package com.simpanpinjam.backend.entity;

import java.sql.Date;

public class Member {

    String memberId;
    String memberName;
    Date memberBirthDate;
    String memberAddress;


    public Date getMemberBirthDate() {
        return memberBirthDate;
    }
    public void setMemberBirthDate(Date memberBirthDate) {
        this.memberBirthDate = memberBirthDate;
    }
    public String getMemberId() {
        return memberId;
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    public String getMemberAddress() {
        return memberAddress;
    }
    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }


}