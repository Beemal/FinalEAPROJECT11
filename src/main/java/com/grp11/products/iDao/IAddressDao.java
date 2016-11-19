package com.grp11.products.iDao;

import java.util.Collection;

import com.grp11.products.domain.Address;

public interface IAddressDao {
		public void saveAddress(Address e);
		public void updateAddress(Address e);
		public Address loadAddress(int e);
		public Collection<Address> getAddresss();
}