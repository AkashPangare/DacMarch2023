import java.util.Scanner;
class CreditScoreCalculator {
    private int creditHistory;
    private double creditUtilization;
    private boolean paymentHistory;

    public CreditScoreCalculator() {
        //this.creditHistory = creditHistory;
        //this.creditUtilization = creditUtilization;
        //this.paymentHistory = paymentHistory;
    }

    public int getCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(int creditHistory) {
        this.creditHistory = creditHistory;
    }

    public double getCreditUtilization() {
        return creditUtilization;
    }

    public void setCreditUtilization(double creditUtilization) {
        this.creditUtilization = creditUtilization;
    }

    public boolean getPaymentHistory() {
        return paymentHistory;
    }

    public void setPaymentHistory(boolean paymentHistory) {
        this.paymentHistory = paymentHistory;
    }

    public void calculateCreditScore()
            {
                int creditScore;
                if (paymentHistory) {
                    creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 55;
                    System.out.println("Credit Score : "+ creditScore);
                } else {
                    creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 35;
                    System.out.println("Credit Score : "+ creditScore);
                }
        
    }

    class credit{
        public static void main(String args[]){
            CreditScoreCalculator cr = new CreditScoreCalculator();
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter credit History:");
            cr.setCreditHistory((sc.nextInt()));

            System.out.println("Enter Credit utilization");
            cr.setCreditUtilization((sc.nextDouble()));

            System.out.println("Enter Payment history (enter True for good & False for bad):");
            cr.setPaymentHistory((sc.nextBoolean()));

            int creditHistory = cr.getCreditHistory();
            double creditUtilization = cr.getCreditUtilization();
            boolean paymentHistory = cr.getPaymentHistory();

           
                }

        }
    }
