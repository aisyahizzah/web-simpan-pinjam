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
    String transactionTypeId;
    String memberId;
    String nominal;

    public String getMutationId() { return mutationId; }
    public void setMutationId(String mutationId) { this.mutationId = mutationId; }
    
    public Date getMutationDate() { return date; }
    public void setMutationDate(Date date) { this.date = date; }

    public String getMutationTransactionTypeId() { return transactionTypeId; }
    public void setMutationTransactionTypeId(String transactionTypeId) { this.transactionTypeId = transactionTypeId; }

    public String getMutationMemberId() { return memberId; }
    public void setMutationMemberId(String memberId) { this.memberId = memberId; }

    public String getMutationNominal() { return nominal; }
    public void setMutationNominal(String nominal) { this.nominal = nominal; }

}