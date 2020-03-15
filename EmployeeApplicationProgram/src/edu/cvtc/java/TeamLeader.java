package edu.cvtc.java;

import java.text.DecimalFormat;

public class TeamLeader extends ProductionWorker {
  private double monthlyBonus;
  private double requiredTrainingHours;
  private double trainingHoursAttended;

  // Default Constructor
  public TeamLeader() {
    super();
    this.monthlyBonus = 0.0;
    this.trainingHoursAttended = 0.0;
    this.requiredTrainingHours = 0.0;
  }

  public TeamLeader(double monthlyBonus, double requiredTrainingHours, double trainingHoursAttended) {
    super();
    this.monthlyBonus = monthlyBonus;
    this.trainingHoursAttended = trainingHoursAttended;
    this.requiredTrainingHours = requiredTrainingHours;
  }

  public TeamLeader(String name, String idNumber, String hiredDate, int shift, double payRate, double monthlyBonus,
      double requiredTrainingHours, double trainingHoursAttended) {
    super(name, idNumber, hiredDate, shift, payRate);
    this.monthlyBonus = monthlyBonus;
    this.trainingHoursAttended = trainingHoursAttended;
    this.requiredTrainingHours = requiredTrainingHours;
  }

  public double getMonthlyBonus() {
    return this.monthlyBonus;
  }

  public void setMonthlyBonus(double monthlyBonus) {
    this.monthlyBonus = monthlyBonus;
  }

  public double getRequiredTrainingHours() {
    return this.requiredTrainingHours;
  }

  public void setRequiredTrainingHours(double requiredTrainingHours) {
    this.requiredTrainingHours = requiredTrainingHours;
  }

  public double getTrainingHoursAttended() {
    return this.trainingHoursAttended;
  }

  public void setTrainingHoursAttended(double trainingHoursAttended) {
    this.trainingHoursAttended = trainingHoursAttended;
  }

  // Create a String to represent Team Leader
  public String toString() {
    DecimalFormat dollar = new DecimalFormat("#,###.00");
    String str;
    str = super.toString() + "\nTraining Hours Attended: " + trainingHoursAttended + "\nMonthly Bonus: $"
        + dollar.format(monthlyBonus) + "\nRequired Training Hours: " + requiredTrainingHours;
    return str;
  }
}
