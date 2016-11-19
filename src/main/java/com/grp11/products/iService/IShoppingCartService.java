package com.grp11.products.iService;
import com.grp11.products.domain.*;
import java.util.Collection;

public interface IShoppingCartService {
	public void saveShoppingCart(ShoppingCart e);
	public void updateShoppingCart(ShoppingCart e);
	public ShoppingCart loadShoppingCart(int e);
	public Collection<ShoppingCart> getShoppingCarts();
}