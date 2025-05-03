package com.example;

import javafx.event.EventHandler;
//import java.io.*;
//import java.util.Arrays;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
//import javafx.scene.control.Label;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.TilePane;
//import javafx.scene.transform.Scale;
import javafx.stage.Stage;
/**
 * JavaFX App
 */
public class project extends Application {

    public static int removeNumeric1(String s) {
        //String num2 = s.replaceAll("[-]", "");
        int timeint = removeNumeric1(s.substring(14, Math.min(s.length(), 23)));
        return Integer.valueOf(timeint);
    }


    public static String removeNumeric(String s) {
        String upToNCharacters = s.substring(0, Math.min(s.length(), 10));
        System.out.println(upToNCharacters);

        return upToNCharacters; 
    }


    Scene sc1, sc2;
    int j = 0;

    @Override
    public void start(Stage primaryStage) throws InterruptedException {


        ArrayList<Course> plan = DegreePlanReader("D:\\Desktop\\Uni\\ICS108\\project\\project\\src\\main\\resources\\DegreePlanFinal.csv");
        System.out.println(plan);
        Student stu = StudentReader("D:\\Desktop\\Uni\\ICS108\\project\\project\\src\\main\\resources\\FinishedCourses final.csv", plan);
        System.out.println(stu);
        ArrayList<Section> sections = CourseOfferingReader("D:\\Desktop\\Uni\\ICS108\\project\\project\\src\\main\\resources\\CourseOffering.csv", plan, stu);
        System.out.println(sections);
    
        //scene 1

        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(10,10,10,10));
        
        Label Title = new Label("Add Sections to basket");
        Button saved = new Button("start with a saved schedule");
        saved.setPadding(new Insets(5, 5, 5, 5));

        HBox root = new HBox();  
        root.getChildren().addAll(Title,saved);  
        root.setSpacing(325);  
        pane.setTop(root);


        Button next = new Button("next");
        pane.setBottom(next);
        next.setPadding(new Insets(5, 5, 5, 5));
        BorderPane.setAlignment(next, Pos.CENTER_RIGHT);

        
        
        
        //-----------------------------------------------------------
        //all avilable courses
        GridPane pane1 = new GridPane();
        
        Schedule schedule = new Schedule(222, stu);

        VBox chosenc1 = new VBox();  
        //chosenc1.setSpacing(30);
        
        ArrayList<Button> butt; 
        butt = new ArrayList<Button>();
        
        // buttons------------------------------------------------------
        Button[] x = new Button[55];
        for(int i = 0;i<55;i++){
            x[i] = new Button(i+"   ");
            x[i].setPadding(new Insets(5, 5, 5, 5));
        }

        //-----------------------------------------------------------
        Label am7 = new Label("7am");
        HBox H7 = new HBox();  
        H7.getChildren().addAll(am7,x[0],x[1],x[2],x[3],x[4]);  
        H7.setSpacing(90);  
        
        Label am8 = new Label("8am");
        HBox H8 = new HBox();  
        H8.getChildren().addAll(am8,x[5],x[6],x[7],x[8],x[9]);  
        H8.setSpacing(90);  
        
        Label am9 = new Label("9am");
        HBox H9 = new HBox();  
        H9.getChildren().addAll(am9,x[10],x[11],x[12],x[13],x[14]);  
        H9.setSpacing(90);  
        
        Label am10 = new Label("10am");
        HBox H10 = new HBox();  
        H10.getChildren().addAll(am10,x[15],x[16],x[17],x[18],x[19]);  
        H10.setSpacing(89);  
        
        Label am11 = new Label("11am");
        HBox H11 = new HBox();  
        H11.getChildren().addAll(am11,x[20],x[21],x[22],x[23],x[24]); 
        H11.setSpacing(89);  
        
        Label am12 = new Label("12am");
        HBox H12 = new HBox();  
        H12.getChildren().addAll(am12,x[25],x[26],x[27],x[28],x[29]);  
        H12.setSpacing(89);  
        
        Label pm1 = new Label("1pm");
        HBox H13 = new HBox();  
        H13.getChildren().addAll(pm1,x[30],x[31],x[32],x[33],x[34]);  
        H13.setSpacing(90);  
        
        Label pm2 = new Label("2pm");
        HBox H14 = new HBox();  
        H14.getChildren().addAll(pm2,x[35],x[36],x[37],x[38],x[39]);   
        H14.setSpacing(90);  
        
        Label pm3 = new Label("3pm");
        HBox H15 = new HBox();  
        H15.getChildren().addAll(pm3,x[40],x[41],x[42],x[43],x[44]);   
        H15.setSpacing(90);  
        
        Label pm4 = new Label("4pm");
        HBox H16 = new HBox();  
        H16.getChildren().addAll(pm4,x[45],x[46],x[47],x[48],x[49]);   
        H16.setSpacing(90);  
        
