package jd_computers_and_applications.Invoice_Management.Controller;

import jd_computers_and_applications.Invoice_Management.Data.OrderDetails;
import jd_computers_and_applications.Invoice_Management.Data.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @GetMapping(path = "/order")
    public List<OrderDetails> getOrders() {
        return orderRepository.findAll();
    }

    @GetMapping(path = "/order/{orderId}")
    public OrderDetails getOrder(@PathVariable int orderId) {
        return orderRepository.findById(orderId).get();
    }

    @PostMapping(path = "/order")
    public OrderDetails createOrder(@RequestBody OrderDetails orderDetails) {
        return orderRepository.save(orderDetails);
    }

    @PutMapping(path = "/order/{orderId}")
    public OrderDetails updateOrder(@PathVariable int orderId, @RequestBody OrderDetails orderDetails) {
        return orderRepository.findById(orderId).orElseThrow(() -> new RuntimeException("order Not Found"));
    }

    @DeleteMapping(path = "/order/{orderId}")
    public void deleteOrder(@PathVariable int orderId) {
        orderRepository.deleteById(orderId);
    }
}
