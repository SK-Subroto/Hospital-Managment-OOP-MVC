/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystemprosenjitchowdhury;

/**
 *
 * @author Prosenjit
 */
public class Controller {
       private int choice;
    static View view = new View();
    static Patient patient = new Patient();
    static Test test = new Test();
    static Receptionist receptionist = new Receptionist();
    static Doctor doctor = new Doctor();
    
    void cnFirstPage(){
        choice = view.viewFirstPage();
        switch(choice){
            case 1: this.cnPatientPage();
            break;
            case 2: this.cnReceptionistPage();
            break;
            case 3: this.cnDoctorPage();
            break;
            default : return;
        }
        this.cnFirstPage();
    }
//================================
//#########   Patient  ###########
//================================
    void cnPatientPage(){
        choice = view.viewPatientOption();
        switch(choice){
            case 1: patient.insertInfo();
            break;
            case 2: patient.payBill();
            default : return;
        }
        this.cnPatientPage();
        
    }
//================================
//#######   Receptionist  ########
//================================
    void cnReceptionistPage(){
        choice = view.viewReceptionistOption();
        switch(choice){
            case 1: receptionist.giveAppointment();
            break;
            case 2: receptionist.gererateBill();
            break;
            default : return;
        }
        this.cnReceptionistPage();
    }
///================================
//##########   Doctor  ###########
//================================
    void cnDoctorPage(){
        choice = view.viewDoctorOption();
        switch(choice){
            case 1: doctor.prescribeMedicine();
            break;
            case 2: doctor.prescribeTest();
            break;
            default : return;
        }
        this.cnDoctorPage();
    }
    
    
    public Doctor[] cnDoclist(){
        Doctor[] doc = doctor.doclist();
        return doc;
    }
    
    public Test[] cnTestlist(){
        Test[] tests = test.testList();
        return tests;
    }
}
