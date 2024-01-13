package nivell2_CallBack;

public class ShoeStore {

    public void processPurchase(PaymentMethod paymentMethod, PaymentDetalls paymentDetalls){

        paymentMethod.pay(new PaymentCallBack() {
            @Override
            public void onPaymentSuccess(String msm) {
                System.out.println("Pago realizado con exito: " + msm );
            }

            @Override
            public void onPaymentError(String errorMessage) {
                System.out.println("Error en el pago: " + errorMessage);

            }
        },paymentDetalls);


    }




}