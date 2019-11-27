package chapter3;

import java.util.Scanner;

public class grade_equality {
    public static void main(String args[]){
        System.out.println("Enter the grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        String G = grade.toUpperCase();

        System.out.println("the grade is"+ G);


        String message;
        switch ( G ){
            case "A":
                message = "Excellen!!";
                break;
            case "B":
                message = "Good!!";
                break;
            case "C":
                message = "Average!!";
                break;
            case "D":
                message = "Poor!!";
                break;
            default:
                message = "Incorrect grade. please enter from A-Z";
                break;
        }

        System.out.println(message);


    }
}
