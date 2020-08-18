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
public class Patient extends Person{
    private String BloodGroup;
    private String Disease;
    private String DiseaseInfo;
    
    static Scanner sc = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);
    
    static Billing bill = new Billing();
    
    public String getBloodGroup() {
        return BloodGroup;
    }

    public String getDisease() {
        return Disease;
    }

    public String getDiseaseInfo() {
        return DiseaseInfo;
    }

    public static Scanner getSc() {
        return sc;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public void setBloodGroup(String BloodGroup) {
        this.BloodGroup = BloodGroup;
    }

    public void setDisease(String Disease) {
        this.Disease = Disease;
    }

    public void setDiseaseInfo(String DiseaseInfo) {
        this.DiseaseInfo = DiseaseInfo;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }
      public void showInsertedInfo(Patient p)
    {
        
        System.out.println("\n********Your inserted informations******");
        System.out.println("ID Number: "+p.getId());
        System.out.println("Patient Name: "+p.getName());
        System.out.println("Age: "+p.getAge());
        System.out.println("Mobile No: "+p.getPhoneNumber());
        System.out.println("Blood Group: "+p.getBloodGroup());
        System.out.println("Disease Name: "+p.getDisease());
        System.out.println("Disease Info: "+p.getDiseaseInfo());
        System.out.println("Email: "+p.getEmail());
        System.out.println("Address: "+p.getAddress());
        System.out.println("User Name: "+p.getUsername());
        System.out.println("Password: "+p.getPassword());
        System.out.println("❤❤❤ Get Well Soon ❤❤❤\n");
        
         
    }
    
    public void insertInfo()
    {
        Patient p = new Patient();
        
        System.out.println("Enter Id: ");
        this.id = sc2.nextInt();
        
        System.out.println("Enter Name: ");
        this.name = sc.nextLine();
        System.out.println("Enter Age: ");
        this.age = sc2.nextInt();
        System.out.println("Enter Mobile Number: ");
        this.phoneNumber = sc.nextLine();
        
        System.out.println("Blood Group: ");
        this.BloodGroup = sc.nextLine();      
        
        System.out.println("Enter Disease Name: ");
        this.Disease = sc.nextLine();
        System.out.println("Enter Disease Details Info: ");
        this.DiseaseInfo = sc.nextLine();
        System.out.println("Enter Email: ");
        this.email = sc.nextLine();
        System.out.println("Enter Address: ");
        this.address = sc.nextLine();
//        System.out.println("Enter User Name: ");
//        this.username = sc.nextLine();
//        System.out.println("Enter Password: ");
//        this.password = sc.nextLine();   
//        
        
        p.setId(id);
        p.setName(name);
        p.setAge(age);
        p.setPhoneNumber(phoneNumber);
        p.setBloodGroup(BloodGroup);
        p.setDisease(Disease);
        p.setDiseaseInfo(DiseaseInfo);
        p.setEmail(email);
        p.setAddress(address);
        p.setUsername(username);
        p.setPassword(password);
        this.showInsertedInfo(p);
    }
    public void payBill(){
                System.out.println("Choose any Pay option:\n" +
                            "1. B-Kash\n" +
                            "2. DBBL\n" +
                            "3. Credit/Debit Card");
        int choice = sc.nextInt();
                
        switch(choice){
            case 1: bill.bkash();
            break;
            case 2: bill.dbbl();
            break;
            case 3: bill.card();
            break;
            default : return;
        
    }
        System.out.println("\nPayment Successfull\n❤❤❤Thank You❤❤❤\n");

    }
      }


