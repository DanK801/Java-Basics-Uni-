//DANIEL KATHIRESAN 18027156 3/03/21
package Task01_2;

public class Rectangle extends Shape {
    public double length,width;
    
    public Rectangle(String name) {
        super("Rectangle");
    }

    //Add Method
    @Override
    public void calculateArea() {
        this.area = length*width;
        printInfo();
    }
    
}
