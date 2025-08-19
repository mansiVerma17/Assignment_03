import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the attendance");
        int attendance=sc.nextInt();

        if(attendance<75){
            System.out.println("Enter the number of classes held");
            int classes=sc.nextInt();
            System.out.println("Enter the number of classes attended");
            int attend=sc.nextInt();
            double percentage=(attend*classes)/100;
            if(percentage<75){
                System.out.println("Percentage : "+percentage);
                System.out.println("You are not allow to sit in the exam");
            }
        }
        else{
                System.out.println("You are  allow to sit in the exam");

        }
    }
}