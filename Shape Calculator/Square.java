//DANIEL KATHIRESAN 18027156 3/03/21
package Task01_2;

public class Square extends Shape {
    public double side;
    
    public Square(String name) {
        super("Square");
    }

    //Add Method
    @Override
    public void calculateArea() {
        this.area = side*side;
        printInfo();
    }
    
}
