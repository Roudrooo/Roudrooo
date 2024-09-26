package LabAssignment3;

import java.util.Scanner;

public class CW_B1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers:\n");
        int a = input.nextInt(),b = input.nextInt(),c = input.nextInt();
        if(a>b&&a>c){
            System.out.println("Largest number: "+a);
        } else if(b>a&&b>c){
            System.out.println("Largest number: "+b);
        } else if(c>a&&c>b){
            System.out.println("Largest number: "+c);
        }
        input.close();
    }
}
