package CSE110_Practice;

import java.util.Scanner;

public class StringTask1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        input.close();
    }
}
