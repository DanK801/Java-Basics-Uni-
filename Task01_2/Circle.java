/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//DANIEL KATHIRESAN 18027156 3/03/21
package Task01_2;

public class Circle extends Shape {
    
    public double radius;
    
    public Circle(String name) {
        super("Circle");
    }

    //Add Method
    @Override
    public void calculateArea() {
        this.area = Math.PI * (radius*radius);
        printInfo();
    }
    
}
