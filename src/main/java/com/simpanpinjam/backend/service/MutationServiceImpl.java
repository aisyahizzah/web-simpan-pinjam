package com.simpanpinjam.backend.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.simpanpinjam.backend.dao.MutationDao;
import com.simpanpinjam.backend.entity.Mutation;

@Component
public class MutationServiceImpl implements MutationService{
    @Resource
    MutationDao mutationDao;
    @Override
    public List<Mutation> findAll() {
        return mutationDao.findAll();
    }
    @Override
    public void insertMutation(Mutation mutation) {
        mutationDao.insertMutation(mutation);

    }
    @Override
    public void updateMutation(Mutation mutation) {
        mutationDao.updateMutation(mutation);

    }
    @Override
    public void executeUpdateMutation(Mutation mutation) {
        mutationDao.executeUpdateMutation(mutation);

    }

    @Override
    public void deleteMutation(Mutation mutation) {
        mutationDao.deleteMutation(mutation);

    }
}