package flight_agency.command;

import flight_agency.chain_of_responsibility.BookingRequest;
import flight_agency.observer.Ledger;

public interface BookingCommand {
    void setLedger(Ledger l);
    void setRequest(BookingRequest request);
    void execute();
}