        Label pm5 = new Label("5pm");
        HBox H17 = new HBox();  
        H17.getChildren().addAll(pm5,x[50],x[51],x[52],x[53],x[54]);   
        H17.setSpacing(90);





        for(int i=0;i<sections.size();i++){
            Label c1 = new Label(sections.get(i).toString());
            Button Add = new Button("Add");
            Add.setPadding(new Insets(5, 5, 5, 5));
            Button Remove = new Button("Remove");
            Remove.setPadding(new Insets(5, 5, 5, 5));
            int num = i;
            

            EventHandler<ActionEvent> Add1 = new EventHandler<ActionEvent>() {
                public void handle(ActionEvent e)
                {
                    
                    Add.setText("Course Added");
                    schedule.addSection(sections.get(num));

                    
                    butt.add(new Button(schedule.getSections().get(j).toString()));
                    butt.get(j).setPadding(new Insets(10, 10, 10, 10));
                    chosenc1.getChildren().add(butt.get(j));
                    System.out.println(butt);

                        
                    EventHandler<ActionEvent> nex2 = new EventHandler<ActionEvent>() {
                        public void handle(ActionEvent e)
                        {
                            x[10].setText("ICS 108\n             del");
                            x[15].setText("ICS 108\n             del");
                            x[20].setText("ICS 108\n             del");
            
                            EventHandler<ActionEvent> iCS10801del = new EventHandler<ActionEvent>() {
                                public void handle(ActionEvent e)
                                {
                                    x[10].setText("10");
                                    x[15].setText("15");
                                    x[20].setText("20");
            
                                }
                            };
                            x[10].setOnAction(iCS10801del);
                            x[15].setOnAction(iCS10801del);
                            x[20].setOnAction(iCS10801del);
                        }
                    };
                    butt.get(j).setOnAction(nex2);
                    j++;
                    
                }
            };

            Add.setOnAction(Add1);

            EventHandler<ActionEvent> Remove1 = new EventHandler<ActionEvent>() {
                public void handle(ActionEvent e)
                {
                    //Remove.setText("Course Removed");
                    Add.setText("Add");
                    schedule.removeSection(sections.get(num));
                }
            };
            Remove.setOnAction(Remove1);

            HBox course1 = new HBox();  
            course1.setSpacing(0);  
            course1.getChildren().addAll(c1,Add,Remove); 
            pane1.add(course1, 3, i+2);
        }
        pane.setCenter(pane1);



        //-----------------------------------------------------------

