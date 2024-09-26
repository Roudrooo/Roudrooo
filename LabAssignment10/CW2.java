package LabAssignment10;

import java.util.Scanner;

public class CW2 {
    public static void reverseDigits(int n){
        if(n>0){
            System.out.println(n%10);
            reverseDigits(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        reverseDigits(n);
        input.close();
    }
}
