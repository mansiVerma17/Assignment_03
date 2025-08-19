import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first value");
        double first=sc.nextDouble();

        System.out.println("Enter the second value");
        double second=sc.nextDouble();

        System.out.println("Enter the arithmetic operation");
        char operator=sc.next().charAt(0);

        switch(operator){
            case '+':
               double add=first+second;
                System.out.println("Addition :"+add);
                break;
            case '-':
               double sub=first-second;
                System.out.println("Substraction :"+sub);
                break;
            case '*':
               double mul=first*second;
                System.out.println("Multiplication :"+mul);
                break;
            case '/':
                double div=first+second;
                System.out.println("Division :"+div);
                break;
            default:
                System.out.println("Inavlid operator...");
        }
    }
}