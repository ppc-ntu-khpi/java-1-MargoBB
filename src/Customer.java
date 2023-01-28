public class Customer {
    
    private int ID = 1;
    private boolean isNew = true;
    private double total = 1000;

    public void displayCustomerInformation() {
        System.out.println("Customer ID: " + ID);
        System.out.println("Client status: " + isNew);
        System.out.println("Total purchases: " + total);
    }
}
