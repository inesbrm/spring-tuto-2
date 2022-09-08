package com.example.springtuto2.controller;

import com.example.springtuto2.model.BaseLegale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class BaseLegaleController {

    @Autowired
    JdbcTemplate jdbcTemplate;
    private ArrayList<BaseLegale> base = new ArrayList<>();

    @GetMapping("/base")
    public List<BaseLegale> listALl(){
        String sql ="SELECT * FROM baseLegale";
        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(BaseLegale.class));
    }
    @GetMapping("/msg")
    public String showBase(Model model){
        BaseLegale b1 = new BaseLegale("0111l00","Inès","150sdsqd");
        BaseLegale b2 = new BaseLegale("021452K","Elodie","test");

        base.add(b1);
        base.add(b2);

        model.addAttribute("msgList", base);

        return "msg";
    }

}
