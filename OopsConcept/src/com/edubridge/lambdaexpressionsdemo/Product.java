package com.edubridge.lambdaexpressionsdemo;
@FunctionalInterface

public interface Product {
	
	void displayProductPrice(int price);
	default String displayProductName() {
		return "Product Name : Rose Gold Women's Watch";
	}
	static String ProductBrand() {
		return "Product Branch : MICHELE";
	}

}
