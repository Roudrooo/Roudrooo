package PatternPrinting;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the row of the pattern: ");
        int n=input.nextInt();
        for(int r=1;r<=n;r++){
            for(int s=1;s<=n-r;s++){
                System.out.print(" ");
            }
            int x=1;
            for(int c=1;c<=r;c++){
                System.out.print(x+" ");
                x=x*(r-c)/c; // Donno how :))
            }
            System.out.println();
        }
        input.close();
    }
}
