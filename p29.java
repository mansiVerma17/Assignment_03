import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int first=sc.nextInt();
        System.out.println("Enter the second number");
        int second=sc.nextInt();
        System.out.println("Enter the third number");
        int third=sc.nextInt();
        System.out.println("Enter the fourth number");
        int fourth=sc.nextInt();

        if(first<second && first<third && first<fourth){
            System.out.println("First number is smaller...");
        }
        else if(second<first && second<third && second<fourth){
            System.out.println("second number is smaller...");

        }
        else if(third<first && third<second && third<fourth){
            System.out.println("Third number is smaller...");

        }
        else{
            System.out.println("Fourth number is smaller...");
            
        }
    }
}