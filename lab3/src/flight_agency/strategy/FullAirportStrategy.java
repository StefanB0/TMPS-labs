package flight_agency.strategy;

import flight_agency.chain_of_responsibility.BookingRequest;

public class FullAirportStrategy extends BaseAirportStrategy {

    @Override
    public void processRequest(BookingRequest request) {}
}
