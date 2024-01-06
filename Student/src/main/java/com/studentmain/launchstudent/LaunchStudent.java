package com.studentmain.launchstudent;

import com.studentmain.studentinmemoryrepository.StudentInMemoryOperations;

public class LaunchStudent {
    public static void main(String[] args) {
        SampleStudent sampleStudent = new SampleStudent();
        sampleStudent.displayinfo();
        int option = sampleStudent.getStudentResponce();
        int choice = Integer.MAX_VALUE;
        if(option == 1) {  //student want's in memory implementation;
            StudentInMemoryOperations student = new StudentInMemoryOperations();
            while (choice != 0) {
                choice = sampleStudent.displayStudentOperations();
                switch (choice) {
                    case 1 :   // add student data
                        student.addStudentData();
                        break;
                    case 2 :  //display student info;
                        student.displayStudentsInfo();
                        break;
                    case 3 :  //delete specific student data
                        student.deleteStudentData();
                        break;

                    case 4 :   //update specific student data
                        student.updateStudentData();
                        break;
                    case 0 :
                        System.exit(0);
                    default:
                        System.out.println("Invalid Choice");
                }
            }
        } else {

        }
    }
}
