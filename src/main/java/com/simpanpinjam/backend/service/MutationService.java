package com.simpanpinjam.backend.service;

import java.util.List;

import com.simpanpinjam.backend.entity.Mutation;

public interface MutationService {
    List<Mutation> findAll();

    void insertMutation(Mutation mutation);

    void updateMutation(Mutation mutation);

    void executeUpdateMutation(Mutation mutation);

    void deleteMutation(Mutation mutation);

}