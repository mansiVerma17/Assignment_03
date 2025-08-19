import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number that you want to check it is even or odd...");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println(num +" is an even number");
        }
        else{
            System.out.println(num +" is an odd number");
        }
    }
}