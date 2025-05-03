package com.example;

import java.io.Serializable;
import java.util.ArrayList;

public class Schedule implements Serializable {
    
    private int term;
    private ArrayList<Section> sectionsArray;
    private Student student;

    public Schedule(int term,Student student){
        this.term = term;
        this.student = student;
        this.sectionsArray = new ArrayList<Section>();
    }

    public Schedule(int term,ArrayList<Section> sectionsArray,Student student){
        this.term = term;
        this.sectionsArray = sectionsArray;
        this.student = student;
    }

    public void addSection(Section section){
        sectionsArray.add(section);
    }

    public void removeSection(Section section){
        sectionsArray.remove(section);
    }

    public void changeSchudule(ArrayList<Section> a){
        this.sectionsArray = a;
    }

    public ArrayList<Section> getSections(){
        return sectionsArray;
    }

    public int getTerm(){
        return term;
    }

    public void changeTerm(int newTerm){
        this.term = newTerm;
    }

    public boolean coReqCheck(Course course){
        for (int i = 0;i<sectionsArray.size();i++){
            if (course.getCoReq().contains(sectionsArray.get(i).getCourse().toString()))
                return true;
        }
        for (int j = 0;j<student.getCourses().size();j++){
            if (course.getCoReq().contains(student.getCourses().get(j).toString()))
                return true;
        }
        return false;
    }


}
