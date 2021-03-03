/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//DANIEL KATHIRESAN 18027156 3/03/21

package Task01_2;
import java.util.Scanner;
/**
 *
 * @author danie
 */
public class ShapeCalculator1{
    public static void main(String[] args){
        Rectangle recObj = new Rectangle("Rectangle");
        Circle circObj = new Circle("Circle");
        Square squObj = new Square("Square");
        try{
    {
            System.out.println("===Shape Calculator==="
                    + "\n==Select Shape:=="
                    + "\n(1)Rectangle"
                    + "\n(2)Circle"
                    + "\n(3)Square"
                    + "\nSelect a shape: >");
            Scanner user = new Scanner(System.in);
            int input = user.nextInt();
            if(input==1){
                System.out.println("Rectangle Length: ");
                recObj.length = user.nextDouble();
                System.out.println("Rectangle Width: ");
                recObj.width = user.nextDouble();
                recObj.calculateArea();
            }
            if(input==2){
                System.out.println("Circle Radius: ");
                circObj.radius = user.nextDouble();
                circObj.calculateArea();
            }
            if(input==3){
                System.out.println("Square side length: ");
                squObj.side = user.nextDouble();
                squObj.calculateArea();

            }

            if(input > 3){
                System.out.println("Wrong input");
            }
}
        }//try end
        catch (Exception e) {
            System.out.println("Invalid Input. Not an integer");
        }
};

};
