package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.BookedRoom;

/**
 * Package: HotelManagementClassDiagram.impl
 * Author: Joakim Berntsson
 * Date: 2015-12-09 - 13:45
 * Purpose: Factory class for all hotel related instances
 * @generated NOT
 */
public class FactoryImpl {

    /**
     * @generated NOT
     */
    public BookedRoom createBookedRoom(){
        return new BookedRoomImpl();
    }


}
