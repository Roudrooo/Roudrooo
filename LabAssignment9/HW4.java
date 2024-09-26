package LabAssignment9;

import java.util.Scanner;

public class HW4 {
    public static void oneToN(int x,int y){
        if(x<=y){
            System.out.print(x+" ");
            oneToN(++x, y);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        oneToN(1, n);
        System.out.println();
        input.close();
    }
}
