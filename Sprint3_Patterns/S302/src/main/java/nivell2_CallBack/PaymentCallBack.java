package nivell2_CallBack;

public interface PaymentCallBack {

    void onPaymentSuccess(String msm);
    void onPaymentError(String errorMessage);

}
