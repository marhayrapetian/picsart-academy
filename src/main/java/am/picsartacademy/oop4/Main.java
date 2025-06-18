package am.picsartacademy.oop4;


import am.picsartacademy.oop4.models.Customer;
import am.picsartacademy.oop4.models.ExpressOrder;
import am.picsartacademy.oop4.models.InternationalOrder;
import am.picsartacademy.oop4.models.Order;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John",
                "Smith",
                "john@gmail.com",
                "+374223344",
                "5 Azatutyun, Yerevan, Armenia");

        Customer customer2 = new Customer("Hayk",
                "Poxosyan",
                "poxosyan@gmail.com",
                "+374776578",
                "Davtashen 2rd tax. 2shenq");

        Customer customer3 = new Customer("Ani",
                "Grigoryan",
                "anigrigoryan@gmail.com",
                "+37498765437",
                "Davtashen 4rd tax. 42shenq");

        Order order1 = new ExpressOrder(customer1, 1400);
        Order order2 = new InternationalOrder(customer2, 1200);
        Order order3 = new ExpressOrder(customer3, 2000);

        System.out.println("Express Vendor: " + ExpressOrder.getVendor());
        System.out.println("International Vendor: " + InternationalOrder.getVendor());

        List<Order> orders = Arrays.asList(order1, order2, order3);


        System.out.println("Before sorting: ");
        System.out.println(orders);
        orders.sort(Collections.reverseOrder());

        System.out.println("After sorting: ");
        System.out.println(orders);
    }



}