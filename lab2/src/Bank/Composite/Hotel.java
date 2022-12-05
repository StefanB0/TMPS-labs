package Bank.Composite;

// Client
public class Hotel {
    private String name;
    private float rate = 0;

    public Hotel(String name, float rate) {
        this.name = name;
        this.rate = rate;
    }

    public void lendRoom(RoomLendee lendee, int days) {
        lendee.rentRoom(days, this.rate, this.name);
    }

    public String getName() {
        return this.name;
    }

    public float getRate() {
        return this.rate;
    }


}
