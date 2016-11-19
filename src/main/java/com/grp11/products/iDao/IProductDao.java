package com.grp11.products.iDao;

import java.util.Collection;

import com.grp11.products.domain.Product;

public interface IProductDao {
		public void saveProduct(Product e);
		public void updateProduct(Product e);
		public Product loadProduct(int e);
		public Collection<Product> getProducts();
}