import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet");
        char alphabet=sc.next().charAt(0);

        if(alphabet>='A' && alphabet<='Z' || alphabet>='a' && alphabet<='z'){
            System.out.println(alphabet +" is an alphabet");
        }
        else{
            System.out.println(alphabet +" is not an alphabet");
        }
    }
}