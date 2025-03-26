import java.util.*;
public class w9_1{
    public static void main(String[] args){

        HashSet<String> Student = new HashSet<String>();

        Student.add("Alice");
        Student.add("Bob");
        Student.add("Charlie");
        Student.add("David");
        Student.add("Eve");

        System.out.println("Size of HashSet : " + Student.size());
        System.out.println("Charlie exists : " + Student.contains("Charlie"));
        Student.remove("Bob");
        System.out.println("Size of HashSet : " + Student.size());
        System.out.println("HashSet is Empty : " + Student.isEmpty());
        
        for(String s : Student){
            System.out.print(s + " ");
        }
        System.out.println();
        Iterator<String> itr = Student.iterator();
        while(itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        } 
        
        HashSet<String> newStudents = new HashSet<String>();

        newStudents.add("Alice");
        newStudents.add("Eve");
        newStudents.add("Frank");

        HashSet<String> commonStudents = new HashSet<String>();

        commonStudents.addAll(Student);
        commonStudents.retainAll(newStudents);

        Student.removeAll(commonStudents);

        System.out.println();

        Object print[] = new Object[Student.size()];
        print = Student.toArray();
        System.out.println("Array elements : " + Arrays.toString(print));

        Student.clear();
        System.out.println("Students : " + Student);

    }
} 