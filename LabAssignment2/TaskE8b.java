package LabAssignment2;

public class TaskE8b {
    public static void main(String[] args){
        int a = 8,b = 3;
        double c = (Math.sqrt(((a/2)*(a/2))+(b*b)));
        double area = (2*(1/2)*a*b)+(a*c);
        double circumference = 6d*c;
        System.out.println("Area of hexagon: "+area+"\n"+"Circumference of hexagon: "+circumference);
    }
}
