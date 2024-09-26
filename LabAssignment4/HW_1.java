package LabAssignment4;

import java.util.Scanner;

public class HW_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int n = input.nextInt();
        int sum = 0;
        int odd = 1;
        System.out.println("The odd numbers are:");
        for(int i = 1;i<=n;i++){
            System.out.println(odd);
            sum+=odd;
            odd+=2;
        }
        System.out.printf("The Sum of odd Natural Numbers up to %d terms is: %d\n",n,sum);
        input.close();
    }
}
