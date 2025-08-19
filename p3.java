import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the years of expeience");
        double experience=sc.nextDouble();

        System.out.println("Enter the salary of the employee");
        double employee_salary=sc.nextDouble();

        if(experience > 5 && employee_salary>10000){
            double bonus=(employee_salary*5)/100;
            double salary=employee_salary+bonus;
            System.out.println("5% bonus:"+bonus);
            System.out.println("Employee get the 5%  bonus :"+salary);

        }
        else{
            System.out.println("Normal salary of the employee :"+employee_salary);
        }
    }
}