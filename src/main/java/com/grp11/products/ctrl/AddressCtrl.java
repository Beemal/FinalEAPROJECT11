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

import com.grp11.products.domain.Address;
import com.grp11.products.iService.IAddressService;


@Controller
public class AddressCtrl {
	@Autowired
	private IAddressService AddressService;
	private static final Logger logger = LoggerFactory.getLogger(AddressCtrl.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public String getAllAddresss(Model model) {
		Collection<Address> e = AddressService.getAddresss();
//		e.forEach(System.out::println);
		return "home2";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public String addAddress(@RequestBody Address e) {
		AddressService.saveAddress(e);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/{AddressNumber}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void updateCustomer(@RequestBody Address e) {
		AddressService.updateAddress(e);
	}
	
	/*@RequestMapping(value = "/customer/{customerNumber}", method =	 RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public RedirectView deleteCustomer(@PathVariable("AddressNumber") String AddressNumber) {
		AddressService.deleteAddress(AddressNumber);
		return new RedirectView("/customer", true);
	}*/
	
	
}