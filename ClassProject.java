/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.classproject;

/**
 *
 * @author VU-Smartboard-01
 */
public class ClassProject {

    public static void main(String[] args) {
       vehicle v1 = new vehicle("Toyota","Silver",4);
       
       circle c1 = new circle(8);
       circle c2 = new circle(25);
       
       v1.showVehicleDetails();
       c1.calcArea();
       c2.calcArea();
    }
}
