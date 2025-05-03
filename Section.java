package com.example;

public class Section {
    
    private Course course;
    private String time;
    private String Location;
    private String status;
    private String waitlist;
    private String sec ;
    private String activity;
    private String courseFullName;
    private String instructor;
    private String name;
    private String Crn;


    // constructor with only nessesary values
    public Section(Course course,String name,String time,String location){
        this.course = course;
        this.name = name;
        this.time = time;
        this.Location = location;

    }
    // constructor with all values
    public Section(Course course,String name,String activity,String Crn,String courseFullName,String instructor,String time,String location,String stauts,
                    String waitlist){
        this.course = course;
        this.name = name;
        this.activity = activity;
        this.Crn = Crn;
        this.courseFullName = courseFullName;
        this.instructor = instructor;
        this.time = time;
        this.Location = location;
        this.status = stauts;
        this.waitlist = waitlist;

    }

    public Course getCourse(){
        return course;
    }
    // to string method
    public String toString(){
        return name + " " + time + " " + Location;
    }

}
