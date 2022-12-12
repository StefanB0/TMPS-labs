package flight_agency.chain_of_responsibility;

public interface BookingComponent {
    String handle(BookingRequest request);
    void nextHandler(BookingComponent nextHandler);
}
