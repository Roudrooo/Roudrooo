package LabAssignment9;

import java.util.Scanner;

public class HW3 {
    public static double calcTax(int x,int y){ // A
        if(x<18 || y<10000){
            return 0.0;
        } else if(10000<=y && y<=20000){
            return y*0.07f;
        } else{
            return y*0.14f; 
        }
    }
    public static void calcYearlyTax(){ // B
        Scanner input=new Scanner(System.in);
        System.out.print("Age: ");
        int x=input.nextInt();
        double ytax=0;
        double[] mtax=new double[12];
        for(int i=1;i<=12;i++){
            System.out.printf("Salary for Month%d: ",i);
            int y=input.nextInt();
            mtax[i-1]=calcTax(x,y);
            ytax+=calcTax(x,y);
        }
        System.out.println("Taxes: ");
        for(int i=0;i<mtax.length;i++){
            System.out.printf("Month%d tax: %.1f\n",i+1,mtax[i]);
        }
        System.out.printf("Total Yearly Tax: %.1f\n",ytax);
        input.close();
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // A:
        System.out.println("A:\nEnter age and salary:");
        int m=input.nextInt(),n=input.nextInt();
        System.out.printf("Tax: %.1f\n",calcTax(m,n));
        // B:
        System.out.println("B:");
        calcYearlyTax();
        input.close();
    }
}








// package LabAssignment9;

// import java.util.Scanner;

// public class HW3 {
//     public static double calcTax(int x,int y){ // A
//         if(x<18 || y<10000){
//             return 0.0;
//         } else if(10000<=y && y<=20000){
//             return y*0.07f;
//         } else{
//             return y*0.14f; 
//         }
//     }
//     public static void calcYearlyTax(){ // B
//         Scanner input=new Scanner(System.in);
//         System.out.print("Age: ");
//         int x=input.nextInt();
//         double ytax=0;
//         for(int i=1;i<=12;i++){
//             System.out.printf("Salary for Month%d: ",i);
//             int y=input.nextInt();
//             System.out.printf("Month%d tax: %.1f\n",i,calcTax(x,y));
//             ytax+=calcTax(x,y);
//         }
//         System.out.printf("Total Yearly Tax: %.1f",ytax);
//         input.close();
//     }
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         // A:
//         System.out.println("A:\nEnter age and salary:");
//         int m=input.nextInt(),n=input.nextInt();
//         System.out.printf("Tax: %.1f\n",calcTax(m,n));
//         // B:
//         System.out.println("B:");
//         calcYearlyTax();
//         input.close();
//     }
// }