package nivell2_CallBack;

public class PaymentDetalls {
    private String expireDate;
    private double money;

    public PaymentDetalls(String expireDate, double money) {
        this.expireDate = expireDate;
        this.money = money;
    }

    public String getExpireDate(){
        return expireDate;
    }
    public void setExpireDate(String date){
        expireDate = date;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}



