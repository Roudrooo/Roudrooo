package LabAssignment5;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int s = input.nextInt(), e = input.nextInt(), c = input.nextInt();
        for(int i=s;i<=e;i++){
            int temp = i, mul = 1;
            while(temp!=0){
                int a = temp%10;
                mul*=a;
                temp/=10;
            }
            if(mul%c==0){
                System.out.print(mul+" ");
            }
        }
        System.out.println();
        input.close();
    }
}