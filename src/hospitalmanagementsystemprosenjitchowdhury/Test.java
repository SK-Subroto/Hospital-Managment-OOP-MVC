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
public class Test {
    static Scanner sc = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);
    private int id;
    private String title;
    private float cost;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public float getCost() {
        return cost;
    }
    
        public Test[] testList(){
        Test[] test = new Test[50];
        
        
        test[0] = new Test();
        test[0].setId(1);
        test[0].setTitle("Blood Sugar");
        test[0].setCost(150);
        
        test[1] = new Test();
        test[1].setId(2);
        test[1].setTitle("Blood Presure");
        test[1].setCost(100);
        
        test[2] = new Test();
        test[2].setId(3);
        test[2].setTitle("X-ray");
        test[2].setCost(700);
        
        test[3] = new Test();
        test[3].setId(4);
        test[3].setTitle("ECG");
        test[3].setCost(900);
        
        test[4] = new Test();
        test[4].setId(5);
        test[4].setTitle("Covid-19");
        test[4].setCost(1500);
        
        return test;
    }
}
