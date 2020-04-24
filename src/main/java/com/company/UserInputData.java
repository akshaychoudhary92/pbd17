package com.company;

import java.util.Scanner;

public class UserInputData {
    public void inputData(){


        String firstName;
        String lastName;
        int grade;
        int studentId;
        String login;
        double gpa = 0;


        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the following information so I can sell it for a profit!");

        System.out.println("First name: ");
        firstName = s.nextLine();

        System.out.println("Last name: ");
        lastName = s.nextLine();

        System.out.println("Grade: ");
        grade = s.nextInt();

        System.out.println("Student ID: " + " (int value)");
        studentId = s.nextInt();
        s.nextLine();

        System.out.println("Login: ");
        login = s.nextLine();

        System.out.println("GPA: ");
        gpa = s.nextDouble();


        System.out.println("Your Information: ");
        System.out.println("      Login: " + login);
        System.out.println("      ID: " + studentId);
        System.out.println("      Name: " + lastName + "," + firstName);
        System.out.println("      GPA: " + gpa);
        System.out.println("      Grade: " + grade);
    }
}
