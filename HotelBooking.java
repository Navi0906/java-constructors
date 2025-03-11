public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking(){
        this.guestName = "Dhruv";
        this.roomType = "Honeymmoon";
        this.nights = 2;
    }

    HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking other){
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    void display(){
        System.out.println("Room type "+roomType+" is booked by "+guestName+" for "+nights+" nights");
    }

    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking();
        HotelBooking h2 = new HotelBooking("Madhav", "Suite", 1);
        HotelBooking h3 = new HotelBooking(h2);

        h1.display();
        h2.display();
        h3.display();
    }
}
