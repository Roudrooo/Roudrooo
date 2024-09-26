package LabAssignment8;

import java.util.Scanner;
//import java.util.Arrays;

public class CW3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int N=input.nextInt();
        int[] arr1=new int[N];
        for(int i=0;i<arr1.length;i++){
            System.out.print("Enter a number: ");
            arr1[i]=input.nextInt();
        }
        // System.out.println(Arrays.toString(arr1));

        // (a) Out-of Place 

        int[] arr2=new int[arr1.length];
        // for(int i=0;i<arr1.length;i++){ ////Can use this for reversing
        //     arr2[i]=arr1[arr1.length-1-i];
        // }
        for(int i=arr1.length-1,j=0;i>=0;i--,j++){ ////Also can use this for reversing
            arr2[j]=arr1[i];
        }
        System.out.println("Reversed using a new array:");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        // System.out.println(Arrays.toString(arr2));

        // (b) In-Place

        for(int i=0,j=arr1.length-1;i!=j/*Or, i<=(arr1.length/2) */;i++,j--){
            int temp=arr1[j];
            arr1[i]=arr1[j];
            arr1[j]=temp;
        }
        System.out.println("Reversed the original array:");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        //System.out.println(Arrays.toString(arr1));
        input.close();
    }
}
