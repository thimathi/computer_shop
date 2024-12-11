package jd_computers_and_applications.Payment_Management.Controller;

import jd_computers_and_applications.Payment_Management.Data.PaymentMethodDetails;
import jd_computers_and_applications.Payment_Management.Data.PaymentMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentMethodController {

    @Autowired
    PaymentMethodRepository paymentMethodRepository;

    @GetMapping(path = "/paymentMethods")
    public List<PaymentMethodDetails> getPaymentMethods() {
        return paymentMethodRepository.findAll();
    }

    @GetMapping(path = "/paymentMethods/{paymentMethodId}")
    public PaymentMethodDetails getPaymentMethod(@PathVariable int paymentMethodId) {
        return paymentMethodRepository.findById(paymentMethodId).get();
    }

    @PostMapping(path = "/paymentMethods")
    public PaymentMethodDetails createPaymentMethod(@RequestBody PaymentMethodDetails paymentMethodDetails) {
        return paymentMethodRepository.save(paymentMethodDetails);
    }

    @PutMapping(path = "/paymentMethods/{paymentMethodId}")
    public PaymentMethodDetails updatePaymentMethod(@PathVariable int paymentMethodId, @RequestBody PaymentMethodDetails paymentMethodDetails) {
        return paymentMethodRepository.findById(paymentMethodId).orElseThrow(() -> new RuntimeException("PaymentMethod Not Found"));
    }

    @DeleteMapping(path = "/paymentMethods/{paymentMethodId}")
    public void deletePaymentMethod(@PathVariable int paymentMethodId) {
        paymentMethodRepository.deleteById(paymentMethodId);
    }
}

