package com.grp11.products.iDao;

import java.util.Collection;


import com.grp11.products.domain.*;
public interface IShoppingCartDao {
		public void saveShoppingCart(ShoppingCart e);
		public void updateShoppingCart(ShoppingCart e);
		public ShoppingCart loadShoppingCart(int e);
		public Collection<ShoppingCart> getShoppingCarts();
}