package com.example.demo.controller;

import java.io.IOException;
import java.io.InputStream;

import com.example.demo.api.BranchesApi;
import com.example.demo.models.ResponseBranchesList;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChannelController implements BranchesApi {

    @RequestMapping("/branches")
    @Override
    public ResponseEntity<ResponseBranchesList> getBranches() {
        // TODO Auto-generated method stub

        ResponseBranchesList branchesList = null;

        ObjectMapper mapper = new ObjectMapper();
        TypeReference<ResponseBranchesList> typeReference = new TypeReference<ResponseBranchesList>(){};
        InputStream inputStream = TypeReference.class.getResourceAsStream("/json/branches.json");
        try {
            branchesList = mapper.readValue(inputStream,typeReference);
        } catch (IOException e){
            System.out.println("Unable to save users: " + e.getMessage());
        }

        return new ResponseEntity<>(branchesList, HttpStatus.OK);
    }
    
 
    
}
