package hotel.soap;

import java.util.Date;

public class HotelBooking {

    private Person person;

    private HotelRoom hotelRoom;

    private Date dateArrival;

    private Date dateDeparture;

    public HotelBooking() {
    }

    public HotelBooking(Person person, HotelRoom hotelRoom, Date dateArrival, Date dateDeparture) {
        this.person = person;
        this.hotelRoom = hotelRoom;
        this.dateArrival = dateArrival;
        this.dateDeparture = dateDeparture;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public HotelRoom getHotelRoom() {
        return hotelRoom;
    }

    public void setHotelRoom(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
    }

    public Date getDateArrival() {
        return dateArrival;
    }

    public void setDateArrival(Date dateArrival) {
        this.dateArrival = dateArrival;
    }

    public Date getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(Date dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

}
