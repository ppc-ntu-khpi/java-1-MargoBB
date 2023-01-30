# Результат роботи коду

## Завдання №1. Набір та запуск стартового коду

1. Код програми **"Customer.java"** -

```

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


```

2. Код програми **"CustomerTest.java"** -

```

public class CustomerTest {
    
    public static void main(String args[]) {
        Customer myCustomer = new Customer();
        myCustomer.displayCustomerInformation();
    }
}

```

3. Результати роботи стартового коду -

![](https://github.com/ppc-ntu-khpi/java-1-MargoBB/blob/main/Solution/done.png)