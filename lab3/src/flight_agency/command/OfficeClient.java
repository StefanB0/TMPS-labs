package flight_agency.command;

import flight_agency.chain_of_responsibility.BookingRequest;
import flight_agency.observer.Ledger;

public class OfficeClient {
    Ledger ledger;
    BookingCommand addCommand;
    BookingCommand removeCommand;

    public OfficeClient(Ledger ledger) {
        this.ledger = ledger;
        this.addCommand = new AddCommand();
        this.removeCommand = new RemoveCommand();
        this.addCommand.setLedger(this.ledger);
        this.removeCommand.setLedger(this.ledger);
    }

    public void registerRequest(BookingRequest request) {
        this.addCommand.setRequest(request);
        this.addCommand.execute();
    }

    public void removeRequest(BookingRequest request) {
        this.removeCommand.setRequest(request);
        this.removeCommand.execute();
    }
}
