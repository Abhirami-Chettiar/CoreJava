package com.edubridge.lambdaexpressionsdemo;
//implemented Functional Interface method with the help of Lambda Expression
public class ProductExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = (price)->{
			System.out.println("Price is : "+price);
	};
	System.out.println(p.displayProductName());
	System.out.println(Product.ProductBrand());;
	p.displayProductPrice(50000);

}
}