import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the choice");
        char choice=sc.next().charAt(0);

        if(choice=='C' || choice=='c'){
            System.out.println("Enter the temperature ..");
            double f=sc.nextDouble();
            double c=(f-32)*5/9;
            System.out.println("Celsius : "+c);
        }
        else if(choice=='f' || choice=='F'){
            System.out.println("Enter the temperature ..");
            double c=sc.nextDouble();
            double f=(c*9/5)+32;
            System.out.println("Fahrenheit : "+f);
        }
        else{
            System.out.println("invalid choice");
        }
    }
}