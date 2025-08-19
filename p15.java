import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cost of the bike");
        int cost=sc.nextInt();
        if(cost>100000){
            int tax=(cost*15)/100;
            int total_cost=tax+cost;
            System.out.println("tax : "+tax);
            System.out.println("Total cost : "+total_cost);

        }
        else if(cost>5000 && cost<=10000){
            int tax=(cost*10)/100;
            int total_cost=tax+cost;
            System.out.println("tax : "+tax);
            System.out.println("Total cost : "+total_cost);

        }
        else if(cost<=5000){
            int tax=(cost*5)/100;
            int total_cost=tax+cost;
            System.out.println("tax : "+tax);
            System.out.println("Total cost : "+total_cost);

        }
        else{
            System.out.println("Cost :"+cost);
        }

    }
}