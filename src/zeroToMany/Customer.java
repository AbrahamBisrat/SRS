package zeroToMany;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	List<Order> orders;
	
	// package level
	Customer(String name){
		this.name = name;
		orders = new ArrayList<Order>();
	}
	
	public String getName() {
		return name;
	}
	public void addOrders(LocalDate date) {
		Order newOrder = new Order(LocalDate.now());
		orders.add(newOrder);
//		return newOrder;
	}
	public void addOrders(Order newOrder) {
		orders.add(newOrder);
	}
	
	
	@Override
	public String toString() {
		String stringSum = "";
		for(Order order : orders) {
			stringSum += order + " \n";
		}
		return stringSum;
	}
}
