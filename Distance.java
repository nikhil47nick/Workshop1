import java.util.Scanner;

public class Distance {

    public static void main(String[] args){


        Scanner scr = new Scanner(System.in);
        System.out.println("Enter value for x");
        double x = scr.nextDouble();
        System.out.println("Enter value for y");
        double y = scr.nextDouble();

            double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

            System.out.print("Distance : "+distance);

    }
}
