package OOPS_Inheritance;

import java.util.ArrayList;
//import java.util.List;

public class FoodDeleivery {

	public static void main(String[] args) {

		FoodDeleivery food = new FoodDeleivery();

		food.login("ranjeet", "ranjeet@123");
		food.login(7324532, 9181);
		food.login(98767, "test@gmail.com");
		food.login("ranjeet", "ranjeet@test", 3321);
		food.restaurant();
		food.search("Maharaja", "Chicken");
		food.menu("ManaliHote", "Chicken", 50);
		food.place("Maharja", "Chicken Pasta", 90, 2);

	}

	/*
	 * // Feature Test 1 -- Login Functionallity // Here the user can be able to
	 * login with phone and password // Here the user can be able to login with
	 * phone and otp // Here the user can be able to login with username and
	 * password // Here the user can be able to login with username.password and otp
	 */
	public void login(int phone, String password) {

		System.out.println("Enter the phone number to login" + " " + phone);
		System.out.println("Enter thepaasword to acess dashboard " + " " + password);
		System.out.println("User Is Able To Loggeed In With phone and password ");

	}

	public void login(int phone, int otp) {

		System.out.println("Enter the phone number to login" + " " + phone);
		System.out.println("Enter thepaasword to acess dashboard " + " " + otp);
		System.out.println("User Is Able To Loggeed In With phone and otp ");

	}

	public void login(String username, String password) {

		System.out.println("Enter the phone number to login" + " " + username);
		System.out.println("Enter thepaasword to acess dashboard " + " " + password);
		System.out.println("User Is Able To Loggeed In With the username and password  ");

	}

	public void login(String username, String password, int otp) {

		System.out.println("Enter the phone number to login" + " " + username);
		System.out.println("Enter thepaasword to acess dashboard " + " " + password);
		System.out.println("Enter thepaasword to acess dashboard " + " " + otp);
		System.out.println("User Is Able To Loggeed In With username,password and otp ");

	}

	/*
	 * Feature Test 2 : Search A Restuarant by restaurant name - return 100 by  name
	 * and food item - return an Arraylist<String> with restaurant name and food
	 * items by name, food item and price - return an Arraylist<String> with
	 * restaurant name, food items and price by name, food item, price and rating (1
	 * to 5 star) - return an Arraylist<String> with restaurant name, food items and
	 * price
	 */

	public int restaurant() {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("MakhanMishri");
		ar.add("Revoli");
		ar.add("Maharaja");
		System.out.println(ar);
		return 100;// This is succes response to validate that you are getting right value

	}

	public String search(String hotelname, String food) {
		ArrayList<String> name = new ArrayList<String>();

		name.add("Maharaja");
		name.add("Kalinga with ");
		name.add("Janakpurispecial");
		name.add("fauji");

		name.add("Chicken");
		name.add("MalaiMushroom");
		name.add("PannerTikka");
		name.add("ShahiPaneer");

		System.out.println("Hotel Name Is" + " " + name.get(0) + " " + "With Speciallity Of " + " " + name.get(4));
		System.out.println("Hotel Name Is" + " " + name.get(1) + " " + "With Speciallity Of " + " " + name.get(5));
		System.out.println("Hotel Name Is" + " " + name.get(2) + " " + "With Speciallity Of " + " " + name.get(6));
		System.out.println("Hotel Name Is" + " " + name.get(3) + " " + "With Speciallity Of " + " " + name.get(7));

		return "Malai Kofta Maharaja Hotel";

	}

	public String menu(String HotelName, String FoodItem, int price) {

		ArrayList<String> mode = new ArrayList<String>();
		mode.add("ManaliHote");
		mode.add("Luxmipurhotel");
		mode.add("AnjanaHotel");

		mode.add("MixTypeVeg");
		mode.add("Nonveg");
		mode.add("TestVeggie");

		ArrayList<Integer> cost = new ArrayList<Integer>();
		cost.add(50);
		cost.add(100);
		cost.add(95);

		System.out.println(
				"The Hotel is" + mode.get(0) + " " + " and food is" + mode.get(4) + "with an price of " + cost.get(0));

		return "gotthehote";

	}

	public String place(String HotelName, String food, int price, int rating) {
		ArrayList<String> modenew = new ArrayList<String>();

		modenew.add("Maharja");
		modenew.add("Kalinga");
		modenew.add("Nagaraj");
		modenew.add("NveenPeru");
		modenew.add("MerkiNew");

		modenew.add("Chicken Pasta");
		modenew.add("NonMenstek");
		modenew.add("Nagarajspecial");
		modenew.add("Specialpasta");
		modenew.add("ChcikenChowmein");

		if (modenew.equals("Kalinga")) {
			System.out.println("This is the top hotel in city ");
		} else {

			System.out.println("Not the Best Hotel");
		}

		ArrayList<Integer> card = new ArrayList<Integer>();
		card.add(90);
		card.add(110);
		card.add(98);
		card.add(43);
		card.add(98);

		card.add(5);
		card.add(4);
		card.add(3);
		card.add(3);
		card.add(1);

		System.out.println("The Hotel is" + modenew.get(0) + " " + " and food is" + modenew.get(5) + "with an price of "
				+ card.get(0) + "rating of" + " " + card.add(5));

		return "BestHotel";
	}

}
