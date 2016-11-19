package com.grp11.products.service;

import java.util.Collection;

import org.springframework.transaction.annotation.Transactional;

import com.grp11.products.iDao.IShoppingCartDao;

/**
 * @author suman
 * Description: ShoppingCartService. Call crud operations from here. Add other related methods. Remember SOC and DRY
 */
public class ShoppingCartService implements IShoppingCartService {
	private IShoppingCartDao ShoppingCartDao;
	public IShoppingCartDao getShoppingCartDao() {
		return ShoppingCartDao;
	}
	public void setShoppingCartDao(IShoppingCartDao ShoppingCartDao) {
		this.ShoppingCartDao = ShoppingCartDao;
	}
	@Override
	@Transactional
	public void saveShoppingCart(ShoppingCartDomain e) {
		ShoppingCartDao.saveShoppingCart(e);
	}
	@Override
	@Transactional
	public void updateShoppingCart(ShoppingCartDomain e) {
		ShoppingCartDao.updateShoppingCart(e);
	}
	@Override
	@Transactional
	public ShoppingCartDomain loadShoppingCart(int eNo) {
		return ShoppingCartDao.loadShoppingCart(eNo);
	}
	@Override
	public Collection<ShoppingCartDomain> getShoppingCarts() {
		// To prevent our Lazy Initialization problems
		// we don't have open session in view, so instead we have to eagerly load!
		return ShoppingCartDao.getShoppingCarts();
	}
}