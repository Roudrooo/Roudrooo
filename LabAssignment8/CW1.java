package LabAssignment8;

import java.util.Scanner;
//import java.util.Arrays;
public class CW1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("N = ");
        int N=input.nextInt();
        int[] arr1=new int[N];
        for(int i=0;i<arr1.length;i++){
            System.out.print("Enter a number: ");
            arr1[i]=input.nextInt();
        }
        for(int i=0;i<arr1.length;i++){
            System.out.println(i+": "+arr1[i]);
        }
        //System.out.println(Arrays.toString(arr1));
        int[] arr2=new int[N+1];
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        System.out.print("Enter another number: ");
        int x=input.nextInt();
        arr2[arr2.length-1]=x;
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        //System.out.println(Arrays.toString(arr2));
        input.close();
    }
}
