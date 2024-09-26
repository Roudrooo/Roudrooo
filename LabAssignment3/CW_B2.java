package LabAssignment3;

import java.util.Scanner;

public class CW_B2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Your marks: ");
        float n = input.nextFloat();
        if(n>=0&&n<=100){
            if(n>=90){
                System.out.println("Your grade is A");
            } else if(n>=85){
                System.out.println("Your grade is A-");
            } else if(n>=70){
                System.out.println("Your grade is B");
            } else if(n>=57){
                System.out.println("Your grade is C");
            } else if(n>=50){
                System.out.println("Your grade is D");
            } else{
                System.out.println("Your grade is F");
            }
        } else{
            System.out.println("Your input is invalid");
        }
        input.close();
    }
}
