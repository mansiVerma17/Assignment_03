import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();

        if(age>=18 && age<50){
            System.out.println("Young People");

        }
        else if(age>=50 && age<90){
            System.out.println("Oldest People");
        }
        else if(age<18){
            System.out.println("Children");
        }
        else{
            System.out.println("Invalid age....");
        }
    }
}