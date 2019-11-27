package chapter3;

import java.util.Scanner;

public class Dollar_game {
    public static void main (String args[]){
        System.out.println("Enter the number of pennies?");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

        System.out.println("Enter the number of nickels");
        int nickels = scanner.nextInt();

        System.out.println("Enter the number of dimes");
        int dimes = scanner.nextInt();

        System.out.println("Enter the number of Quaters");
        int quaters = scanner.nextInt();

        double sum;
        sum =  ((pennies) * 0.01) +  (nickels * 0.05) + (dimes * 0.10)  + (quaters * 0.25) ;

        System.out.println("total Amount" + sum);

        if (sum == 1.0)
        {
            System.out.println("Congrats!! your winner");
        }

        else if (sum >= 1.0)
        {
            System.out.println("you have excess money"+ (sum - 1.0));
        }

        else if (sum <=1.0)
        {
            System.out.println("you have less money"+ (1.0 - sum));
        }


    }

}
