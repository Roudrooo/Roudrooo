package LabAssignment10;

import java.util.Scanner;

public class CW1 {
    public static void oneToN(int x,int y){ // A
        if(x<=y){
            System.out.print(x+" ");
            oneToN(++x,y);
        }
    }
    public static void nToOne(int x,int y){ // B
        if(x<=y){
            System.out.print(y+" ");
            nToOne(x,--y);
        }
    }
    public static int recursiveSum(int x,int y){
        if(x==y){
            return y;
        } else{
             return x+recursiveSum(++x, y);
        }

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("N: ");
        int N=input.nextInt();
        //A:
        oneToN(1,N);
        System.out.println();
        //B:
        nToOne(1,N);
        System.out.println();
        //C:
        System.out.println(recursiveSum(1, N));
        input.close();
    }
}
