package jd_computers_and_applications.Payment_Management.Service;

import jd_computers_and_applications.Payment_Management.Data.PaymentDetails;
import jd_computers_and_applications.Payment_Management.Data.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public List<PaymentDetails> getAllPayments() {
        return paymentRepository.findAll();
    }

    public PaymentDetails getPaymentDetails(int id) {
        Optional<PaymentDetails> paymentDetails = paymentRepository.findById(id);
        if (paymentDetails.isPresent()) {
            return paymentDetails.get();
        }
        else{
            return null;
        }
    }

    public void addPayment(PaymentDetails paymentDetails) {
        paymentRepository.save(paymentDetails);
    }
    public void updatePayment(int id, PaymentDetails paymentDetails) {
        if (paymentRepository.findById(id).isPresent()) {
            paymentRepository.save(paymentDetails);
        }
        else{
            System.out.println("payment not found");
        }
    }
    public void deletePayment(int id) {
        if(paymentRepository.existsById(id)) {
            paymentRepository.deleteById(id);
        }
        else {
            System.out.println("payment not found");
        }
    }
}
