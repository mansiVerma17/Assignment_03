import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the character");
        char character=sc.next().charAt(0);

        if(character>='A' && character<'Z' ){
            System.out.println("Upper case : "+character);

        }
        else if(character>='a' && character<='z'){
            System.out.println("Lower case : "+character);

        }
        else{
            System.out.println("please enter the character...");
        }
    }
}