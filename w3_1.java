// class Vehicle{
//     String VehicleName;
//     String VehicleType;
//     String fuelType;
//     public Vehicle(String VehicleName,String VehicleType,String fuelType){
//         this.VehicleName = VehicleName;
//         this.VehicleType = VehicleType;
//         this.fuelType = fuelType;
//     }
//     public void displayDetails(){
//         System.out.println("Vehicle Details: ");
//         System.out.println("Vehicle name: "+VehicleName);
//         System.out.println("Vehicle type: "+VehicleType);
//         System.out.println("Fuel type: "+fuelType);
//     }
// }
// class Car extends Vehicle{
//     int noofdoors;
//     public Car(String VehicleName,String VehicleType,String fuelType,int noofdoors){
//         super(VehicleName, VehicleType, fuelType);
//         this.noofdoors = noofdoors;
//     }
//     public void displayDetails(){
//         System.out.println("Car Details: ");
//         System.out.println("Vehicle name: "+VehicleName);
//         System.out.println("Vehicle type: "+VehicleType);
//         System.out.println("Fuel type: "+fuelType);
//         System.out.println("No of Doors: "+ noofdoors);
//     }
// }
// class Bike extends Vehicle{
//     boolean hasCarrier;
//     public Bike(String VehicleName,String VehicleType,String fuelType,boolean hasCarrier){
//         super(VehicleName, VehicleType, fuelType);
//         this.hasCarrier = hasCarrier;
//     }
//     public void displayDetails(){
//         System.out.println("Bike Details: ");
//         System.out.println("Vehicle name: "+VehicleName);
//         System.out.println("Vehicle type: "+VehicleType);
//         System.out.println("Fuel type: "+fuelType);
//         System.out.println("Has Carrier: "+ hasCarrier);
//     }
// }
// public class w3_1 {
//     public static void main(String[] args) {
//         Car car = new Car("Toyota Corolla", "CAR", "Petrol", 4);
//         car.displayDetails();
//         Bike bike = new Bike("Yamaha FZ", "Bike", "Petrol", true);
//         bike.displayDetails();
//     }
// }
