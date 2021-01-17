package com.simpanpinjam.backend.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "mutation")
public class Mutation {

    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    String mutationId;

    Date date;
    String transactionType;
    String memberName;
    Integer nominal;

    public String getMutationId() { return mutationId; }
    public void setMutationId(String mutationId) { this.mutationId = mutationId; }
    
    public Date getMutationDate() { return date; }
    public void setMutationDate(Date date) { this.date = date; }

    public String getMutationTransactionType() { return transactionType; }
    public void setMutationTransactionType(String transactionType) { this.transactionType = transactionType; }

    public String getMutationMemberName() { return memberName; }
    public void setMutationMemberName(String memberName) { this.memberName = memberName; }

    public Integer getMutationNominal() { return nominal; }
    public void setMutationNominal(Integer nominal) { this.nominal = nominal; }

}