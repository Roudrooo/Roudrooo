package CSE110_Practice;

import java.util.Scanner;

public class StringTask6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine().toUpperCase();
        int vow=0,con=0;
        for(int i=0;i<str.length();i++){
            char test=str.charAt(i);
            if(test>='A'&&test<='Z'){
                if(test=='A'||test=='E'||test=='I'||test=='O'||test=='U'){
                    vow++;
                } else{
                    con++;
                }
            }
        }
        System.out.printf("Vowel = %d\nConsonant = %d\n",vow,con);
        input.close();
    }
}
