import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number...");
        int num=sc.nextInt();
        System.out.println("Enter the number...");
        int num1=sc.nextInt();

        switch(num){
            case 1:
                if(num1%2==0){
                System.out.println("even");
                }
                else{
                System.out.println("odd");

                }
                break;
            default:
                System.out.println("invalid");
        }
    }
}