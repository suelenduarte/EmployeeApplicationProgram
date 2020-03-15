package edu.cvtc.java;

public class Employee {
  // Attributes
  private String name;
  private String idNumber;
  private String hiredDate;

  // Default Constructor
  public Employee() {
    this.name = "";
    this.idNumber = "";
    this.hiredDate = "";

  }

  public Employee(String name, String idNumber, String hiredDate) {
    this.name = name;
    this.idNumber = idNumber;
    this.hiredDate = hiredDate;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIdNumber() {
    return this.idNumber;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }

  public String getHireDate() {
    return hiredDate;
  }

  public void setHireDate(String hireDate) {
    this.hiredDate = hireDate;
  }

  // Test for a valid employee number
  public static boolean isValidIdNumber(String employeeNumber) {
    boolean valid = true; // Flag
    int index = 0; // Loop control variable

    // Is the string the correct length? 111-A
    if (employeeNumber.length() != 5) {
      valid = false;
    }
    // Test the first three characters for numbers
    while (valid && index < 3) {
      if (!Character.isDigit(employeeNumber.charAt(index))) {
        valid = false;
        break;

      }
      index++;
    }

    // Test the fourth character for a dash
    while (valid && index < 4) {
      if (employeeNumber.charAt(index) != '-') {
        valid = false;
        break;

      }
      index++;
    }

    // Test the last character for a letter
    while (valid && index < 5) {
      if (!Character.isLetter(employeeNumber.charAt(index))) {
        valid = false;
        break;
      }

      // Test letter for value between 'A' and 'M'
      if (!(Character.getNumericValue(employeeNumber.charAt(index)) >= 10
          && Character.getNumericValue(employeeNumber.charAt(index)) <= 22)) {
        valid = false;
        break;
      }
      index++;

    }
    return valid;

  }

//Create a String to represent employee
 public String toString() {
   String str;
   str = "Name: " + name + "\nID Number: " + idNumber + "\nHired Date: " + hiredDate;
   return str;
 }

}
