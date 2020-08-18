/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystemprosenjitchowdhury;

import java.util.Scanner;

/**
 *
 * @author Prosenjit
 */
public class View {
         private int choice;
    static Scanner sc = new Scanner(System.in);
    int viewFirstPage(){
        System.out.println("How do you want to enter the system?\n" +
                            "1. As Patient\n" +
                            "2. As Receptionist\n" +
                            "3. As Doctor\n" +
                            "4. Exit");
        choice = sc.nextInt();
        return choice;
    }

//*********   Patient  *********

    int viewPatientOption(){
        System.out.println("Choose any one:\n" +
                            "1. Insert info\n" +
                            "2. Pay bill\n" +
                            "3. Return");
        choice = sc.nextInt();
        return choice;
    }

//**********  Receptionist  **********

    int viewReceptionistOption(){
        System.out.println("1. Give Appointment\n" +
                            "2. Generate Bill\n" +
                            "3. Return");
        choice = sc.nextInt();
        return choice;
    }
    

//**********  Doctor  **********

    int viewDoctorOption(){
        System.out.println("1. Prescribe Medicine\n" +
                            "2. Prescribe Test\n" +
                            "3. Return");
        choice = sc.nextInt();
        return choice;
    }
    
}
