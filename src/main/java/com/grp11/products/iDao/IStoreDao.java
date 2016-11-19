package com.grp11.products.iDao;

import java.util.Collection;

import com.grp11.products.domain.Store;

public interface IStoreDao {
		public void saveStore(Store e);
		public void updateStore(Store e);
		public Store loadStore(int e);
		public Collection<Store> getStore();
}