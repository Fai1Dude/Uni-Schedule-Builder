package com.example;

import java.util.ArrayList;

public class Student {
    private ArrayList<Course> courses;
    private ArrayList<Course> plan;

    public Student(ArrayList<Course> courses,ArrayList<Course> plan){
        this.courses = courses;
        this.plan = plan;
    }

    public ArrayList<Course> getCourses(){
        return courses;
    }

    public ArrayList<Course> getPlan(){
        return plan;
    }

    // check if student meets pre reذquasites
    public boolean canTake(Course course){
        if (courses.contains(course))
            return false;
        if (!plan.contains(course))
            return false;
        for (int i = 0; i<courses.size();i++){
            if (course.getpreReq().contains(courses.get(i).toString()))
                return true;
        }
        return false;
    }

    public String toString(){
        return courses.toString();
    }
}
