package LabAssignment4;

import java.util.Scanner;

public class HW_2 {
    public static void main(String[] nargs){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for(int i = 1;i<=10;i++){
            System.out.print("Enter Number: ");
            int n = input.nextInt();
            sum+=n;
            System.out.printf("sum = %d\n",sum);
        }
        input.close();
    }
}
