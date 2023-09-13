package clientes;

import Adapter.UserAdapter;

public class CustomerAdapter implements UserAdapter {
	
    private Customer customer;

    public CustomerAdapter(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String getName() {
        return customer.getName();
    }

    @Override
    public String getEmail() {
        return customer.getEmail();
    }
}