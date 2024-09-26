package LabAssignment3;

import java.util.Scanner;

public class CW_I3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int n = input.nextInt();
       /*if(n%4==0){
            if(n%100==0){
                if(n%400==0){
                    System.out.println(n+" is a leap year.");
                } else{
                    System.out.println(n+" is not a leap year.");
                }
            } else{
                System.out.println(n+" is a leap year.");
            }
        } else{
            System.out.println(n+" is not a leap year.");
        }*/
        if(n%4==0 && (n%100!=0||n%400==0)){
            System.out.println(n+" is a leap year.");
        } else{
            System.out.println(n+" is not a leap year.");
        }
        input.close();
    }
}
