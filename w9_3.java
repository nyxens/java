import java.util.*;
class Student implements Comparable<Student>{

    int rollNumber;
    int marks;
    String name;

    public Student(int rollNumber,String name,int marks){
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
    public int compareTo(Student other){
        if(this.marks != other.marks){
            return Integer.compare(this.marks,other.marks);
        }else{
            return this.name.compareTo(other.name);
        }
    }
    public boolean equals(Object o){
        if(this == o) 
            return true;
        if(o == null || getClass() != o.getClass()) 
            return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber;
    }
    public int hashCode(){
        return Objects.hash(rollNumber);
    }
    public String toString(){
        return "Roll Number: " + rollNumber + ", Name: " + name + ", Marks: " + marks;
    }
}
public class w9_3{
    public static void main(String[] args){
        TreeSet<Student> students = new TreeSet<>();

        students.add(new Student(1, "Alice", 85));
        students.add(new Student(2, "Adam", 85));
        students.add(new Student(3, "Bob", 75));
        students.add(new Student(4, "Charlie", 90));
        students.add(new Student(5, "David", 90));
        students.add(new Student(6, "Eve", 95));

        System.out.println("Result:");
        for(Student student : students){
            System.out.println(student);
        }
    }
} 