package com.studentmain.launchstudent;

import com.studentmain.studentinmemoryrepository.StudentInMemoryOperations;

public class LaunchStudent {
    public static void main(String[] args) {
        SampleStudent sampleStudent = new SampleStudent();
        sampleStudent.displayinfo();
        int option = sampleStudent.getStudentResponce();
        int choice = Integer.MAX_VALUE;
        if(option == 1) {  //student want's in memory implementation;
            while (choice != 0) {
                choice = sampleStudent.displayStudentOperations();
                StudentInMemoryOperations studentInMemoryOperations = new StudentInMemoryOperations(choice);
                studentInMemoryOperations.takeActionByStudentChoice();
            }

        }
    }
}
