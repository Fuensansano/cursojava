package src;

import java.util.HashMap;

public class CalcularPrecios {

	public static void main(String[] args) {
		
		/*
		 * Dado el siguiente carrito lleno de productos calcula el total
		 */
		
		Double [] cart = generateFullCart();
		
		
		// Calculate total of the cart
		for (int i = 0; i < cart.length ;i++) {
			System.out.println(cart[i]);
		}
		
		
	}
	
	private static Double randomPrice() {
		return (Math.random() * (Math.PI/(Math.random() *100)));
	}
	
	private static Double[] generateFullCart() {
		int totalOfProducts = (int) (Math.random() * 1000);
		Double vat = 1.21;
		Double [] prices = new Double[totalOfProducts];
		
		
		// Extract to method - Load products and prices
		for (int i = 0;i < totalOfProducts;i++) {
			prices[i] = (randomPrice() * vat);
		}
		return prices;
		
	}

}
