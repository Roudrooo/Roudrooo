package LabAssignment3;

import java.util.Scanner;

public class HW_B1 {
    public static void main(String[] args){
        Scanner Integer = new Scanner(System.in);
        Scanner Str = new Scanner(System.in);
        System.out.println("Enter two integer numbers: ");
        int a = Integer.nextInt(), b = Integer.nextInt();
        System.out.println("Enter the sign: ");
        String s = Str.nextLine();
        if(s.equals("+")){
            System.out.println("Summation = "+(a+b));
        } else if(s.equals("-")){
            System.out.println("Subtraction = "+(a-b));
        } else if(s.equals("*")){
            System.out.println("Multiplication = "+(a*b));
        } else if(s.equals("/")){
            System.out.println("Division = "+(a/b));
        } else if(s.equals("%")){
            System.out.println("Modulus = "+(a%b));
        }
        Integer.close();
        Str.close();
    }
}
