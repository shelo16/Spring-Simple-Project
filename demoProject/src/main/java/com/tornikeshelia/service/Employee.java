package com.tornikeshelia.service;

public class Employee {
    private int age;
    private String name;
    private String surName;
    private String bio;
    private int id;

    public Employee(String name, String surName,  int age, String bio) {
        this.age = age;
        this.name = name;
        this.surName = surName;
        this.bio = bio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee todoItem = (Employee) o;

        return id == todoItem.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
