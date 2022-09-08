package com.example.springtuto2.controller;

import com.example.springtuto2.model.BaseLegale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.*;

@Controller
public class BaseLegaleController {


    private ArrayList<BaseLegale> base = new ArrayList<>();

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
