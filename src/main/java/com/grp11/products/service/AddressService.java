package com.grp11.products.service;

import java.util.Collection;

import org.springframework.transaction.annotation.Transactional;

import com.grp11.products.dao.*;
import com.grp11.products.domain.*;
import com.grp11.products.iDao.IAddressDao;
import com.grp11.products.iService.*;
/**
 * @author suman
 * Description: AddressService. Call crud operations from here. Add other related methods. Remember SOC and DRY
 */
public class AddressService implements IAddressService {
	private IAddressDao AddressDao;
	public IAddressDao getAddressDao() {
		return AddressDao;
	}
	public void setAddressDao(IAddressDao AddressDao) {
		this.AddressDao = AddressDao;
	}
	@Override
	@Transactional
	public void saveAddress(Address e) {
		AddressDao.saveAddress(e);
	}
	@Override
	@Transactional
	public void updateAddress(Address e) {
		AddressDao.updateAddress(e);
	}
	@Override
	@Transactional
	public Address loadAddress(int eNo) {
		return AddressDao.loadAddress(eNo);
	}
	@Override
	public Collection<Address> getAddress() {
		// To prevent our Lazy Initialization problems
		// we don't have open session in view, so instead we have to eagerly load!
		return AddressDao.getAddress();
	}
}