package jd_computers_and_applications.Payment_Management.Controller;

import jd_computers_and_applications.Payment_Management.Data.PaymentDetails;
import jd_computers_and_applications.Payment_Management.Data.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    PaymentRepository paymentRepository;

    @GetMapping(path = "/payments")
    public List<PaymentDetails> getPayments() {
        return paymentRepository.findAll();
    }

    @GetMapping(path = "/payments/{paymentId}")
    public PaymentDetails getPayment(@PathVariable int paymentId) {
        return paymentRepository.findById(paymentId).get();
    }

    @PostMapping(path = "/payments")
    public PaymentDetails createPayment(@RequestBody PaymentDetails paymentDetails) {
        return paymentRepository.save(paymentDetails);
    }

    @PutMapping(path = "/payments/{paymentId}")
    public PaymentDetails updatePayment(@PathVariable int paymentId, @RequestBody PaymentDetails paymentDetails) {
        return paymentRepository.findById(paymentId).orElseThrow(() -> new RuntimeException("payment Not Found"));
    }

    @DeleteMapping(path = "/payments/{paymentId}")
    public void deletePayment(@PathVariable int paymentId) {
        paymentRepository.deleteById(paymentId);
    }
}
