
import java.util.Scanner;

public class Energy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner reader = new Scanner(System.in);  
        System.out.println("Enter the mass in kilograms : ");
        double m = reader.nextFloat();
        double c = 3.0*100000000;
        double e = m*c*c;
        double b = e/360000;
        System.out.println("The energy produced in Joules is = " + e );
        System.out.println("The number of 100 watt lightbulbs powered = " + b);
    }
    
    }
    
