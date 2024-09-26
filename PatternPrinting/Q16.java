package PatternPrinting;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the row of the pattern: ");
        int n=input.nextInt();
        for(int r=1;r<=n;r++){
            for(int s=1;s<=r-1;s++){
                System.out.print("   ");
            }
            for(int c=1;c<=n-r+1;c++){
                System.out.print(c+"  ");
            }
            System.out.println();
        }
        input.close();
    }
}
