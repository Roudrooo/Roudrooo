package LabAssignment8;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int N=input.nextInt();
        double[] arr=new double[N];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter a number: ");
            arr[i]=input.nextDouble();
        }
        double min=Math.pow(1.79,308),max=Math.pow(4.9,-324); // Maximum and Minimum range of double
        double sum=0,avg=1;
        int min_idx=-1,max_idx=-1;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]; //(c)
            if(arr[i]<min){ //(b)
                min=arr[i];
                min_idx=i;
            }
            if(arr[i]>max){ //(a)
                max=arr[i];
                max_idx=i;
            }
        }
        avg=sum/arr.length; //(d)
        System.out.printf("Maximum element %.1f found at index %d\nMinimum element %.1f found at index %d\nSummation: %.1f\nAverage: %.2f\n",max,max_idx,min,min_idx,sum,avg);
        input.close();
    }
}
