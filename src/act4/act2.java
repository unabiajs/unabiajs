package act4;

import java.util.Scanner;

public class act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int number;
    
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        
        if(number == 0){
            System.out.println("Inputted number is 0");
        }else if(number %2 == 0){
            System.out.println("Inputted number is even");
        }else{
            System.out.println("Inputted number is odd");
        }
    }
}
