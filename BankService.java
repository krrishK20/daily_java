class Bank{
    private double principal;
    private double rate;
    private double time;
    private String costumer_type;

    public Bank(double principal, double rate){
        this.principal = principal;
        this.rate = rate;
        this.time = 5;
        this.costumer_type = "Regular";
    }
    public Bank(double principal, double rate, double time){
        this.principal = principal;
        this.rate = rate;
        this.time = time;
        this.costumer_type = "Senior Citizen";
    }
    public Bank(double principal, double rate, double time, String costumer_type){
        this.principal = principal;
        this.rate = rate;
        this.time = time;
        this.costumer_type = costumer_type;
    }

    public double getPrincipal() {
        return principal;
    }
    public double getRate() {
        return rate;
    }
    public double getTime() {
        return time;
    }
    public String getCostumer_type() {
        return costumer_type;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public void setTime(double time) {
        this.time = time;
    }
    public void setCostumer_type(String costumer_type) {
        this.costumer_type = costumer_type;
    }

    public double calculateSimpleInterest(){
        return (principal * rate * time) / 100;
    }
}


public class BankService {
    public static void main(String[] args){
        Bank bank1 = new Bank(10000, 5);
        Bank bank2 = new Bank(20000, 6, 2);
        Bank bank3 = new Bank(15000, 4.5, 3, "Senior Citizen");

        System.out.println("Simple Interest for Bank 1: " + bank1.calculateSimpleInterest());
        System.out.println("Simple Interest for Bank 2: " + bank2.calculateSimpleInterest());
        System.out.println("Simple Interest for Bank 3: " + bank3.calculateSimpleInterest());

    }

}
