package assignmentday5;

import java.util.Scanner;

public class DistanceJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.print("Enter the number: ");
        int y = sc.nextInt();
        double distance= Math.sqrt(x*x+y*y);
        System.out.println("Distance from ( " + x+", "+y+" ) and (0,0) is :  "+distance);
    }
}
