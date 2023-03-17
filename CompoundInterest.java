class CompoundInterest{
public static void main(String args[]){
double amount=50000000,Principle,Interest;
int Year=5;
float Rate=10.75f;
Principle=amount*((1+Rate/100)*(1+Rate/100)*(1+Rate/100)*(1+Rate/100)*(1+Rate/100));
System.out.println("Principle="+Principle);
Interest=Principle-amount;
System.out.println("Interest ="+Interest);
}
}