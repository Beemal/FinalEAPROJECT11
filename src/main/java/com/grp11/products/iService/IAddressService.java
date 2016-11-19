package com.grp11.products.iService;
import com.grp11.products.domain.*;
import java.util.Collection;
import com.grp11.products.domain.*;

public interface IAddressService {
	public void saveAddress(Address e);
	public void updateAddress(Address e);
	public Address loadAddress(int e);
	public Collection<Address> getAddresss();
}