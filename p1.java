/*1. Take values of length and breadth of a rectangle from user and check if it is square or not.*/
import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of the rectangle");
        double length=sc.nextDouble();

        System.out.println("Enter the breadth of the rectangle");
        double breadth=sc.nextDouble();

        if(length==breadth){
            System.out.println("It is a perfect square");
        }
        else{
            System.out.println("It is not a perfect square");
        }
    }
}