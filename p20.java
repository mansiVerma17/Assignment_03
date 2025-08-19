import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int first=sc.nextInt();
        System.out.println("Enter the second number");
        int second=sc.nextInt();

        first=first^second;
        second=first^second;
        first=first^second;

        System.out.println("First number is : "+first);
        System.out.println("Second number is : "+second);

    }
}