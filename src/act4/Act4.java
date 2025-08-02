package act4;

import java.util.Scanner;

public class Act4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name;
        double rate, thw, wage, cont, net;
        
        System.out.print("Enter employee name: ");
        name = sc.nextLine();
        
        System.out.print("Enter hourly rate: ");
        rate = sc.nextDouble();
        
        System.out.print("Enter total hours worked this week: ");
        thw = sc.nextDouble();
        
        System.out.println("----- Wage Summary -----");
        
        System.out.println("Employee: "+name);
        System.out.printf("Hourly Rate: %.2f",rate);
        System.out.println("\nHours Worked: "+ thw);
            wage = rate * thw;
            cont = wage * .1;
            net = wage - cont;
            
        System.out.printf("Gross weekly Wage: %.2f", wage);
        System.out.printf("\nSSS Contribution: %.2f\n", cont);
        System.out.print("--------------------");
        System.out.printf("\nNet Weekly Wage: %.2f\n", net);
    }
    
}
