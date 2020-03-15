package edu.cvtc.java;

import java.text.DecimalFormat;

public class ShiftSupervisor extends Employee {
  // Attributes
  private double annualSalary;
  private double annualBonus;

  // Default Constructor
  public ShiftSupervisor() {
    super();
    this.annualSalary = 0.0;
    this.annualBonus = 0.0;
  }

  public ShiftSupervisor(double annualSalary, double annualBonus) {
    super();
    this.annualSalary = annualSalary;
    this.annualBonus = annualBonus;
  }

  public ShiftSupervisor(String name, String idNumber, String hiredDate, double annualSalary, double annualBonus) {
    super(name, idNumber, hiredDate);
    this.annualSalary = annualSalary;
    this.annualBonus = annualBonus;
  }

  public double getAnnualSalary() {
    return this.annualSalary;
  }

  public void setAnnualSalary(double annualSalary) {
    this.annualSalary = annualSalary;
  }

  public double getAnnualBonus() {
    return this.annualBonus;
  }

  public void setAnnualBonus(double annualBonus) {
    this.annualBonus = annualBonus;
  }

  // Create a String to represent Shift Supervisor
  public String toString() {
    DecimalFormat dollar = new DecimalFormat("#,###.00");
    String str;
    str = super.toString() + "\nAnnual Salary: " + dollar.format(annualSalary) + "\nAnnual Bonus: "
        + dollar.format(annualBonus);
    return str;
  }

}
