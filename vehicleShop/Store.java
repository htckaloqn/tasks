package vehicleShop;

public class Store {
	
	private String storeName;
	private String address;
	private String managerName;
	
	public Store(String storeName, String address, String managerName) {
		
		if (storeName != null && address != null && managerName != null) {
			
			this.storeName = storeName;
			this.address = address;
			this.managerName = managerName;
		}
	}
	
	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		
		if (storeName != null) {
			this.storeName = storeName;
		}
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		
		if (address != null) {
			this.address = address;
		}
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		
		if (managerName != null) {
			this.managerName = managerName;
		}
	}
	
	@Override
	public String toString() {
		
		final String storeInfo =  getAddress();
			
		return String.format("%s", storeInfo);
		
	}

}
