import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cost of purchased quantity");
        double cost=sc.nextDouble();
        double unit =100;
        double new_cost=cost*unit;
        System.out.println(new_cost);
    
        if(new_cost>1000){
            double discount=(new_cost*10)/100;
            double total_cost=new_cost-discount;
            System.out.println("We received the discount on the purchased quantity:"+total_cost);
        }
        else{
            System.out.println("we never received the discount on the purchased quantity :"+new_cost);
        }
    }
}