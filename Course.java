package com.example;

public class Course {

    private String preReq;
    private String coReq;
    private String name;
    private int credit;

    public Course(String name, int credit, String preReq, String coReq){
        this.name = name;
        this.credit = credit;
        this.preReq = preReq;
        this.coReq = coReq;
    }

    public String getpreReq(){
        return preReq;
    }

    public String getCoReq(){
        return coReq;
    }

    public String toString(){
        return name;
    }
}
