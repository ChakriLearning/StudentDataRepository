package com.studentmain.studentinmemoryrepository;
import com.studentmain.operationinterface.StudentOperations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentInMemoryOperations implements StudentOperations {
    private static List<StudentInMemoryOperations> studentInfo = new ArrayList<>();
    private int rollNo;
    private String name;
    private int age;
    private int phoneNo;
    private int studentChoie;
    Scanner scanner = new Scanner(System.in);

    public StudentInMemoryOperations(int choice) {
        this.studentChoie = choice;
    }
    public StudentInMemoryOperations(int rollNo, String name, int age, int phoneNo) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
    }
    public void takeActionByStudentChoice() {
        switch (studentChoie) {
            case 1 :   // add student data
                setRollNo();
                setName();
                setAge();
                setPhoneNo();
                storeItInMemory();
                System.out.println("Student added successfully");
                break;
            case 2 :  //display student info;
                System.out.println("-------------Student Info---------------");
                for (StudentInMemoryOperations student : studentInfo) {
                    System.out.println(student);
                }
                System.out.println("-------------Student Info---------------");
                break;
            case 3 :  //delete specific student data
                System.out.print("Enter student rollNo to Delete: ");
                int roll = scanner.nextInt();
                scanner.nextLine();
                boolean found = false;
                Iterator<StudentInMemoryOperations> iterator = studentInfo.iterator();
                while(iterator.hasNext()) {
                    found = true;
                    StudentInMemoryOperations student = iterator.next();
                    if(student.getRollNo() == roll) {
                       // studentInfo.remove(student);
                        iterator.remove();
                        break;
                    }
                }
                if(found) {
                    System.out.println(" Student details deleted Successfully");
                } else {
                    System.out.println("Student not Found");
                }
                break;

            case 4 :   //update specific student data
                System.out.print("Enter studnet rollNo To Update: ");
                roll = scanner.nextInt();
                scanner.nextLine();

                found = false;
                Iterator<StudentInMemoryOperations> iterators = studentInfo.iterator();
                while(iterators.hasNext()) {
                    found = true;
                    StudentInMemoryOperations student = iterators.next();
                    if(student.getRollNo() == roll) {
                        iterators.remove();
                        setRollNo();
                        setName();
                        setAge();
                        setPhoneNo();
                        storeItInMemory();
                        break;

                    }
                }
                if(found) {
                    System.out.println(" Student details Updated Successfully");
                } else {
                    System.out.println("Student RollNo not Found");
                }
                break;
            case 0 :
                System.exit(0);
            default:
                System.out.println("Invalid Choice");
        }
    }
    public void setRollNo() {
        System.out.print("\nEnter your RollNo : ");
        this.rollNo = scanner.nextInt();
        scanner.nextLine();
    }
    public void setName() {
        System.out.print("\nEnter your Name : ");
        this.name = scanner.nextLine();
    }
    public void setAge() {
        System.out.print("\nEnter your Age : ");
        this.age = scanner.nextInt();
        scanner.nextLine();
    }
    public void setPhoneNo() {
        System.out.print("\nEnter your PhoneNo : ");
        this.phoneNo = scanner.nextInt();
        scanner.nextLine();
    }

    public void storeItInMemory() {
        studentInfo.add(new StudentInMemoryOperations(rollNo,name,age,phoneNo));
    }
    @Override
    public String toString() {
        return rollNo + "  " + name + "  " + age  + "  " + phoneNo;
    }
    public String getName() {
        return this.name;
    }
    public int getRollNo() {
        return this.rollNo;
    }
    public int getAge() {
        return this.age;
    }
    public int getPhoneNo() {
        return this.phoneNo;
    }
}
