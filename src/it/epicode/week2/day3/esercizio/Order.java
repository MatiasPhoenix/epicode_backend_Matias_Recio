package it.epicode.week2.day3.esercizio;

import java.time.LocalDate;
import java.util.List;

public class Order {
    public String status;
    public LocalDate orderDate;
    public LocalDate deliveryDate;
    public List<Product> products;
    public Customer customer;

}
