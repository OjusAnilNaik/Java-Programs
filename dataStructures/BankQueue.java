package dataStructures;

import java.util.*;

public class BankQueue {
    public static void main(String[] args) {

        Queue<Integer> customers = new LinkedList<>();

        customers.add(101);
        customers.add(102);
        customers.add(103);
        customers.add(104);
        customers.add(105);

        while (!customers.isEmpty()) {
            int customer = customers.poll();
            System.out.println("Customer " + customer + " is being served.");
        }

        if (customers.isEmpty()) {
            System.out.println("No customer is waiting");
        }
    }
}