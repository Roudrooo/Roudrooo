package PatternPrinting;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the row of the pattern: ");
        int n=input.nextInt();
        for(int r=n;r>=1;r--){
            for(int c=1;c<=n;c++){
                System.out.print(r);
            }
            System.out.println();
        }
        input.close();
    }
}