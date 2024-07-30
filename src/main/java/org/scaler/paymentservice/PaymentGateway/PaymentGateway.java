package org.scaler.paymentservice.PaymentGateway;

import com.stripe.exception.StripeException;

public interface PaymentGateway {


    public String generatePaymentLink(Long amount) throws StripeException;
}
