import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the electricity unit");
        double unit=sc.nextDouble();

        if(unit<=50){
            double unit1=unit*0.50;
            double charge1=(unit1*20)/100;
            double total_bill1=unit1+charge1;
            System.out.println("Electricity unit :"+total_bill1);
        }
        else if(unit<=100){
              double unit2=unit*0.75;
            double charge2=(unit2*20)/100;
            double total_bill2=unit2+charge2;
            System.out.println("Electricity unit :"+total_bill2);
        }
        else if(unit<=250){
              double unit3=unit*1.20;
            double charge3=(unit3*20)/100;
            double total_bill3=unit3+charge3;

            System.out.println("Electricity unit :"+total_bill3);
        }
        else if(unit>250){
              double unit4=unit*1.50;
            double charge4=(unit4*20)/100;
            double total_bill4=unit4+charge4;

            System.out.println("Electricity unit :"+total_bill4);
        }
        else{
            System.out.println("Invalid unit");
        }
    }
}