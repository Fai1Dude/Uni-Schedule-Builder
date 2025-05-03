import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Lab25 {
    public static void main(String[] args) throws FileNotFoundException{

        Scanner input = new Scanner(new File("C:/Users/Faisal/Downloads/NEWNEW/studentsIds.txt"));
        TreeMap<String,TreeSet<Integer>> courses = new TreeMap<>();
        while(input.hasNext()){
            int id = input.nextInt();
            String course = input.next();
            if (courses.containsKey(course)){
                courses.get(course).add(id);}
            else{
                TreeSet<Integer> Ids = new TreeSet<>();
                Ids.add(id);
                courses.put(course,Ids);}
        }
        System.out.println(courses);
    }
}
