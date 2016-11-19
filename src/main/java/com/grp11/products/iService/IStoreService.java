package com.grp11.products.iService;
import com.grp11.products.domain.*;
import java.util.Collection;

public interface IStoreService {
	public void saveService(Store e);
	public void updateService(Store e);
	public Store loadService(int e);
	public Collection<Store> getService();
}