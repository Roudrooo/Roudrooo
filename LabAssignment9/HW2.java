package LabAssignment9;

import java.util.Scanner;

public class HW2 {
    public static void showDots(int x){ // A
        for(int i=1;i<=x;i++){
            System.out.print(".");
        }
    }
    public static void show_palindrome(int x){ // B
        for(int i=1;i<=x;i++){
            System.out.print(i);
        }
        for(int i=x-1;i>=1;i--){
            System.out.print(i);
        }
    }
    public static void showDiamond(int x){ // C
        for(int i=1;i<=x;i++){
            showDots(x-i);
            show_palindrome(i);
            showDots(x-i);
            System.out.println();
        }
        for(int i=x-1;i>=1;i--){
            showDots(x-i);
            show_palindrome(i);
            showDots(x-i);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        // A:
        System.out.print("A:\nDots:  ");
        showDots(n);
        // B:
        System.out.print("\nB:\nPalindrome:  ");
        show_palindrome(n);
        // C:
        System.out.println("\nC:\nDiamond:");
        showDiamond(n);
        input.close();
    }
}