        EventHandler<ActionEvent> starts = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
         
            }
        };
        saved.setOnAction(starts);
        EventHandler<ActionEvent> NextScene = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                primaryStage.setScene(sc2);
            }
        };
        next.setOnAction(NextScene);
        


        sc1 = new Scene(pane,625, 800);
        
        //Scene 2
        BorderPane sc2P = new BorderPane();
        pane.setPadding(new Insets(10,10,10,10));

        Label days = new Label("                                Sunday                  Monday                   Tuseday                  Wednesday                   Thursday");  
        days.setPadding(new Insets(5, 5, 5, 5));
        sc2P.setTop(days);
        BorderPane.setAlignment(days, Pos.TOP_LEFT);
        // // buttons------------------------------------------------------
        // Button[] x = new Button[55];
        // for(int i = 0;i<55;i++){
        //     x[i] = new Button(i+"   ");
        //     x[i].setPadding(new Insets(5, 5, 5, 5));
        // }

        // //-----------------------------------------------------------
        // Label am7 = new Label("7am");
        // HBox H7 = new HBox();  
        // H7.getChildren().addAll(am7,x[0],x[1],x[2],x[3],x[4]);  
        // H7.setSpacing(90);  
        
        // Label am8 = new Label("8am");
        // HBox H8 = new HBox();  
        // H8.getChildren().addAll(am8,x[5],x[6],x[7],x[8],x[9]);  
        // H8.setSpacing(90);  
        
        // Label am9 = new Label("9am");
        // HBox H9 = new HBox();  
        // H9.getChildren().addAll(am9,x[10],x[11],x[12],x[13],x[14]);  
        // H9.setSpacing(90);  
        
        // Label am10 = new Label("10am");
        // HBox H10 = new HBox();  
        // H10.getChildren().addAll(am10,x[15],x[16],x[17],x[18],x[19]);  
        // H10.setSpacing(89);  
        
        // Label am11 = new Label("11am");
        // HBox H11 = new HBox();  
        // H11.getChildren().addAll(am11,x[20],x[21],x[22],x[23],x[24]); 
        // H11.setSpacing(89);  
        
        // Label am12 = new Label("12am");
        // HBox H12 = new HBox();  
        // H12.getChildren().addAll(am12,x[25],x[26],x[27],x[28],x[29]);  
        // H12.setSpacing(89);  
        
        // Label pm1 = new Label("1pm");
        // HBox H13 = new HBox();  
        // H13.getChildren().addAll(pm1,x[30],x[31],x[32],x[33],x[34]);  
        // H13.setSpacing(90);  
        
        // Label pm2 = new Label("2pm");
        // HBox H14 = new HBox();  
        // H14.getChildren().addAll(pm2,x[35],x[36],x[37],x[38],x[39]);   
        // H14.setSpacing(90);  
        
        // Label pm3 = new Label("3pm");
        // HBox H15 = new HBox();  
        // H15.getChildren().addAll(pm3,x[40],x[41],x[42],x[43],x[44]);   
        // H15.setSpacing(90);  
        
        // Label pm4 = new Label("4pm");
        // HBox H16 = new HBox();  
        // H16.getChildren().addAll(pm4,x[45],x[46],x[47],x[48],x[49]);   
        // H16.setSpacing(90);  
        
        // Label pm5 = new Label("5pm");
        // HBox H17 = new HBox();  
        // H17.getChildren().addAll(pm5,x[50],x[51],x[52],x[53],x[54]);   
        // H17.setSpacing(90);  
        



            //-------------------------------------------------------------------------
        Button savesced = new Button("Save Schedule");
        savesced.setPadding(new Insets(10, 10, 10, 10));
        EventHandler<ActionEvent> savescedb = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                try (FileOutputStream fileOutputStream = new FileOutputStream("SavedSchudule.dat")){
                    ObjectOutputStream objOutStream = new ObjectOutputStream(fileOutputStream);
                    objOutStream.writeObject(schedule);
                    objOutStream.close();
                    
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        };
        savesced.setOnAction(savescedb);
        EventHandler<ActionEvent> saveSchudule = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                try (FileInputStream fileInputStream = new FileInputStream("SavedSchudule.dat")) {
                    ObjectInputStream objInStream = new ObjectInputStream(fileInputStream);
                    Schedule scheduleNew = (Schedule) objInStream.readObject();
                    schedule.changeSchudule(scheduleNew.getSections());
                    
                    
                } catch (Exception ey) {
                    System.out.println(ey);
                }
            }
        };
        saved.setOnAction(saveSchudule);

        chosenc1.getChildren().add(savesced);

         
        

        VBox D1 = new VBox();  
        D1.setSpacing(40);  
        D1.getChildren().addAll(H7,H8,H9,H10,H11,H12,H13,H14,H15,H16,H17); 
        
        sc2P.setCenter(D1);
        sc2P.setRight(chosenc1);
        





        sc2 = new Scene(sc2P,900, 800);
        //-------------------------------------------------------------------------------------
        
        primaryStage.setTitle("project");
        primaryStage.setScene(sc1);
        primaryStage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    }






            
    

    // loads the file and makes the courses and returns them as a Arraylist
    public static ArrayList<Course> DegreePlanReader(String filename){

        File plan = new File(filename);
        ArrayList<Course>list = new ArrayList<>();

        try (Scanner input = new Scanner(plan)) {

            input.nextLine();

            while (input.hasNextLine()){
                String[] line = (input.nextLine()).split(",");
                int credit = 0;

                switch (line[1]){
                    case "1": credit = 1;break;
                    case "2": credit = 2;break;
                    case "3": credit = 3;break;
                    case "4": credit = 4;break;
                }

                list.add(new Course(line[0], credit, line[2], line[3]));

            }
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return list;


    }

    // loads the file and makes only the section that can be enroled in and returns them as a Arraylist
    public static ArrayList<Section> CourseOfferingReader(String filename, ArrayList<Course> plan, Student student){

        File section = new File(filename);
        ArrayList<Section>list = new ArrayList<>();

        try (Scanner input = new Scanner(section)) {

            input.nextLine();

            while (input.hasNextLine()){
                String[] line = (input.nextLine()).split(",");

                for (int i = 0 ; i < plan.size();i++){
                    if (line[0].contains((plan.get(i)).toString())){
                        if (student.canTake(plan.get(i))){
                            list.add(new Section(plan.get(i),line[0],line[1],line[2],line[3],line[4], line[5] + " " + line[6],
                             line[7],line[8],line[9]));
                        }
                    }
                }
            }
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return list;


    }

    // makes the students and stores all finished courses and returns the student
    public static Student StudentReader(String filename, ArrayList<Course> plan){

        File finishedCourses = new File(filename);
        ArrayList<Course>list = new ArrayList<>();

        try (Scanner input = new Scanner(finishedCourses)) {


            while (input.hasNextLine()){
                String[] line = (input.nextLine()).split(",");

                for (int i = 0 ; i < plan.size();i++){
                    if (line[0].contains((plan.get(i)).toString())){
                        list.add(plan.get(i));
                    }
                }
            }

            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return new Student(list,plan);


    }

}
