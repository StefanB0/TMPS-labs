package flight_agency.chain_of_responsibility;

public class BookingRequest {
    String clientName;
    String origin;
    String destination;
    double price;

    public BookingRequest(String clientName, String origin, String destination) {
        this.clientName = clientName;
        this.origin = origin;
        this.destination = destination;
        price = 0;
    }

    public void print() {
        System.out.println(clientName + ": " + origin + " -> " + destination + " " + price + "$");
    }
    public String getDestination() {
        return destination;
    }
    public String getOrigin() {
        return origin;
    }
    public String getClientName() {
        return clientName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
