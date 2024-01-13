package nivell2_CallBack;

public class CreditCard implements  PaymentMethod{


    @Override
    public void pay(PaymentCallBack callBack, PaymentDetalls paymentdetall) {
        boolean success = procesPayment(paymentdetall);
        if (success) {
            callBack.onPaymentSuccess("Targeta de credito valida");
        } else {
            callBack.onPaymentError("targeta de credito no valida");
        }

    }
    private boolean procesPayment(PaymentDetalls details){
        int expiryDate = converterDate(details.getExpireDate());

        int date = 202312;
        boolean success = false;

       if(date < expiryDate){
           return success = true;
       }

        return success;
    }

    private int converterDate(String date){
        return Integer.parseInt(date.replace("-",""));
    }

}

