package com.example.springtuto2.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee {

    @Id
    private int rowIndex;

    private String name;
    private String surname;
    private int age;
    private boolean single;


    public Employee(int rowIndex, String name, String surname, int age, boolean single) {
        this.rowIndex = rowIndex;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.single = single;
    }

    public Employee() {
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "rowIndex=" + rowIndex +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", single=" + single +
                '}';
    }

    public static List<Employee> findAll() {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(1,"Ines","Bourhim",21,false));
        list.add(new Employee(2,"Pierre","Fevre",36,true));
        list.add(new Employee(3,"Elodie","Villard",36,true));
        list.add(new Employee(4,"Nassim","Bourhim",17,true));
        list.add(new Employee(5,"Travail","Code",36,true));
        return list;
    }

}
