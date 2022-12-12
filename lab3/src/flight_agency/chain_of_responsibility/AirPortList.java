package flight_agency.chain_of_responsibility;

import java.util.LinkedList;

public class AirPortList {
    LinkedList<String> list;
    public AirPortList() {
        this.list = new LinkedList<>();
    }
    public void add(String airportID) {
        list.add(airportID);
    }
}
