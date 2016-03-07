package vehicleShop;

public abstract class Vehicle {
	
	private String type;
	private String mark;
	private String model;
	private double price;
	private Store store;
	
	public Vehicle() {
		
		mark = "SampleMark";
		model = "SampleModel";
		price = 1000.00;
		store = null;
	}

	public Vehicle(String type, String mark, String model,double price, Store store) {
		
		if (type != null && mark != null && model != null && store != null ) {
			
			this.type = type;
			this.mark = mark;
			this.model = model;
			this.store = store;
			
			if (price > 0 && price < 999999) {
				
				this.price = price;
			}
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		
		if (type != null) {
			this.type = type;
		}
	}
	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		
		if (mark != null) {
			this.mark = mark;
		}
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		
		if (model != null) {
			this.model = model;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
	
		if (price > 0 && price < 999999) {
			this.price = price;
		}
	}
	
	@Override
	public String toString() {
	
		final String VehicleInfo = "\nType : " + getType()
		+ "\nMark : " + getMark() 
		+ "\nModel : " + getModel()
		+ "\nPrice : " + price
		+ "\nStore : " + store;
		
		return String.format("%s", VehicleInfo);
	}
	
	
	
	
	
	


}
