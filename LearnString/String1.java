package LearnString;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String str=input.nextLine().toLowerCase();
        int vc=0,cc=0;
        for(int i=0;i<str.length();i++){
            char j=str.charAt(i);
            if(j>='a'&&j<='z'){
                if(j=='a'||j=='e'||j=='i'||j=='o'||j=='u'){
                    vc++;
                } else{
                    cc++;
                }
            } 
        }
        if(vc%3==0&&cc%5==0&&vc>0&&cc>0){
            System.out.println("Aaarr! Me Plunder!!");
        } else{
            System.out.println("Blimey! No Plunder!!");
        }
        input.close();
    }
}
