
package act4;

import java.util.Scanner;

public class AirFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance, clas;
        double totalfare;
        
        System.out.print("Distance(km): ");
        distance = sc.nextInt();
        
        System.out.print("Class: ");
        clas = sc.nextInt();
        
        switch (clas){
            case 1:
                totalfare = distance * 250;
                if(distance>=1000){
                    totalfare = totalfare * .90;
                    System.out.printf("\nTotal fare: %.2f",totalfare);
                }else{
                    System.out.printf("\nTotal fare: %.2f",totalfare);
                }
            break;
            case 2:
                totalfare = distance * 500;
                if(distance>=1000){
                    totalfare = totalfare * .90;
                    System.out.printf("\nTotal fare: %.2f",totalfare);
                }else{
                    System.out.printf("\nTotal fare: %.2f",totalfare);
                }
            break;
            default:
                System.out.print("Invalid class!");
        }
    }
}
