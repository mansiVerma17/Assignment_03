import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(num>=1000 && num<=9999){
            int num1=num%10;
            int num2=(num/10)%10;
            int num3=(num/100)%10;
            int num4=(num/1000)%10;
            int new_num=num*1000+num2*100+num3*10+num4;
            System.out.println("Reversed number is : "+new_num);
        }
        else{
            System.out.println("Enter the 4 digit number...");
        }
    }
}