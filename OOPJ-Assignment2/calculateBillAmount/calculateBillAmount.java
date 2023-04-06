import java.util.Scanner;
class ElectricityBill{
    private String customerName;
    private double unitConsumed;
    double billAmount;

public String getCustomerName(){
    return this.customerName;
}
public void setCustomerName(String customerName){
    this.customerName = customerName;

}
public double getUnitConsumed(){
    return this.unitConsumed;
}

public void setUnitConsumed(double unitConsumed){
    this.unitConsumed= unitConsumed;
}
    
}

class calculateBillAmount{
    public static void main(String args[]){
        ElectricityBill e = new ElectricityBill();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer name");
        e.setCustomerName((sc.nextLine()));

        System.out.println("Enter Unit consumed");
        e.setUnitConsumed((sc.nextDouble()));

        String customerName = e.getCustomerName();
        double unitConsumed = e.getUnitConsumed();

        
            if(unitConsumed < 100 && unitConsumed > 0){
                double billAmount = unitConsumed * 5;
                System.out.println("Bill amount is "+ billAmount);
            }
            else if(unitConsumed > 100 && unitConsumed <200){
                double billAmount = unitConsumed * 7;
                System.out.println("Bill amount is "+ billAmount);
            }
            else{
                double billAmount = unitConsumed * 10;
                System.out.println("Bill amount is "+ billAmount);
            }

            //System.out.println("Bill amount is "+ billAmount);


        }







        





    }
