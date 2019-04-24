
public class lori extends automotive implements shipment {
	private String name;
	private int price=0;
	private int loadw=0;
	private int quantity=0;
	
	public lori(String name,int price,int loadw) {
		this.name=name;
		this.price=price;
		this.loadw=loadw;	
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
		int subTotal = quantity*price;
		return subTotal;
	}

	@Override
	public int getQuantity() {
		return quantity;
	}

	@Override
	public int getLoadw() {
		loadw = loadw*quantity;
		return loadw;
	}


	
	
	

	
	
	
	

	
	
	
}
