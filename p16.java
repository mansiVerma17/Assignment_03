import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the radius of the circle...");
        double radius=sc.nextDouble();

        double area=(22/7)*radius*radius;
        System.out.println("Area of the circle is :"+area);
    }
}