import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt(),b=input.nextInt(),c=input.nextInt(),l1,l2,l3;
        if(a>b&&a>c){
            l1=a;
            if(b>c){
                l2=b;
                l3=c;
            }else{
                l2=c;
                l3=b;
            }
        } else if(b>a&&b>c){
            l1=b;
            if(a>c){
                l2=a;
                l3=c;
            }else{
                l2=c;
                l3=a;
            }
        }else{
            l1=c;
            if(a>b){
                l2=a;
                l3=b;
            }else{
                l2=b;
                l3=a;
            }
        }
        System.out.println("Largest:"+l1+"\n2nd Largest:"+l2+"\nSmallest:"+l3);
        System.out.println("Avg:"+(l1+l2)/2);
        input.close();

    }
}