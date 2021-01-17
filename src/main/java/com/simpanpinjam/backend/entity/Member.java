package com.simpanpinjam.backend.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "member")
public class Member {

    @javax.persistence.Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    String memberId;

    String memberName;
    Date memberBirthDate;
    String memberAddress;

    public String getMemberId() { return memberId; }
    public void setMemberId(String memberId) { this.memberId = memberId; }

    public Date getMemberBirthDate() { return memberBirthDate; }
    public void setMemberBirthDate(Date memberBirthDate) { this.memberBirthDate = memberBirthDate; }
    
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