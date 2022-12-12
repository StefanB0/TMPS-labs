import flight_agency.chain_of_responsibility.*;
import flight_agency.observer.AirPort;
import flight_agency.observer.Ledger;
import flight_agency.command.OfficeClient;
import flight_agency.command.WebsiteClient;

public class Main {
    public static void main(String[] args) {
        // Chain of responsibility
        System.out.println("===Chain of responsibility===");
        AirPortList airportList = new AirPortList();
        airportList.add("Bucuresti");
        airportList.add("London");
        airportList.add("Moscow");

        BookingComponent hintegrity = new CheckRequestIntegrityHandler();
        BookingComponent horigin = new ResolveOriginHandler(airportList);
        BookingComponent hdestination = new ResolveDestinationHandler(airportList);
        BookingComponent hfinal = new FinalHandler();

        hintegrity.nextHandler(horigin);
        horigin.nextHandler(hdestination);
        hdestination.nextHandler(hfinal);

        BookingComponent checkRequest = hintegrity;

        BookingRequest request = new BookingRequest("Ana", "Bucuresti", "London");
        String success = checkRequest.handle(request);
        if (success == "OK") {
            System.out.println("Booking successful");
        }

        // Command
        System.out.println("\n===Command===");
        Ledger ledger = new Ledger();

        OfficeClient officeClient = new OfficeClient(ledger);
        WebsiteClient websiteClient = new WebsiteClient(ledger, checkRequest);

        officeClient.registerRequest(new BookingRequest("Marius", "Moscow", "London"));
        websiteClient.registerRequest(new BookingRequest("Natali", "Moscow", "London"));
        websiteClient.registerRequest(new BookingRequest("Gheorghe", "Moscow", "Paris"));

        for (BookingRequest r : ledger.getBookings()) {
            r.print();
        }

        // Observer + Strategy
        System.out.println("\n===Observer + Strategy===");
        Ledger sharedledger = new Ledger();

        AirPort airPortLondon = new AirPort("London", 4);
        AirPort airPortMoscow = new AirPort("Moscow", 4);

        sharedledger.addSubscriber(airPortLondon);
        sharedledger.addSubscriber(airPortMoscow);

        officeClient = new OfficeClient(sharedledger);
        websiteClient = new WebsiteClient(sharedledger, checkRequest);

        officeClient.registerRequest(new BookingRequest("Marius", "Moscow", "London"));
        websiteClient.registerRequest(new BookingRequest("Natali", "Moscow", "London"));
        websiteClient.registerRequest(new BookingRequest("Gheorghe", "London", "Bucuresti"));
        officeClient.registerRequest(new BookingRequest("Ivan", "Moscow", "London"));
        websiteClient.registerRequest(new BookingRequest("Bogdan", "Moscow", "London"));
        websiteClient.registerRequest(new BookingRequest("Sandu", "London", "Bucuresti"));

        System.out.println("London airport:");
        for (BookingRequest r : airPortLondon.getBookings()) {
            r.print();
        }

        System.out.println("\nMoscow airport:");
        for (BookingRequest r : airPortMoscow.getBookings()) {
            r.print();
        }

        // Memento
    }
}