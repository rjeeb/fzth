package me.rjeeb.nooop;

public class Main {

  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.firstName = "John";
    customer.middleName = "Doe";
    customer.lastName = "Smith";
    customer.mobileNumber = "1234567890";
    customer.email = "email@gmail.com";
    customer.country = "USA";
    customer.city = "New York";
    customer.street = "5th Avenue";
    customer.buildingNumber = "123";
    System.out.println(customer.getFullName());
    System.out.println(customer.addressToGPS());
    customer.verifyEmail();
    customer.verifyMobileNumber();
  }
}