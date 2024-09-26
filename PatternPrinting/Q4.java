package PatternPrinting;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the row of the pattern: ");
        int n=input.nextInt();
        for(int r=1;r<=n;r++){
            for(int c=1;c<=r;c++){
                System.out.print("# ");
            }
            System.out.println();
        }
        input.close();
    }
}