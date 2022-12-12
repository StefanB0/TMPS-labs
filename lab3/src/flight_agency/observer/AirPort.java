package flight_agency.observer;

import flight_agency.chain_of_responsibility.BookingRequest;
import flight_agency.strategy.AirPortStrategy;
import flight_agency.strategy.EmptyAirportStrategy;
import flight_agency.strategy.FullAirportStrategy;
import flight_agency.strategy.HalfAirportStrategy;

import java.util.ArrayList;
import java.util.List;

public class AirPort implements Subscriber {
    AirPortStrategy emptyStrategy, halfFullStrategy, FullStrategy;
    AirPortStrategy strategy;
    List<BookingRequest> bookings;
    String name;
    int capacity;
    public AirPort(String name, int capacity) {
        bookings = new ArrayList<>();
        this.name = name;
        this.capacity = capacity;
        this.emptyStrategy = new EmptyAirportStrategy();
        emptyStrategy.setParent(this);
        this.halfFullStrategy = new HalfAirportStrategy();
        halfFullStrategy.setParent(this);
        this.FullStrategy = new FullAirportStrategy();
        FullStrategy.setParent(this);
        this.strategy = emptyStrategy;
    }
    @Override
    public void update(BookingRequest bookingRequest) {
        if (bookingRequest.getOrigin() == name)
            strategy.processRequest(bookingRequest);

        if (bookings.size() >= capacity / 2)
            strategy = halfFullStrategy;
        if (bookings.size() >= capacity)
            strategy = FullStrategy;
    }
    public List<BookingRequest> getBookings() {
        return bookings;
    }

    void setStrategy(AirPortStrategy strategy) {
        this.strategy = strategy;
    }
}
