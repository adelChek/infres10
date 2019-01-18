package hotel.soap;


import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "HotelService")
public class HotelWebService {

    private List<Person> persons;
    private List<HotelBooking> bookings;
    private List<HotelRoom> hotelRooms;


    public HotelWebService() {
        persons = new ArrayList<Person>();

        persons.add(new Person("Thomas"));
        persons.add(new Person("David"));
        persons.add(new Person("Samantha"));

        hotelRooms = new ArrayList<HotelRoom>();
        hotelRooms.add(new HotelRoom());
    }

    @WebMethod
    public HotelBooking book(Person person, HotelRoom hotelRoom, Date dateArrival, Date dateDeparture){

        return new HotelBooking(person, hotelRoom, dateArrival, dateDeparture);
    }


}
