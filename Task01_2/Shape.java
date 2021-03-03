//DANIEL KATHIRESAN 18027156 3/03/21

package Task01_2;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public abstract class Shape {

    private static DecimalFormat df = new DecimalFormat("0.000");
    
    public String shapeName = "";
    public double area = 0;

    public Shape(String name) {
        this.shapeName = name;
    }

    
    public void printInfo() {
        System.out.println(this.shapeName);
        System.out.println(df.format(this.area));
    }

    public void setName(String newName) {
        this.shapeName = newName;
    }

    //please be noted that this is an abstract function
    public abstract void calculateArea();

}

