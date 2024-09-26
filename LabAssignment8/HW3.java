package LabAssignment8;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the length of array 1: ");
        int N1=input.nextInt();
        int[] arr1=new int[N1];
        System.out.println("Please enter the elements of the arr1:");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=input.nextInt();
        }
        System.out.print("Please enter the length of array 2: ");
        int N2=input.nextInt();
        int[] arr2=new int[N2];
        System.out.println("Please enter the elements of the arr2:");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=input.nextInt();
        }
        int count=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    count++;
                }
            }
        }
        if(count==arr2.length){
            System.out.println("Array 2 is a subset of Array 1.");
        } else{
            System.out.println("Array 2 is not a subset of Array 1.");
        }
        input.close();
    }
}
