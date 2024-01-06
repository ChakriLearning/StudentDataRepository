package com.studentmain.launchstudent;

import java.util.Scanner;

public class SampleStudent {
    private  Scanner scanner = new Scanner(System.in);
    public void displayinfo() {
        System.out.println("****************Welcome to Student Data Repository***************");
        System.out.println("where do you want to save your data ?");
        System.out.println("1. InMemory");
        System.out.println("2. File Memory");
        System.out.print("\nEnter Option : ");
    }

    public int getStudentResponce() {
        int op = scanner.nextInt();
        scanner.nextLine();
        return op;
    }

    public void optStudentChoice(int option) {
        if(option == 1) {

        }
    }

    public int displayStudentOperations() {
        System.out.println("1. Add Student Info\n2. Display All Students data");
        System.out.println("3.delete specific student data\n4.update specific student data");
        System.out.print("\nEnter Option : ");
        int op = scanner.nextInt();
        scanner.nextLine();
        return op;
    }
}
