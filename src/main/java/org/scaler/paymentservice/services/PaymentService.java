package org.scaler.paymentservice.services;

import com.stripe.exception.StripeException;
import org.scaler.paymentservice.PaymentGateway.stripe.StripePaymentGateway;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {


    private StripePaymentGateway stripePaymentGateway;

    public PaymentService(StripePaymentGateway stripePaymentGateway) {
        this.stripePaymentGateway = stripePaymentGateway;
    }

    public String createPaymentLink(Long orderID) throws StripeException {

        // Strign emailofCustomer
        //String PhoneNumberofCustomer
        //Long amoutn =

        //Order order = restClient.get(localhost:9090/orders/)
        //Long userId = order = order.getUserId(
        //User user = restClinet.get(locahost:9000/users


        return stripePaymentGateway.generatePaymentLink(10000L);
    }

}
