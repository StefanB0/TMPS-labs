package flight_agency.chain_of_responsibility;

public class ResolveDestinationHandler implements BookingComponent{
    BookingComponent nextHandler;
    AirPortList airPortList;
    public ResolveDestinationHandler(AirPortList airPortList) {
        this.airPortList = airPortList;
    }
    @Override
    public String handle(BookingRequest request) {
        if (!airPortList.list.contains(request.destination))
            return "non-existent-destination";
        return nextHandler.handle(request);
    }

    @Override
    public void nextHandler(BookingComponent nextHandler) {
        this.nextHandler = nextHandler;
    }
}
