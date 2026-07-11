package com.felipe.creditcardmanager.service;

import com.felipe.creditcardmanager.model.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 * Gerencia clientes do sistema bancário.
 */
public class Bank {
    private List<Customer> customerList = new ArrayList<>();

    /**
     * adiciona o cliente criado na lista de customerList.
     * @param name é o nome do cliente a ser cadastrado.
     * @return o cliente criado.
     */
    public Customer addCustomer(String name){
        Customer customer = new Customer(name);
        customerList.add(customer);
        return customer;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}
