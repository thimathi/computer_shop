package jd_computers_and_applications.Invoice_Management.Service;

import jd_computers_and_applications.Invoice_Management.Data.OrderDetails;
import jd_computers_and_applications.Invoice_Management.Data.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public List<OrderDetails> getAllOrders() {
        return orderRepository.findAll();
    }

    public OrderDetails getOrderDetails(int id) {
        Optional<OrderDetails> orderDetails = orderRepository.findById(id);
        if (orderDetails.isPresent()) {
            return orderDetails.get();
        }
        else{
            return null;
        }
    }

    public void addOrder(OrderDetails orderDetails) {
        orderRepository.save(orderDetails);
    }
    public void updateOrder(int id, OrderDetails orderDetails) {
        if (orderRepository.findById(id).isPresent()) {
            orderRepository.save(orderDetails);
        }
        else{
            System.out.println("order not found");
        }
    }
    public void deleteOrder(int id) {
        if(orderRepository.existsById(id)) {
            orderRepository.deleteById(id);
        }
        else {
            System.out.println("order not found");
        }
    }
}
