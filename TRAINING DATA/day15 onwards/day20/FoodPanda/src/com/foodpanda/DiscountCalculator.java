package com.foodpanda;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class DiscountCalculator {

	@WebMethod
	public double calcDiscount(double bill) {
		double discountPercent = 20;
		double discount = bill * (discountPercent) / 100.0;
		return discount;
	}
}
