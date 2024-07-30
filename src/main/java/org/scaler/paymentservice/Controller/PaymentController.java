package org.scaler.paymentservice.Controller;

import com.stripe.exception.StripeException;
import org.scaler.paymentservice.dtos.CreatePaymentLinkrequestDto;
import org.scaler.paymentservice.services.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class PaymentController {

    PaymentService paymentService ;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/")
    public String createPaymentLink(@RequestBody CreatePaymentLinkrequestDto request) throws StripeException {

        return paymentService.createPaymentLink(request.getId());
    }
}
