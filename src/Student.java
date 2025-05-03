import java.io.Serializable;

public class Student implements Comparable<Student>, Serializable{
    private int Id;
    private String name;

    public Student(int Id, String name) {
        this.Id = Id;
        this.name = name;
    }

    @Override
    public String toString() {
        return Id + "\t" + name;
    }

    @Override
    public int compareTo(Student o) {
        return this.Id - o.Id;
    }
}