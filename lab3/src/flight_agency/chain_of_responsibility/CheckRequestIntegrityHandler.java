package flight_agency.chain_of_responsibility;

public class CheckRequestIntegrityHandler implements BookingComponent{
    BookingComponent nextHandler;

    @Override
    public String handle(BookingRequest request) {
        if (request.clientName == "" || request.origin == "" || request.destination == "")
            return "incorrect request";
        return nextHandler.handle(request);
    }

    @Override
    public void nextHandler(BookingComponent nextHandler) {
        this.nextHandler = nextHandler;
    }
}
