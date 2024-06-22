package me.rjeeb.oop;

public class CustomerAddress {

  String country;
  String city;
  String street;
  String buildingNumber;

  String addressToGPS() {
    return "0.0, 0.0";
  }
}
