package com.example.mubarak.demo.model;

public class Renters {

    private int renterId;

    private String renterName;

    private String renterLocation;

    private String phoneNumber;



    public Renters(){}


    public Renters(int renterId, String renterName, String renterLocation, String phoneNumber) {
        this.renterId = renterId;
        this.renterName = renterName;
        this.renterLocation = renterLocation;
        this.phoneNumber = phoneNumber;
    }

    public int getRenterId() {
        return renterId;
    }

    public void setRenterId(int renterId) {
        this.renterId = renterId;
    }

    public String getRenterName() {
        return renterName;
    }

    public void setRenterName(String renterName) {
        this.renterName = renterName;
    }

    public String getRenterLocation() {
        return renterLocation;
    }

    public void setRenterLocation(String renterLocation) {
        this.renterLocation = renterLocation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
