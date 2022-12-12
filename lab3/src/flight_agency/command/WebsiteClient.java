package flight_agency.command;

import flight_agency.chain_of_responsibility.BookingComponent;
import flight_agency.chain_of_responsibility.BookingRequest;
import flight_agency.observer.Ledger;

public class WebsiteClient {
    Ledger ledger;
    BookingComponent checkRequestComponent;
    BookingCommand addCommand;
    BookingCommand removeCommand;

    public WebsiteClient(Ledger ledger, BookingComponent checkRequestComponent) {
        this.ledger = ledger;
        this.checkRequestComponent = checkRequestComponent;
        this.addCommand = new AddCommand();
        this.removeCommand = new RemoveCommand();
        this.addCommand.setLedger(this.ledger);
        this.removeCommand.setLedger(this.ledger);
    }

    public void registerRequest(BookingRequest request) {
        String success = checkRequestComponent.handle(request);
        if (success == "OK") {
            this.addCommand.setRequest(request);
            this.addCommand.execute();
        }
    }

    public void removeRequest(BookingRequest request) {
        this.removeCommand.setRequest(request);
        this.removeCommand.execute();
    }
}
