// class Employee{
//     String name;
//     int age;
//     final int salary;
//     public Employee(String name, int age,int salary) {
//         this.name = name;
//         this.age = age;
//         this.salary=salary;
//     }
//     public void display(){
//         System.out.println("Details : ");
//         System.out.println("name : "+name);
//         System.out.println("age : "+age);
//         System.out.println("salary : "+salary);
//     }
// }
// class Manager extends Employee{
//     String Department;
//     public Manager(String name,int age,int salary,String Department){
//         super(name,age,salary);
//         this.Department = Department;
//     }
//     public void display(){
//         System.out.println("Details : ");
//         System.out.println("name : "+name);
//         System.out.println("age : "+age);
//         System.out.println("salary : "+salary);
//         System.out.println("dept : "+Department);
//     }
// }
// public class w3_4 {
//     public static void main(String[] args) {
//         Employee employee = new Employee("krishna", 17, 15000);
//         Manager manager = new Manager("krishna", 17, 15000, "CSE");
//         employee.display();
//         manager.display();
//     }
// }
