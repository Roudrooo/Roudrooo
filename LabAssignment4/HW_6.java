package LabAssignment4;

import java.util.Scanner;

public class HW_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = input.nextInt();
        input.close();
        int count=0, sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
                if(i!=1){
                    int a = n/i;
                    sum+=a;
                }
            }
        }
        // a :
        if(count==2){
            System.out.printf("%d is a prime number\n",n);
        } else{
            System.out.printf("%d is not a prime number\n",n);
        }
        // b : 
        if(sum==n){
            System.out.printf("%d is a perfect number\n",n);
        } else{
            System.out.printf("%d is not a perfect number\n",n);
        }
    }
}