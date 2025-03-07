// class Person {
//     String name;
//     int age;
//     String gender;

//     public Person(String name,int age,String gender) {
//         this.name = name;
//         this.age = age;
//         this.gender = gender;
//     }
//     public void Details() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Gender: " + gender);
//     }
// }
// class Employee extends Person {
//     int employeeId;
//     String department;
//     double salary;

//     public Employee(String name,int age,String gender,int employeeId,String department,double salary) {
//         super(name, age, gender);//to line 6
//         this.employeeId = employeeId;
//         this.department = department;
//         this.salary = salary;
//     }
//     public void EmployeeDetails() {
//         Details();
//         System.out.println("Employee ID: " + employeeId);
//         System.out.println("Department: " + department);
//         System.out.println("Salary: $" + salary);
//     }
// }
// public class w2_1 {
//     public static void main(String[] args) {
//         Employee emp = new Employee("Krishna", 17, "male", 1, "Cse", 60000.00);
//         System.out.println("Employee Details:");
//         emp.EmployeeDetails();
//     }
// }
