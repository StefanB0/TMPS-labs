package flight_agency.strategy;

import flight_agency.chain_of_responsibility.BookingRequest;
import flight_agency.observer.AirPort;

public interface AirPortStrategy {
    void processRequest(BookingRequest request);
    void setParent(AirPort airPort);
}
