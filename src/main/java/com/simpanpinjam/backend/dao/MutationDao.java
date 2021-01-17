package com.simpanpinjam.backend.dao;

import java.util.List;

import com.simpanpinjam.backend.entity.Mutation;

public interface MutationDao {

    List<Mutation> findAll();

    void insertMutation(Mutation mutation);

    void updateMutation(Mutation mutation);

    void executeUpdateMutation(Mutation mutation);

    public void deleteMutation(Mutation mutation);

}
