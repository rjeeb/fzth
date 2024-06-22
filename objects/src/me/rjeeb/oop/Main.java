package me.rjeeb.oop;

public class Main {

  public static void main(String[] args) {
    CustomerName customerName = new CustomerName();
    customerName.firstName = "John";
    customerName.middleName = "Doe";
    customerName.lastName = "Smith";
    System.out.println(customerName.getFullName());

    CustomerContact customerContact = new CustomerContact();
    customerContact.mobileNumber = "1234567890";
    customerContact.email = "email@gmail.com";
    customerContact.verifyEmail();
    customerContact.verifyMobileNumber();

    CustomerAddress customerAddress = new CustomerAddress();
    customerAddress.country = "USA";
    customerAddress.city = "New York";
    customerAddress.street = "5th Avenue";
    customerAddress.buildingNumber = "123";
    System.out.println(customerAddress.addressToGPS());
  }
}