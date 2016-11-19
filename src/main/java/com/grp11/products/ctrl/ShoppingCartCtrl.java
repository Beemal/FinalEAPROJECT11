package com.grp11.products.ctrl;

import java.text.DateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;


import com.grp11.products.service.*;
import com.grp11.products.iService.*;
import com.grp11.products.domain.*;
@Controller
public class ShoppingCartCtrl {
	@Autowired
	private IShoppingCartService ShoppingCartService;
	private static final Logger logger = LoggerFactory.getLogger(ShoppingCartCtrl.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public String getAllShoppingCarts(Model model) {
		Collection<ShoppingCart> e = ShoppingCartService.getShoppingCarts();
//		e.forEach(System.out::println);
		return "home2";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public String addShoppingCart(@RequestBody ShoppingCart e) {
		ShoppingCartService.saveShoppingCart(e);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/{ShoppingCartNumber}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void updateCustomer(@RequestBody ShoppingCart e) {
		ShoppingCartService.updateShoppingCart(e);
	}
	
	/*@RequestMapping(value = "/customer/{customerNumber}", method =	 RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public RedirectView deleteCustomer(@PathVariable("ShoppingCartNumber") String ShoppingCartNumber) {
		ShoppingCartService.deleteShoppingCart(ShoppingCartNumber);
		return new RedirectView("/customer", true);
	}*/
	
	
}