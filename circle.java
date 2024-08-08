/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.classproject;

/**
 *
 * @author VU-Smartboard-01
 */
public class circle {
    public int r;
    public final double PI =3.142;
    
    public circle(int r){
        this.r =r;
    }
    
    public void calcArea(){
        double area =r*PI;
        System.out.println("The area of a circlr having a rafius of " + r + " is : " + area);
    }
    
}
