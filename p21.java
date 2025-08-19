import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value");
        int firstNum=sc.nextInt();

        System.out.println("Enter the second value ");
        int secondNum=sc.nextInt();

        if(firstNum>secondNum){
            System.out.println("First number is greater than second number");
        }
        else{
            System.out.println("Second number is greate than first number");
        }
    }
}