package OOPS_EncapSulation;

public class CustomerCalling {

	public static void main(String[] args) {

		Customer ctm = new Customer("Ranjeet Saini", "ranjeet.kumar@gmail.com", "Rohtak", 9890);
		System.out.println(ctm.getCustomerName());
		System.out.println(ctm.getCustomerEmailID());
		System.out.println(ctm.getCustomerPhoneNumber());
		System.out.println(ctm.getAddress());

		System.out.println("************");

		ctm.setAddress("New Haryana");
		ctm.setCustomerEmailID("ravicharan@gmail.com");
		ctm.setCustomerName("ravicharan");
		ctm.setCustomerPhoneNumber(88932);

		System.out.println(ctm.getCustomerName());
		System.out.println(ctm.getCustomerEmailID());
		System.out.println(ctm.getCustomerPhoneNumber());
		System.out.println(ctm.getAddress());
		

	}
}