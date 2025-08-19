import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first side of the triangle");
        int first=sc.nextInt();

        System.out.println("Enter the second side of the triangle");
        int second=sc.nextInt();

        System.out.println("Enter the third side of the triangle");
        int third=sc.nextInt();
        if(first==second && first==third && second==third)
        {
            System.out.println("It is an equilateral triangle");

        }
        else if(first==second || second==third ){
            System.out.println("It is an isosceles triangle");
        }
        else{
            System.out.println("It is a scalene triangle");
        }
    }
}