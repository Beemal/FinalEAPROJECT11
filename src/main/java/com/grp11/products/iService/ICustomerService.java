package com.grp11.products.iService;
import com.grp11.products.domain.*;
import java.util.Collection;

public interface ICustomerService {
	public void saveCustomer(Customer e);
	public void updateCustomer(Customer e);
	public Customer loadCustomer(int e);
	public Collection<Customer> getCustomers();
}