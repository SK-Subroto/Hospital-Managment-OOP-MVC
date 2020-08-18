/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystemprosenjitchowdhury;

import static hospitalmanagementsystemprosenjitchowdhury.Patient.sc;
import java.util.Scanner;

/**
 *
 * @author Prosenjit
 */
    public class Receptionist extends Person{
    private String contactNo;
    static Scanner sc2 = new Scanner(System.in);
    static Controller cn = new Controller();
    public void setContactNo(String contactNo) {
    this.contactNo = contactNo;
    }

        public String getContactNo() {
        return contactNo;
    }
        void giveAppointment(){
        Doctor[] docList = cn.cnDoclist();
        for(int i=0; i<3; i++){
            System.out.println(i+1+". "+docList[i].getName()+", "+docList[i].getDesignation()+" of "+docList[i].getDept()+" Department");
        }
        
        int docInput = sc.nextInt()-1;
        
        System.out.print("Enter Date: ");
        
        sc.nextLine();
        String date = sc.nextLine();
        
        System.out.print("Enter check up time: ");
        String time = sc.nextLine();
        System.out.print("Enter patient ID: ");
        int pid = sc.nextInt();
        
        System.out.println("\n\n####Appointment created####\n" +
                           "Patient ID:"+ pid +"\n" +
                           "Doctor’s Name: "+ docList[docInput].getName() +"\n" +
                           "Doctor’s Department: "+ docList[docInput].getDept()+"\n" +
                           "Doctor’s Visit: "+ docList[docInput].getVisit()+"\n" +
                           "Date: "+ date +"\n" +
                           "Time: "+ time);
        System.out.println("❤❤❤ Get Well Soon ❤❤❤");
        
    }
     
    void gererateBill(){
        float total=0;
               int patientId, quantity=0;
               String patientName;
               int[] testIdArray = new int[10];
               int[] testQuantityArray = new int[10];
               Doctor[] docList = cn.cnDoclist();
               System.out.println("Enter Patient Id");
               patientId = sc.nextInt();
               System.out.println("Enter Patient Name");
               patientName = sc2.nextLine();
               
        for(int i=0; i<3; i++){
            System.out.println(i+1+". "+docList[i].getName()+", "+docList[i].getDesignation()+" of "+docList[i].getDept()+" Department"+" "+docList[i].getVisit());
        }
        
        System.out.println("Select Doctor Id Number");
        int docInput = sc.nextInt()-1;
        
        int docVisit = docList[docInput].getVisit();
        Test[] testList = cn.cnTestlist();
        
        for(int i=0; i<5; i++){
            System.out.println(testList[i].getId()+". "+testList[i].getTitle()+", "+testList[i].getCost());
        }
        
            System.out.println("Enter Number of Test Type: ");
            int numberOfTestType = sc.nextInt();
            
        for(int j=0; j<numberOfTestType;j++)
        {
            System.out.println("Enter Test Id: ");
            int tInput = sc.nextInt()-1;
            testIdArray[j]= tInput;
            System.out.println(testList[tInput].getTitle());
            System.out.print("Enter Quantity: ");
            quantity = sc.nextInt();
            testQuantityArray[j]=quantity;
            total = total+quantity*testList[tInput].getCost();
        }

                          System.out.println("\n\n####Bill Invoice created####\n" +
                           "Patient ID: "+ patientId +"\n" +
                           "Patient Name: "+ patientName +"\n" +
                           "Doctor Name: "+ docList[docInput].getName()+"*** visit: "+docList[docInput].getVisit()+" "+"\n" 
                           );

        for (int p=0; p<numberOfTestType; p++)
        {
                            System.out.println(testList[testIdArray[p]].getId()+". "
                            +testList[testIdArray[p]].getTitle()+"--> "
                            +testList[testIdArray[p]].getCost()+"*"+testQuantityArray[p]+" = "
                            +testList[testIdArray[p]].getCost()*testQuantityArray[p]+"\n");
                           
            
        }

                        System.out.println("Total amount :"+total+docVisit+"\n\n"+
                        "❤❤❤ Get Well Soon ❤❤❤");
                        System.out.println("Kindly Pay The Bill\n\n ");
    }
}
