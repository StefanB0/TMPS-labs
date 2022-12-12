package flight_agency.strategy;

import flight_agency.chain_of_responsibility.BookingRequest;

public class EmptyAirportStrategy extends BaseAirportStrategy {

    @Override
    public void processRequest(BookingRequest request) {
        request.setPrice(29.99);
        this.addToParent(request);
    }
}
