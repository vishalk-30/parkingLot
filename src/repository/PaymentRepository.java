package repository;

import exception.PaymentNotFoundException;
import models.Payment;

import java.util.HashMap;
import java.util.Map;

public class PaymentRepository {
    private Map<Integer, Payment> paymentMap;

    public PaymentRepository() {
        this.paymentMap = new HashMap<>();
    }

    public Payment get(int paymentId) throws PaymentNotFoundException {
        Payment payment = paymentMap.get(paymentId);
        if(payment == null){
            throw new PaymentNotFoundException("Payment not found for this id: " + paymentId);
        } return payment;
    }
    public Payment put(Payment payment){
        paymentMap.put(payment.getId(),payment);
        return payment;
    }
}
