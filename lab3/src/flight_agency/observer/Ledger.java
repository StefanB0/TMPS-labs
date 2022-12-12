package flight_agency.observer;

import flight_agency.chain_of_responsibility.BookingRequest;

import java.util.ArrayList;
import java.util.List;

public class Ledger {
    List<BookingRequest> bookings;
    List<Subscriber> subscribers;
    public Ledger() {
        this.bookings = new ArrayList<>();
        this.subscribers = new ArrayList<>();
    }
    public List<BookingRequest> getBookings() {
        return bookings;
    }

    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }
    public void removeSubscriber(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void notifySubscribers(BookingRequest bookingRequest) {
        for (Subscriber subscriber: subscribers) {
            subscriber.update(bookingRequest);
        }
    }
}
