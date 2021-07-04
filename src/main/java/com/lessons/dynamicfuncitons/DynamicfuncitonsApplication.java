package com.lessons.dynamicfuncitons;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DynamicfuncitonsApplication {

	public static void calculateTotalMealPrice(double listedMealPrice,
	double tipRate,
	double taxRate){
		double tip =  tipRate * listedMealPrice;
		double tax = taxRate * listedMealPrice;
		double result = listedMealPrice + tip + tax;
		System.out.println("Your total meal price is "+ result);
	}
	public static void main(String[] args) {
		calculateTotalMealPrice(15,.2,.08);
		calculateTotalMealPrice(25,.18,.08);
		//SpringApplication.run(DynamicfuncitonsApplication.class, args);
	}

}
