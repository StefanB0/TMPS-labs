package flight_agency.strategy;

import flight_agency.chain_of_responsibility.BookingRequest;
import flight_agency.observer.AirPort;

public class BaseAirportStrategy implements AirPortStrategy {

    AirPort parent;
    @Override
    public void processRequest(BookingRequest request) {}

    void addToParent(BookingRequest request) {
        parent.getBookings().add(request);
    }

    @Override
    public void setParent(AirPort airPort) {
        this.parent = airPort;
    }

}
