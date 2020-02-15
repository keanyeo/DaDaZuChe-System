package com.rental.world;

public class Truck extends Automotive implements Tranship {

	private String name;
	private int price = 0;
	private int load = 0;
	private int loadw = 0;
	private int quantity = 0;

	public Truck(String name, int price, int load, int loadw) {
		this.name = name;
		this.price = price;
		this.load = load;
		this.loadw = loadw;
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

	@Override
	public int getLoadw() {
		loadw = loadw * quantity;
		return loadw;
	}

}
