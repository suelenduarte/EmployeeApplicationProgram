package edu.cvtc.java;

import java.text.DecimalFormat;

public class ProductionWorker extends Employee {
  // Attributes
  private int shift;
  private double payRate;

  // Default Constructor
  public ProductionWorker() {
    super();
    this.shift = 0;
    this.payRate = 0.0;

  }

  public ProductionWorker(int shift, double payRate) {
    super();
    this.shift = shift;
    this.payRate = payRate;
  }

  public ProductionWorker(String name, String idNumber, String hiredDate, int shift, double payRate) {
    super(name, idNumber, hiredDate);
    this.shift = shift;
    this.payRate = payRate;

  }

  public int getShift() {
    return this.shift;
  }

  public void setShift(int shift) {
    this.shift = shift;
  }

  public double getPayRate() {
    return this.payRate;
  }

  public void setPayRate(double payRate) {
    this.payRate = payRate;
  }

  // Create a String to represent Production worker
  public String toString() {
    DecimalFormat dollar = new DecimalFormat("#,###.00");
    String str;
    str = super.toString() + "\nShift: " + shift + "\nPay Rate: " + dollar.format(payRate);
    return str;
  }

}
