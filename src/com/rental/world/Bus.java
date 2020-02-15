package com.rental.world;

public class Bus extends Automotive implements Transport {

	private String name;
	private int price = 0;
	private int load = 0;
	private int quantity = 0;

	public Bus(String name, int price, int load) {
		this.name = name;
		this.price = price;
		this.load = load;
	}

	@Override
	public void addQuantity() {
		quantity++;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int calSubtotal() {
		int subTotal = quantity * price;
		return subTotal;
	}

	@Override
	public int getQuantity() {

		return quantity;
	}

	@Override
	public int getLoad() {
		load = load * quantity;
		return load;
	}

}
