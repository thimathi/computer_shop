package jd_computers_and_applications.Payment_Management.Service;

import jd_computers_and_applications.Payment_Management.Data.PaymentMethodDetails;
import jd_computers_and_applications.Payment_Management.Data.PaymentMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentMethodService {

    @Autowired
    PaymentMethodRepository paymentMethodRepository;

    public List<PaymentMethodDetails> getAllPaymentMethods() {
        return paymentMethodRepository.findAll();
    }

    public PaymentMethodDetails getPaymentMethodDetails(int id) {
        Optional<PaymentMethodDetails> paymentMethodDetails = paymentMethodRepository.findById(id);
        if (paymentMethodDetails.isPresent()) {
            return paymentMethodDetails.get();
        }
        else{
            return null;
        }
    }

    public void addPaymentMethod(PaymentMethodDetails paymentMethodDetails) {
        paymentMethodRepository.save(paymentMethodDetails);
    }
    public void updatePaymentMethod(int id, PaymentMethodDetails paymentMethodDetails) {
        if (paymentMethodRepository.findById(id).isPresent()) {
            paymentMethodRepository.save(paymentMethodDetails);
        }
        else{
            System.out.println("paymentMethod not found");
        }
    }
    public void deletePaymentMethod(int id) {
        if(paymentMethodRepository.existsById(id)) {
            paymentMethodRepository.deleteById(id);
        }
        else {
            System.out.println("paymentMethod not found");
        }
    }
}
