package flight_agency.command;

public class RemoveCommand extends BaseBookingCommand {
    @Override
    public void execute() {
        this.ledger.getBookings().remove(request);
    }
}
