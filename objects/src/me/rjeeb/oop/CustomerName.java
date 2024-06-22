package me.rjeeb.oop;

public class CustomerName {

  String firstName;
  String middleName;
  String lastName;

  String getFullName() {
    return firstName + " " + middleName + " " + lastName;
  }
}
