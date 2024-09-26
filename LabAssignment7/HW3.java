package LabAssignment7;

// import java.util.Scanner;

// public class HW3 {
//     public static void main(String[] args){
//         Scanner input=new Scanner(System.in);
//         String str1=input.nextLine().toLowerCase(),str2=input.nextLine().toLowerCase();    //All inputs will be converted to lowercase
//         String x="";
//         char c1,c2;
//         for(int i=0;i<str1.length();i++){   
//             c1=str1.charAt(i);
//             boolean bool=false;
//             for(int j=0;j<str2.length();j++){
//                 c2=str2.charAt(j);
//                 if(c1==c2){
//                     bool=true;
//                     break;
//                 }
//             }
//             if(!bool){    //Unique from str1
//                 x+=c1;
//             }
//         }
//         for(int i=0;i<str2.length();i++){
//             c2=str2.charAt(i);
//             boolean bool=false;
//             for(int j=0;j<str1.length();j++){
//                 c1=str1.charAt(j);
//                 if(c2==c1){
//                     bool=true;
//                     break;
//                 }
//             }
//             if(!bool){      //Unique from str2
//                 x+=c2;
//             }
//         }
//         x=x.toUpperCase();
//         System.out.println(x);
//         input.close();
//     }
// }




import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        
        int sum = 0;

        for (int i = 0; i <str1.length(); i++) {
            for (int j = 0; j <str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    sum++;
                }
            }
            char ch = (char) (str1.charAt(i) - 32);
            if (sum == 0) {
                System.out.print(ch);
            }
            sum = 0;
        }

        for (int i = 0; i <str2.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                if (str2.charAt(i) == str1.charAt(j)) {
                    sum++;
                }
            }
            char ch = (char) (str2.charAt(i) - 32);
            if (sum == 0) {
                System.out.print(ch);
            }
            sum = 0;
        }
        System.out.println();
        scanner.close();
    }
}