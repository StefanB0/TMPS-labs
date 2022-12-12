package flight_agency.command;

import flight_agency.chain_of_responsibility.BookingRequest;
import flight_agency.observer.Ledger;

public class BaseBookingCommand implements BookingCommand {
    Ledger ledger;
    BookingRequest request;

    @Override
    public void setLedger(Ledger ledger) {
        this.ledger = ledger;
    }

    @Override
    public void setRequest(BookingRequest request) {
        this.request = request;
    }

    @Override
    public void execute() {}
}
