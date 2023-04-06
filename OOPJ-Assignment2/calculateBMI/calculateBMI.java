import java.util.Scanner;
class BMI{
    private double height; //in metre
    private double weight; //in kg


public BMI(){
    //contructor
}
public void setHeight(double height){
    this.height = height;

}
public double getHeight(){
    return this.height;
}
public void setWeight(double weight){
    this.weight = weight;
}
public double getWeight(){
    return this.weight;
}
}


class calculateBMI{
    public static void main(String args[]){
     BMI a = new BMI();
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Height in metre: ");
     a.setHeight(sc.nextDouble());

     System.out.println("Enter Weight in Kg: ");
     a.setWeight(sc.nextDouble());

     Double height=a.getHeight();
     Double weight=a.getWeight();

     Double BMI = (weight/(height * height));

     System.out.println("BMI is: "+BMI);
    }

}