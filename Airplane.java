public class Airplane {
    private String flightNumber, destination, departureTime;
    private boolean isDelayed;
    
    public Airplane(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.isDelayed = false;
    }
    
    public void delayFlight(int minutes) {
        isDelayed = true;
        System.out.println("Flight " + flightNumber + " delayed by " + minutes + " minutes");
    }
    
    public void checkStatus() {
        System.out.println("Flight Status:\nFlight Number: " + flightNumber + 
                          "\nDestination: " + destination + "\nDeparture Time: " + departureTime + 
                          "\nStatus: " + (isDelayed ? "Delayed" : "On Time"));
    }
    
    public static void main(String[] args) {
        Airplane flight = new Airplane("AA123", "New York", "10:00 AM");
        flight.checkStatus();
        flight.delayFlight(30);
        flight.checkStatus();
    }
} 