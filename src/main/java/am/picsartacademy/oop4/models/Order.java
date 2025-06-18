package am.picsartacademy.oop4.models;

public class Order implements Comparable<Order> {
    protected Customer customer;
    protected double price;

    public Order(Customer customer) {
        this.customer = customer;
        this.price = 0;
    }

    public Order(Customer customer, double price) {
        this.customer = customer;
        this.price = price;
    }


    public void printSummary() {
        System.out.println("Order Price: AMD" + price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void ship() {
        if (price <= 0) {
            throw new IllegalArgumentException("Payment failed. Order cannot be sent.");
        }
        System.out.println("The order has been sent to the customer " + customer.getFirstName() + " " + customer.getLastName());
    }



    @Override
    public String toString() {
        return customer + " " + price;
    }
    public int compareTo(Order o) {
        if (this.price < o.price) {
            return -1;
        } else if (this.price > o.price) {
            return 1;
        } else {
            return 0;

        }
    }
}
