package com.simpanpinjam.backend.controller;

import java.util.List;

import javax.annotation.Resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.simpanpinjam.backend.service.MutationService;
import org.springframework.web.bind.annotation.*;

import com.simpanpinjam.backend.entity.Mutation;
import com.simpanpinjam.backend.service.MutationService;

@RestController
@RequestMapping("/simpanPinjam/mutation")
public class MutationController {

    @Resource
    MutationService mutationService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(value = "/all")
    public List<Mutation> getMutations() {
        return mutationService.findAll();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(
            value="/create",
            method=RequestMethod.POST,
            consumes="application/json")
    public void createMutation(@RequestBody String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Mutation mutation = objectMapper.readValue(json, Mutation.class);
            mutationService.insertMutation(mutation);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping(value = "/update")
    public void updateMutation(@RequestBody Mutation mutation) {
        mutationService.updateMutation(mutation);

    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping(value = "/execute-update")
    public void executeUpdateMutation(@RequestBody Mutation mutation) {
        mutationService.executeUpdateMutation(mutation);

    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping(value = "/delete-by-id")
    public void deleteMutation(@RequestBody Mutation mutation) {
        mutationService.deleteMutation(mutation);

    }


}