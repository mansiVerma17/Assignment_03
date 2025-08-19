import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first value");
        int firstNum=sc.nextInt();
        System.out.println("Enter the second value");
        int secondNum=sc.nextInt();

        System.out.println("First number is:"+firstNum);
        System.out.println("Second number is:"+secondNum);
        int third=firstNum;
        firstNum=secondNum;
        secondNum=third;
        System.out.println("After swapping of the first number is :"+firstNum);
        System.out.println("After swapping of the second number is :"+secondNum);

    }
}