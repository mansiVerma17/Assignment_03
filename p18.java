import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the English marks");
        double english=sc.nextDouble();

        System.out.println("Enter the  Hindi marks");
        double hindi=sc.nextDouble();

        System.out.println("Enter the Science marks");
        double science=sc.nextDouble();

        System.out.println("Enter the Maths marks");
        double maths=sc.nextDouble();

        System.out.println("Enter the Sanskrit marks");
        double sanskrit=sc.nextDouble();

        double total_marks=english + hindi + science + maths + sanskrit;
        System.out.println("You got "+ total_marks + "marks out of 500");

        double percentage=(total_marks*100)/500;
        System.out.println("Percentage :" +percentage);
    }
}