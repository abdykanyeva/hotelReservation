package model;

import java.util.Date;

public class Reservation {
    private Customer customer;
    private IRoom room;
    private Date checkInDate;
    private Date checkOutDate;

    public Reservation(String customer, IRoom room, Date checkInDate, Date checkOutDate) {
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }


    @Override
    public String toString(){
        return "Your room reserved";
    }


    public Date getCheckOutDate() {

        return this.checkOutDate;
    }

   public Date getCheckInDate(){
        return this.checkInDate;
   }

    public IRoom getRoom() {
        return this.room;
    }


    public Object getCustomer() {
        return this.customer;
    }
}
