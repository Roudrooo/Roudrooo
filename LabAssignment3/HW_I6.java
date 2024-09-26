package LabAssignment3;

import java.util.Scanner;

public class HW_I6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three float numbers: ");
        float a = input.nextFloat(), b = input.nextFloat(), c = input.nextFloat();
        input.close();
        //For maximum:
        if(a>b && a>c){
            System.out.println("Maximum number is: "+a);
        } else if(b>a && b>c){
            System.out.println("Maximum number is: "+b);
        } else if(c>a && c>b){
            System.out.println("Maximum number is: "+c);
        }
        //For minimum: 
        if(a<b && a<c){
            System.out.println("Minimum number is: "+a);
        } else if(b<a && b<c){
            System.out.println("Minimum number is: "+b);
        } else if(c<a && c<b){
            System.out.println("Minimum number is: "+c);
        }
    }
}
