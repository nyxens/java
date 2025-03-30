import java.util.*;
class Flight{
    String flightNo;
    String destination;
    int duration;
    public Flight(String flightNo,String destination,int duration){
        this.flightNo = flightNo;
        this.destination = destination;
        this.duration = duration;
    }
    public String toString(){
        return flightNo+" to "+destination+" ("+duration+" min)";
    }
}
class AirportFlightManagement{
    TreeMap<String,Flight> flights = new TreeMap<>();
    public void addFlight(String time,String flightNo,String destination,int duration){
        flights.put(time,new Flight(flightNo,destination,duration));
    }
    public void removeFlight(String time){
        flights.remove(time);
    }
    public void displayAllFlights(){
        System.out.println("Flights in order of departure:");
        for(Map.Entry<String,Flight> entry : flights.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
    }
    public int getTotalFlights(){
        return flights.size();
    }
    public void getEarlyandLate(){
        if(flights.isEmpty()){
            System.out.println("No flights available.");
            return;
        }
        Map.Entry<String,Flight> earliest = flights.firstEntry();
        Map.Entry<String,Flight> latest = flights.lastEntry();
        System.out.println("Earliest flight: "+earliest.getValue().destination+" at "+earliest.getKey());
        System.out.println("Latest flight: "+latest.getValue().destination+" at "+latest.getKey());
    }
    public int getTotalDuration(String destination){
        int totalDuration = 0;
        for(Flight flight : flights.values()){
            if(flight.destination.equalsIgnoreCase(destination)){
                totalDuration += flight.duration;
            }
        }
        return totalDuration;
    }
}
public class w10_2{
    public static void main(String[] args){
        AirportFlightManagement airport = new AirportFlightManagement();
        airport.addFlight("08:30","AB123","New York",420);
        airport.addFlight("10:15","BC202","London",360);
        airport.addFlight("12:00","CD303","Paris",150);
        airport.addFlight("15:45","DE404","Dubai",300);
        airport.addFlight("18:20","EF505","New York", 450);
        airport.displayAllFlights();
        System.out.println("Total flights: " + airport.getTotalFlights());
        airport.getEarlyandLate();
        System.out.println("Total duration: "+airport.getTotalDuration("New York")+" minutes");
        System.out.println("Flight at 12:00 removed.");
        airport.removeFlight("12:00");
        airport.displayAllFlights();
    }
}