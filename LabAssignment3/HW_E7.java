package LabAssignment3;

import java.util.Scanner;

public class HW_E7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount the customer need to pay(Taka): ");
        int need_to_pay = input.nextInt();
        System.out.print("Enter the amount, customer gave(Taka): ");
        int given = input.nextInt();
        int ret = given - need_to_pay;
        if(need_to_pay < given){
            System.out.println("The returned amount is "+ret+" taka.");
            int change,extra;
            change = ret/100;
            System.out.println("100 taka note: "+change);
            extra = ret%100;
            change = extra/50;
            System.out.println("50 taka note: "+change);
            extra = extra%50;
            change = extra/20;
            System.out.println("20 taka note: "+change);
            extra = extra%20;
            change = extra/10;
            System.out.println("10 taka note: "+change);
            extra = extra%10;
            change = extra/5;
            System.out.println("5 taka coin: "+change);
            extra = extra%5;
            change = extra/2;
            System.out.println("2 taka coin: "+change);
            extra = extra%2;
            change = extra/1;
            System.out.println("1 taka coin: "+change);
        } else if(need_to_pay > given){
            int to_be_paid = need_to_pay - given;
            System.out.println("Please pay "+to_be_paid+" taka more.");
        } else{
            System.out.println("The returned amount is 0 taka.");
        }
        input.close();
    }
}
