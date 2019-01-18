package hotel.soap;

import javax.xml.ws.Endpoint;


public class HotelWebServicePublisher {
    public static void main(String[] args) throws ClassNotFoundException {
        Endpoint.publish("http://localhost:9991/", new HotelWebService());
    }
}
