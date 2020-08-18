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
public class Doctor extends Person{
    static Scanner sc = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);
    private String designation;
    private String dept;
    private int visit;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setVisit(int visit) {
        this.visit = visit;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDept() {
        return dept;
    }

    public int getVisit() {
        return visit;
    }
    public Doctor[] doclist(){
        Doctor[] doc = new Doctor[50];
        String[] dis = {"Professor","Assistant Professor","Consultant"};
        
        doc[0] = new Doctor();
        doc[0].setName("Dr. Mamunur Rashid");
        doc[0].setDept("Medicine");
        doc[0].setDesignation("Professor");
        doc[0].setVisit(800);
        
        doc[1] = new Doctor();
        doc[1].setName("Dr. Kartik Majumder");
        doc[1].setDept("Cardiology");
        doc[0].setDesignation("Consultant");
        doc[1].setVisit(1000);
        
        doc[2] = new Doctor();
        doc[2].setName("Dr. Selina Hosen");
        doc[2].setDept("Gynaecology");
        doc[0].setDesignation("Assistant Professor");
        doc[2].setVisit(1200);
        
        return doc;
    }
    public void prescribeMedicine()
    {
        int tablets, capsules, patientId;
        String patientName;
        
        String[] tab = new String[10];
        String[] cap = new String[10];
        
        System.out.println("Enter Patient Id Number: ");
        patientId=sc.nextInt();
        System.out.println("Enter Patient Name: ");
        patientName=sc2.nextLine();
        
        System.out.println("Enter number of tablets: ");
        tablets=sc.nextInt();
        System.out.println("Input Tablet Names:");
        for(int i=0; i<tablets; i++){
            tab[i]=sc2.nextLine();
        }
        System.out.println("Enter number of capsules: ");
        capsules=sc.nextInt();
        System.out.println("Input Capsules Name:");
                for(int i=0; i<capsules; i++){
            cap[i]=sc2.nextLine();
    }
                System.out.println("******* Your Prescription is ready ******");
                System.out.println("Patient Id: "+ patientId);
                System.out.println("Patient Name: "+ patientName);
                System.out.println("Tablets:: ");
             for(int i=0; i<tablets; i++){
                        System.out.println(i+1+": "+tab[i]);
                        
        }    
                    System.out.println("Capsules:: ");
             for(int i=0; i<capsules; i++){
                    System.out.println(i+1+": "+cap[i]);
                    
                        
        }
                   System.out.println("❤❤❤ Get Well Soon ❤❤❤");
    }
       public void prescribeTest()
    {
        int testNumber, testTitle, patientId;
        String patientName;
        
        String[] test = new String[10];
        
        
            System.out.println("Enter Patient Id Number: ");
            patientId=sc.nextInt();
            System.out.println("Enter Patient Name: ");
            patientName=sc2.nextLine();
        
            System.out.println("Enter number of Test: ");
            testNumber=sc.nextInt();
            System.out.println("Input Test Names");
        for(int i=0; i<testNumber; i++){
            test[i]=sc2.nextLine();
        }
 
                System.out.println("***** Your Test Details is ready *******");
                System.out.println("Patient Id: "+ patientId);
                System.out.println("Patient Name: "+ patientName);
                System.out.println("Tests:: ");
                
        for(int i=0; i<testNumber; i++){
                System.out.println(i+1+" Test Name: "+test[i]);
                        
        }    

                    
                        
                System.out.println("***  Kindly Go To Receptionist for Test details****");   
                System.out.println("❤❤❤ Get Well Soon ❤❤❤");
    }
}
