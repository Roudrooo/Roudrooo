package PatternPrinting;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the row of the pattern: ");
        int n=input.nextInt();
        for(int r=1;r<=n;r++){
            for(int s=1;s<=n-r;s++){
                System.out.print("   ");
            }
            for(int d=1;d<=r;d++){
                System.out.print(d+"  ");
            }
            System.out.println();
        }
        input.close();
    }
}
