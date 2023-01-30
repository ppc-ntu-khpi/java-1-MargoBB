<<<<<<< HEAD
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

## Завдання №2. Додаткове завдання

1. Змінити код так, щоб додати конструктор за замовчуванням, який ініціалізує атрибути початковими значеннями -

**"Customer.java"**

```

public class Customer {
    
    int ID;
    boolean isNew;
    double total;

    public Customer(){}

}


```

**"CustomerTest.java"**

```

public class CustomerTest {
    
    public static void main(String args[]) {
        Constructor constructor = new Constructor();
        constructor.foo();
    }
}

```

**"Constructor.java"**

```

public class Constructor {
    
    public void foo(){
        Customer customer = new Customer();
        customer.ID = 1;
        customer.isNew = true;
        customer.total = 1000;

        System.out.println(customer.ID + " " + customer.isNew + " " + customer.total);
    }
}

```

2. Результати працюючого коду -

![](https://github.com/ppc-ntu-khpi/java-1-MargoBB/blob/main/Solution/done1.png)
=======
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
>>>>>>> 21ccc9e90ff478eb8e88b3899ccb4826e3fde975
