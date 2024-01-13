package nivell2_CallBack;

public class BankAccount implements  PaymentMethod {
double money = 5000;


    @Override
    public void pay(PaymentCallBack callBack, PaymentDetalls paymentDetalls) {

        boolean succes = procesPayment(paymentDetalls);

        if (succes){
            callBack.onPaymentSuccess("Cuenta bancaria aceptada.");
        }else {
            callBack.onPaymentError("Cuenta bancaria no aceptada.");
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
