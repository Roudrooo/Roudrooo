package LabAssignment8;

//import java.util.Arrays;

public class CW2 {
    public static void main(String[] args) {
        int[] arr={9,-5,7,9,-5,5,7};
        System.out.println("Before removing duplicates:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=0;
                }
            }
        }
        System.out.println("After replacing duplicates with 0:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // System.out.println(Arrays.toString(arr));
    }
}
