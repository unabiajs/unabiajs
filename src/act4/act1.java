package act4;

import java.util.Scanner;

public class act1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String name, remarks, message;
        int sci, his, math, soc, arts;
        double average, total;
        
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        
        System.out.print("Enter Marks in Science: ");
        sci = sc.nextInt();
        
        System.out.print("Enter Marks in History: ");
        his = sc.nextInt();
        
        System.out.print("Enter Marks in Math: ");
        math = sc.nextInt();
        
        System.out.print("Enter Marks in Soc: ");
        soc = sc.nextInt();
        
        System.out.print("Enter Marks in Arts: ");
        arts = sc.nextInt();
        
        total = sci+his+math+soc+arts;
        average = total / 5;
        
        System.out.printf("\nTotal Marks: %.0f", total);
        System.out.printf("\nTotal Percentage: %.2f", average);
        
        if(average<70){
            remarks = "Fail";
            message = "Try Again";
        }else if (average<76){
            remarks = "Poor";
            message = "Congrats " + name + ", you Passed";
        }else if(average<81){
            remarks = "Fair";
            message = "Congrats " + name + ", you Passed";
        }else if(average<86){
            remarks = "Good";
            message = "Congrats " + name + ", you Passed";
        }else if(average<91){
            remarks = "Very Good";
            message = "Congrats " + name + ", you Passed";
        }else{
            remarks = "Excellent";
            message = "Congrats " + name + ", you Passed";
        }
        
        System.out.print("\nRemarks: "+remarks);
        System.out.println("\n\n"+ message);
    }
    
}
