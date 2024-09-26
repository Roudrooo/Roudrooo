 package CSE110_Practice;

import java.util.Scanner;

public class StringTask5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine().toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='z'){
                System.out.print('a');
            } else{
                System.out.print((char)(str.charAt(i)+1));
            }
        }
        System.out.println();
        input.close();
    }
}