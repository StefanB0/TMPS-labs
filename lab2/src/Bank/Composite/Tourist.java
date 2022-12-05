package Bank.Composite;

import Bank.Bridge.DebitCard;

public class Tourist implements RoomLendee{
    DebitCard card;
    public Tourist(DebitCard card) {
        this.card = card;
    }

    public float getBalance() {
        return this.card.getBalance();
    }
    @Override
    public void rentRoom(int days, float rate, String hotelName) {
        this.card.pay(Float.valueOf(days) * rate, hotelName);
    }
}
