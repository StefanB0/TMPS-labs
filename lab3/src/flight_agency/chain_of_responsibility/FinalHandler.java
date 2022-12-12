package flight_agency.chain_of_responsibility;

public class FinalHandler implements BookingComponent {
    @Override
    public String handle(BookingRequest request) {
        return "OK";
    }

    @Override
    public void nextHandler(BookingComponent nextHandler) {
    }
}
