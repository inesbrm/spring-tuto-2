package com.example.springtuto2.controller;

import com.example.springtuto2.model.BaseLegale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@Controller
public class BaseLegaleController {



    private ArrayList<BaseLegale> base = new ArrayList<>();

    @GetMapping("/msg")
    public String listALl(Model model){
        model.addAttribute("listAll",BaseLegale.findAll());
        return "msg";

    }


}
