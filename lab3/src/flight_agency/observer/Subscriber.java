package flight_agency.observer;

import flight_agency.chain_of_responsibility.BookingRequest;

public interface Subscriber {
    void update(BookingRequest bookingRequest);
}
