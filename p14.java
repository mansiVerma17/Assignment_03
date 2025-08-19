import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the marks of the Physics");
        double physics=sc.nextDouble();

        System.out.println("Enter the marks of the chemistry");
        double chemistry=sc.nextDouble();

        System.out.println("Enter the marks of the biology");
        double biology=sc.nextDouble();

        System.out.println("Enter the marks of the maths");
        double maths=sc.nextDouble();

        System.out.println("Enter the marks of the computer");
        double computer=sc.nextDouble();

        double total_marks=physics+chemistry+biology+maths+computer;
        double percentage=(total_marks*100)/500;

        if(percentage>=90){
            System.out.println("Grade A");
        }
        else if(percentage>=80){
            System.out.println("Grade B");

        }
        else if(percentage>=70){
            System.out.println("Grade C");

        }
        else if(percentage>=60){
            System.out.println("Grade D");

        }
        else if(percentage>=40){
            System.out.println("Grade E");

        }else{
            System.out.println("Grade F");

        }
    }
}