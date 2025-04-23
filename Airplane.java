public class Airplane {
    String flightNumber;
    String destination;
    String departureTime;

    public Airplane(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public void checkStatus() {
        System.out.println("Flight " + flightNumber + " to " + destination + " departs at " + departureTime);
    }

    public void delayFlight(String newTime) {
        departureTime = newTime;
        System.out.println("Flight delayed. New departure time: " + departureTime);
    }

    // Main method here
    public static void main(String[] args) {
        Airplane plane = new Airplane("AI203", "New York", "10:30 AM");

        plane.checkStatus();             // Original status
        plane.delayFlight("12:00 PM");   // Delay flight
        plane.checkStatus();             // Updated status
    }
}
