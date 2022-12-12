package flight_agency.chain_of_responsibility;

public class ResolveOriginHandler implements BookingComponent{
    BookingComponent nextHandler;
    AirPortList airPortList;
    public ResolveOriginHandler(AirPortList airPortList) {
        this.airPortList = airPortList;
    }
    @Override
    public String handle(BookingRequest request) {
        if (!airPortList.list.contains(request.origin))
            return "non-existent-origin";
        return nextHandler.handle(request);
    }

    @Override
    public void nextHandler(BookingComponent nextHandler) {
        this.nextHandler = nextHandler;
    }
}
