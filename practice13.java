import java.util.*;
class Students{
    String id;
    String name;
    double cgpa;
    public Students(String id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public String toString(){
        return "ID: " + id + ", Name: " + name + ", CGPA: " + cgpa;
    }
}
class Database{
    HashMap<String,Students> db = new HashMap<>();
    public void addStudent(String id, String name, double cgpa){
        Students s = new Students(id,name,cgpa);
        db.put(id,s);
    }
    public void getdetails(String id){
        if(db.containsKey(id)){
            System.out.println(db.get(id));
        }else{
            System.out.println("Student not found");
        }
    }
    public void updatedata(String id, String name, double cgpa){
        if(db.containsKey(id)){
            Students s = db.get(id);
            s.name = name;
            s.cgpa = cgpa;
        }else{
            System.out.println("Student not found");
        }
    }
}
public class practice13 {
   public static void main(String[] args){
        Database db = new Database();
        db.addStudent("1", "John", 3.5);
        db.addStudent("2", "Jane", 3.8);
        db.getdetails("1");
        db.updatedata("1", "John Doe", 3.9);
        db.getdetails("1");
        db.getdetails("3");
   }
}
