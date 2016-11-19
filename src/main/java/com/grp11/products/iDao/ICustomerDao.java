package com.grp11.products.iDao;
import java.util.Collection;

import com.grp11.products.domain.Customer;

public interface ICustomerDao {
		public void saveCustomer(Customer e);
		public void updateCustomer(Customer e);
		public Customer loadCustomer(int e);
		public Collection<Customer> getCustomers();
}