package act4;

import java.util.Scanner;

public class act3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int number;
    
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        
        if(number < 0){
            System.out.println(number + " is a negative number");
        }else if(number > 0){
            System.out.println(number + " is a positive number");
        }else{
            System.out.println("Inputted number is 0");
        }
    }
}
