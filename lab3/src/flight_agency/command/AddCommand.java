package flight_agency.command;

public class AddCommand extends BaseBookingCommand {
    @Override
    public void execute() {
        this.ledger.getBookings().add(request);
        this.ledger.notifySubscribers(request);
    }
}
