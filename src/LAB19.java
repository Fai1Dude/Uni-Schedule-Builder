import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class LAB19 {
    public static void main(String[] args) {
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("C:/Users/Faisal/Downloads/NEWNEW/src/unsortedStudents.dat"));
            Student[] Stu = (Student[])(input.readObject());
            Arrays.sort(Stu);
            input.close();
            try {
                ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("sortedStudents.dat"));
                writer.writeObject(Stu);
                writer.close();
            } catch (FileNotFoundException ex) {
                    System.out.println(ex);
            }
             catch (IOException ex) {
                System.out.println(ex);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
                    
    }
}