import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number...");
        double num=sc.nextDouble();
    
    if(num<0){
        double number=Math.abs(num);
        // number=Math.floor(num);
        double number1=Math.floor(number);
        System.out.println(number1);
    }
    else if(num>0){
        double num1=Math.floor(num);
        System.out.println(num1);
    }
    else{
        System.out.println(num);
    }

    }
}