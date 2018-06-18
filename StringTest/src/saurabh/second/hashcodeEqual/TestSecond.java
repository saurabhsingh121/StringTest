package saurabh.second.hashcodeEqual;

import java.util.HashMap;

public class TestSecond {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle("Santro", 522455);
		System.out.println(vehicle1.hashcode());
		HashMap<Vehicle, String> map = new HashMap<>();
		map.put(vehicle1, "Hyundai");
		vehicle1.setPurchaseValue(399999);
		System.out.println(vehicle1.hashcode());
		System.out.println(map.get(vehicle1));
		Vehicle vehicle2 = new Vehicle("Texon", 526656);
		map.put(vehicle2, "Tata");
		System.out.println(map.get(vehicle2));
	}

}
