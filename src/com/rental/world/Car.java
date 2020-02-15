package com.rental.world;

public class Car extends Automotive implements Transport {

	private String name;
	private int price = 0;
	private int load = 0;
	private int quantity = 0;

	public Car(String name, int price, int load) {
		this.name = name;
		this.price = price;
		this.load = load;

	}

	public void addQuantity() {
		quantity++;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public int calSubtotal() {
		int subTotal = quantity * price;
		return subTotal;
	}

	@Override
	public int getLoad() {
		load = load * quantity;
		return load;
	}

}
