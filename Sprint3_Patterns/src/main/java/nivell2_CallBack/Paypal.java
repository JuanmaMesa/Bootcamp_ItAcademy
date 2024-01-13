package nivell2_CallBack;

public class Paypal implements  PaymentMethod {
    private int money = 2000;

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public void pay(PaymentCallBack callBack, PaymentDetalls paymentDetalls) {
        boolean succes =procesPayment(paymentDetalls);
        if (succes){
            callBack.onPaymentSuccess("Paypal correcto.");
        }else {
            callBack.onPaymentError("Paypal no valido");
        }

    }

    private boolean procesPayment(PaymentDetalls details){
        boolean succes = false;
        if(money >= details.getMoney()){
            succes = true;
        }
        return succes;
    }

}
