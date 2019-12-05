package com.sajjad.recyclerviewwithfragments.DataPackage;

public class DataModel {
    private int id,age;
    private String fullName;

    public DataModel(int id, int age, String fullName) {
        this.id = id;
        this.age = age;
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }
}
