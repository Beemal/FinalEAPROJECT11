package com.grp11.products.iService;

import com.grp11.products.domain.*;
import java.util.Collection;
import com.grp11.products.domain.*;

public interface IProductService {
	public void saveProduct(Product e);
	public void updateProduct(Product e);
	public Product loadProduct(int e);
	public Collection<Product> getProducts();
}