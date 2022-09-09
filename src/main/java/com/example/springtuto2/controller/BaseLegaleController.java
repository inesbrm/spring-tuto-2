package com.example.springtuto2.controller;

import com.example.springtuto2.model.BaseLegale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class BaseLegaleController {


    BaseLegale baseLegale;

    private ArrayList<BaseLegale> base = new ArrayList<>();

    @GetMapping("/base")
    public List<BaseLegale> listALl(){
        String sql ="SELECT * FROM baseLegale";
        return baseLegale.findAll();
    }


}
