import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary");
        double salary=sc.nextDouble();
        if(salary<=10000){
            double hra=(salary*20)/100;
            double da=(salary*80)/100;
            double total_salary1=salary+hra+da;
            System.out.println("Total salary of the employee is : "+total_salary1);
        }
        else if(salary<=20000){
            double hra1=(salary*25)/100;
            double da1=(salary*90)/100;
            double total_salary2=salary+hra1+da1;
            System.out.println("Total salary of the employee is : "+total_salary2);
        }
        else if(salary>20000){
            double hra2=(salary*30)/100;
            double da2=(salary*95)/100;
            double total_salary3=salary+hra2+da2;
            System.out.println("Total salary of the employee is : "+total_salary3);
        }
        else{
            System.out.println("Salary of the employee is : "+salary);
        }
    }
}