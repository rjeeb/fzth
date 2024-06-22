package me.rjeeb.nooop;

public class Customer {

  String firstName;
  String middleName;
  String lastName;

  String mobileNumber;
  String email;

  String country;
  String city;
  String street;
  String buildingNumber;

  String getFullName() {
    return firstName + " " + middleName + " " + lastName;
  }

  void verifyEmail() {
    // Send verification email
  }

  void verifyMobileNumber() {
    // Send verification SMS
  }

  String addressToGPS() {
    return "0.0, 0.0";
  }
}
