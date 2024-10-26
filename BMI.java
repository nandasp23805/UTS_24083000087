/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

/**
 *
 * @author LENOVO
 */
public class BMI {

    float bb;
    float tb;

    public BMI(float tb, float bb) {
        this.tb = tb;
        this.bb = bb;
    }

    float setBmi() {
        float m = tb / 100;
        return bb / (m * m);

    }

    void getBmi() {
        float BMI = setBmi();
        System.out.printf("BMI Anda : %.1f%n", BMI);
        
        if (BMI < 18.5) {
            System.out.println("underweight");
            
        } else if (BMI > 18.5 && BMI <= 24.9) {
            System.out.println("normal");
            
        } else if (BMI > 25 && BMI <= 29.9) {
            System.out.println("overweight");
            
        } else if (BMI > 30) {
            System.out.println("obesitas");
            
        } 

    }

}
