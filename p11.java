import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the gender");
        char gender=sc.next().charAt(0);

        System.out.println("Enter you age");
        int age=sc.nextInt();

        System.out.println("Enter you marital status");
        char marital=sc.next().charAt(0);

        if(gender=='F' || gender=='f'){
            System.out.println("She will work only in the urban area");
        }
        else if(gender=='m' || gender=='M' && age>=20 &&age<40){
            System.out.println("He will work anywhere");
        }
        else if(gender=='m' || gender=='M' && age>=40 &&age<60){
            System.out.println("he will work in the urban area");
        }
        else{
            System.out.print("ERROR...");
        }
    }
}