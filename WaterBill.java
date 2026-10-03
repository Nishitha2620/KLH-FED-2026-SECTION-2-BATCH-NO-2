import java.util.*;
public class WaterBill {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println( " Enter the water consumption: ");
        int Consumption = obj.nextInt();
        int bill;
        if(Consumption <= 600) {
            bill = 200;
        }else{
            bill = 400;

        
        System.out.println("Water Bill: "+bill);
        }

    }


    
}