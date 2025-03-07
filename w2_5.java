// class Employee{
//     String name;
//     protected int age;
//     private int salary;

//     public Employee(String name, int age,int salary) {
//         this.name = name;
//         this.age = age;
//         this.salary=salary;
//     }
//     public int get_salary(){
//         return salary;
//     }
//     public void set_salary(int salary){
//         this.salary = salary;
//     }
// }
// class Manager extends Employee{
//     public Manager(String name,int age,int salary){
//         super(name,age,salary);
//     }
//     public void display(){
//         System.out.println("name : "+name);
//         System.out.println("age : "+age);
//         System.out.println("salary : "+get_salary());
//     }
// }
// public class w2_5 {
//     public static void main(String[] args) {
//         Manager manager = new Manager("krishna",17,10000);
//         System.out.println("details : ");
//         manager.display();

//         manager.set_salary(15000);
//         System.out.println("new details : ");
//         manager.display();
//     }
// }
