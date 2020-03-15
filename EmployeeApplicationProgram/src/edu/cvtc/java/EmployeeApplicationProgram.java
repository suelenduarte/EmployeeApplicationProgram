package edu.cvtc.java;

import java.util.Scanner;

public class EmployeeApplicationProgram {

  public static void main(String[] args) {

    // Declare variables
    String name;
    String idEmployee;
    String hiredDate;
    int shift;
    int number;
    double payRate;
    double annualSalary;
    double annualBonus;
    double monthlyBonus;
    double requiredTrainingHours;
    double trainingHoursAttended;

    Scanner keyboard = new Scanner(System.in);

    // Template for user selection
    System.out.println("Employee Record ");
    System.out.println("  1. Add record for Production Worker");
    System.out.println("  2. Add record for Shift Supervisor");
    System.out.println("  3. Add record for Team Leader ");
    System.out.println("Enter your choice (1-3)");
    System.out.println("Enter number: ");

    number = keyboard.nextInt();

    // select different calculation based on user input
    switch (number) {

    case 1:
      keyboard.nextLine();
      System.out.print("What's the name of the employee?");
      name = keyboard.nextLine();

      System.out.print("What's the number of the employee?");
      idEmployee = keyboard.nextLine();
      while (!Employee.isValidIdNumber(idEmployee)) {
        System.out.print("What's the number of the employee?");
        idEmployee = keyboard.nextLine();
      }

      System.out.print("When was the employee hired?");
      hiredDate = keyboard.nextLine();

      System.out.print("What is the employee's shift (1, 2, 3)?");
      shift = keyboard.nextInt();

      System.out.print("How much the employee get per hour?");
      payRate = keyboard.nextDouble();

      ProductionWorker employeeProductionWorker = new ProductionWorker(name, idEmployee, hiredDate, shift, payRate);

      System.out.println(employeeProductionWorker);

      break;

    case 2:

      keyboard.nextLine();
      System.out.print("What's the name of the employee?");
      name = keyboard.nextLine();

      System.out.print("What's the number of the employee?");
      idEmployee = keyboard.nextLine();
      while (!Employee.isValidIdNumber(idEmployee)) {
        System.out.print("What's the number of the employee?");
        idEmployee = keyboard.nextLine();
      }

      System.out.print("When was the employee hired?");
      hiredDate = keyboard.nextLine();

      System.out.print("What is the employee's shift (1, 2, 3)?");
      shift = keyboard.nextInt();

      System.out.print("How much the employee get per hour?");
      payRate = keyboard.nextDouble();

      System.out.print("How much is the monthly bonus for this employee?");
      monthlyBonus = keyboard.nextDouble();

      System.out.print("How many required hours for training?");
      requiredTrainingHours = keyboard.nextDouble();

      System.out.print("How many hours attended?");
      trainingHoursAttended = keyboard.nextDouble();

      TeamLeader employeeTeamLeader = new TeamLeader(name, idEmployee, hiredDate, shift, payRate, monthlyBonus,
          requiredTrainingHours, trainingHoursAttended);

      System.out.println(employeeTeamLeader);

      break;

    case 3:

      keyboard.nextLine();
      System.out.print("What's the name of the employee?");
      name = keyboard.nextLine();

      System.out.print("What's the number of the employee?");
      idEmployee = keyboard.nextLine();
      while (!Employee.isValidIdNumber(idEmployee)) {

        System.out.print("What's the number of the employee?");
        idEmployee = keyboard.nextLine();

      }

      System.out.print("When was the employee hired?");
      hiredDate = keyboard.nextLine();

      System.out.print("What is the annual salary of the employee?");
      annualSalary = keyboard.nextInt();

      System.out.print("What is the annual bonus of the employee?");
      annualBonus = keyboard.nextDouble();

      ShiftSupervisor employeeShiftSupervisor = new ShiftSupervisor(name, idEmployee, hiredDate, annualSalary,
          annualBonus);

      System.out.println(employeeShiftSupervisor);

      break;
    }
    keyboard.close();
  }

}
