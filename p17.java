import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of the rectangle");
        int length=sc.nextInt();

        System.out.println("Enter the breadth of the rectangle");
        int breadth=sc.nextInt();

        int area=length*breadth;
        System.out.println("Area of the rectangle is :"+area);
    }
}