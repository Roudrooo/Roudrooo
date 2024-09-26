package LabAssignment4;

import java.util.Scanner;

public class HW_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = input.nextInt();
        input.close();
        int digit_count = 0;
        int temp = n;
        while(temp!=0){
            temp/=10;
            digit_count++;
        }
        System.out.println("Total digit = "+digit_count);
    }
}
