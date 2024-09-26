package PatternPrinting;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the row of the pattern: ");
        int n=input.nextInt(),x=0;
        for(int r=1;r<=n;r++){
            for(int c=1;c<=r;c++){
                System.out.print(++x+"  ");
            }
            System.out.println();
        }
        input.close();
    }
}
