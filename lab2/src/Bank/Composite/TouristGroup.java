package Bank.Composite;

import java.util.LinkedList;

public class TouristGroup implements RoomLendee {
    LinkedList<RoomLendee> members;

    public TouristGroup() {
        this.members = new LinkedList<>();
    }

    public void addMember(RoomLendee member){
        this.members.add(member);
    }

    @Override
    public void rentRoom(int days, float rate, String hotelName) {
        for (RoomLendee r: this.members) {
            r.rentRoom(days, rate / this.members.size(), hotelName);
        }
    }
}
