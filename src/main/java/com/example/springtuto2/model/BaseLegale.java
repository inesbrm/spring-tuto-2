package com.example.springtuto2.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BaseLegale{
    private String Ref;
    private String name;
    private String desc;
    private Long id;


    public BaseLegale(String ref, String name,String desc) {
        Ref = ref;
        this.name = name;
        this.desc = desc;
    }

    public BaseLegale() {

    }


    public String getRef() {
        return Ref;
    }

    public void setRef(String ref) {
        Ref = ref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "BaseLegale{" +
                ", Ref='" + Ref + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public static List<BaseLegale> findAll() {
        List<BaseLegale> list = new ArrayList<BaseLegale>();
        list.add(new BaseLegale("0111l00","Inès","150sdsqd"));
        list.add(new BaseLegale("021452K","Elodie","test"));
        return list;
    }
}
