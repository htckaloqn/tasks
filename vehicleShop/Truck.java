package vehicleShop;

public class Truck extends Vehicle{

	private double gvm; //Permissible Gross Vehicle Weight 
	
	public Truck(String type, String mark, String model, double gvm, double price, Store store){
		super(type, mark, model, price, store);

		if (gvm >= 0 && gvm < 40){
			
			this.gvm = gvm;
		}
			
	}
	
	public double getGvm() {
		return gvm;
	}

	public void setGvm(double gvm) {
		
		if (gvm >= 0 && gvm < 40) {
			this.gvm = gvm;
		}
	}
	
	@Override
	public String toString() {
	
		final String truckInfo = super.toString() 
				+  "\nGVM : " + getGvm() + "\n";

		return String.format("%s", truckInfo);
	}
	
}
