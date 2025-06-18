package am.picsartacademy.oop4.models;

public class ExpressOrder extends Order implements Deliverable {
    private static String vendor = "DHL";
    public ExpressOrder(Customer customer, double price){
        super(customer, price);
    }
    @Override
    public double calculateDeliveryPrice() {
        return price * 0.1;
    }
    public void printSummary(){
        super.printSummary();
        System.out.println("Type: Express Order. Delivery Price AMD" + calculateDeliveryPrice());
    }
    public static String getVendor(){
        return vendor;
    }
    public static void setVendor(String vendor){
        ExpressOrder.vendor = vendor;

    }

}

