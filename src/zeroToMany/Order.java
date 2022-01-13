package zeroToMany;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	LocalDate orderTime;
	List<String> items;
	
	Order(LocalDate orderTime){
		items = new ArrayList<String>();
		this.orderTime = orderTime;
	}
	public void addItems(String item) {
		items.add(item);
	}
	
	// method
	
	@Override
	public String toString() {
		String sum = "";
		for(String item : items) {
			sum += item + ", ";
		}
		return "[ " + orderTime + " ] : [ " + sum + " ]";
	}
}
