import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first side of the triangle");
        int first=sc.nextInt();
        System.out.println("Enter the second side of the triangle");
        int second=sc.nextInt();
        System.out.println("Enter the third side of the triangle");
        int third =sc.nextInt();

        int total=first+second+third;

        if(total==180){
            System.out.println("Triangle is valid");
        }
        else{
            System.out.println("Triangle is not valid");

        }

    }
}