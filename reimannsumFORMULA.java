/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author ACER
 */
public class reimannsumFORMULA {

    public static double calculateDeltaX(double lower_l, double upper_l, double subint) {
        return (upper_l - lower_l) / subint;
    }

    public static double calculateAreaUnderCurve(double lower_l, double upper_l, double subint,
            double xCube, double xSquared, double x, double constant) {
        double deltaX = calculateDeltaX(lower_l, upper_l, subint);
        double sumX = 0.0;

       
        for (int i = 0; i < subint; i++) {
            double midpoint = lower_l + (i + 0.5) * deltaX;
            double fx = xCube * Math.pow(midpoint, 3) + xSquared * Math.pow(midpoint, 2) + x * midpoint + constant;
            sumX += fx;
        }

        return sumX * deltaX;
    }
    
    
    double difcalc (double fx, double fxh, double delta) {
        
        double Fprime = (fxh - fx) / delta;
        
        return Fprime;
    }

}
