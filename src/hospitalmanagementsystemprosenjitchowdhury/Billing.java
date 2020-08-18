/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystemprosenjitchowdhury;

//import static hospitalmanagementsystemprosenjitchowdhury.Patient.sc;

import java.util.Scanner;


/**
 *
 * @author Prosenjit
 */
public class Billing {
    String trid, cardnum;
    static Scanner sc = new Scanner(System.in);
    public void bkash()
    {
        System.out.println("***This is our bkash Number: 01789146828\n***Kindly pay your bill in this Number.");
        System.out.println("Enter Your Transection Id: ");
        trid = sc.nextLine();
    }
        public void card()
    {
        System.out.println("***This is our Account Number 70170155667722\n***Kindly pay your bill in this Account Number.");
        System.out.println("Enter Your AccountNumber: ");
        cardnum = sc.nextLine();
    }
            public void dbbl()
    {
        System.out.println("***This is our DBBL Number 01789146828-2\n***Kindly pay your bill in this number.");
        System.out.println("Enter Your Transection Id: ");
        trid = sc.nextLine();
    }

   
}
