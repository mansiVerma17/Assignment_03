import java.util.Scanner;
class Data{
    public static void main(Sring args[])
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the value of a");
    int a=sc.nextInt();
    System.out.println("Enter the value of b");
    int b=sc.nextInt();
    System.out.println("Enter the value of c");
    int c=sc.nextInt();

    if(a>b && a>c){
        System.out.println("A is greater than b and c");
    }
    else if(b>a && b>c){
        System.out.println("B is greater than a and c");
    }
    else{
        System.out.println("C is greater than a and b");
    }
}