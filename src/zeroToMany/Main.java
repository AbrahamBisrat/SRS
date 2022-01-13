package zeroToMany;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
		Customer cust = new Customer("Abraham");
//		Order monday = cust.addOrders(LocalDate.now());
		Order monday = new Order(LocalDate.now());
		monday.items.add("pants");
		monday.items.add("Gun");
		monday.items.add("Ak-47");
		monday.items.add("M-16");
		cust.addOrders(monday);
		
		monday = new Order(LocalDate.now());
		cust.addOrders(monday);
		monday.addItems("eggs");
		monday.addItems("Banana");
		monday.addItems("Heran");
		monday.addItems("And her friend");
		monday.addItems("I would happly do both of them");
		
		System.out.println(cust);
	}
}
