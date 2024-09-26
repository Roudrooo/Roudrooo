package LabAssignment10;

import java.util.Scanner;

public class CW3 {
    public static int sumDigits(int n){
        if(n<10){
            return n;
        } else{
            return n%10+sumDigits(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int x=sumDigits(n);
        System.out.println(x);
        input.close();
    }
}
