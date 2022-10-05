package OOPS_EncapSulation;

public class Customer {
	
	private String CustomerName;
	private String CustomerEmailID;
	private String Address;
	private int CustomerPhoneNumber;
	
	
	public Customer(String CustomerName, String CustomerEmailID, String Address, int CustomerPhoneNumber) {
		this.CustomerName = CustomerName;
		this.CustomerEmailID = CustomerEmailID;
		this.Address = Address;
		this.CustomerPhoneNumber = CustomerPhoneNumber;
	}


	public String getCustomerName() {
		return CustomerName;
	}


	public void setCustomerName(String CustomerName) {
		this.CustomerName = CustomerName;
	}


	public String getCustomerEmailID() {
		return CustomerEmailID;
	}


	public void setCustomerEmailID(String CustomerEmailID) {
		this.CustomerEmailID = CustomerEmailID;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String Address) {
		this.Address = Address;
	}


	public int getCustomerPhoneNumber() {
		return CustomerPhoneNumber;
	}


	public void setCustomerPhoneNumber(int CustomerPhoneNumber) {
		this.CustomerPhoneNumber = CustomerPhoneNumber;
	}


}
