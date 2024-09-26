package LabAssignment4;

import java.util.Scanner;

public class HW_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = input.nextInt();
        int temp = n;
        int digit_count = 0;
        while(temp!=0){
            temp/=10;
            digit_count++;
        }
        temp = n;
        while(digit_count!=0){
            int a =(int) (temp/(Math.pow(10,--digit_count)));
            temp%=(Math.pow(10,digit_count));
            if(digit_count>0){
                System.out.printf("%d,",a);
            } else{
                System.out.printf("%d\n",a);
            }
        }
        input.close();
    }
}
