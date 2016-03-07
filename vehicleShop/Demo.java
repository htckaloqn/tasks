package vehicleShop;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
	

	public static void main(String[] args) {

		final String SEARCH_MSG = "Search By Mark : ";
		
		Store storeMladost = new Store("MladostStore", "Mladost 1A", "Dobrin Vasilev");
		Store storeVrubnitsa = new Store("VrubnitsaStore", "Vrubnitsa 3", "Georgi Todorov");
		Store storeVrujdebna = new Store("VrujdebnaStore", "Vrujdebna, ul.32", "Petko Sukov");
		Store storeBulgaria = new Store("BulgariaStore", "bul.Bulgaria 125", "Miroslav Mironov");
		
		Truck truck1 = new Truck("Truck", "MAN", "Tgl", 7.5, 70300, storeBulgaria);
		Truck truck2 = new Truck("Truck", "Mercedes", "Actros", 25, 100000, storeVrubnitsa);
		Truck truck3 = new Truck("Truck", "Avia", "Agon", 7.5, 20000, storeVrujdebna);
		Truck truck4 = new Truck("Truck", "Fiat", "Iveco", 10, 26500, storeBulgaria);
		Truck truck5 = new Truck("Truck", "Mercedes", "Wc", 15, 42700.50, storeVrubnitsa);
		Truck truck6 = new Truck("Truck", "Scania", "Tir", 20, 15500, storeMladost);
		
		Car car1 = new Car("Car", "BMW", "320", 6300, storeBulgaria);
		Car car2 = new Car("Car", "Mercedes", "200e", 2000.50, storeBulgaria);
		Car car3 = new Car("Car", "Fiat", "Bravo", 2300, storeBulgaria);
		Car car4 = new Car("Car", "Opel", "Astra", 3000, storeBulgaria);
		Car car5 = new Car("Car", "Mercedes", "s320", 9800, storeBulgaria);
		Car car6 = new Car("Car", "AlfaRomeo", "145", 1200.40, storeBulgaria);
		Car car7 = new Car("Car", "Seat", "Leon", 4000, storeBulgaria);
		
		ArrayList<Vehicle> list = new ArrayList<Vehicle>();
		list.add(truck1);
		list.add(truck2);
		list.add(truck3);
		list.add(truck4);
		list.add(truck5);
		list.add(truck6);
		
		list.add(car1);
		list.add(car2);
		list.add(car3);
		list.add(car4);
		list.add(car5);
		list.add(car6);
		list.add(car7);
		
		
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.print(SEARCH_MSG);
		String searchByMark = scanner.nextLine();
	
		for (Vehicle vehicle : list) {

			if (vehicle.getMark().equalsIgnoreCase(searchByMark.trim())) {
				
				System.out.println(vehicle);
			}
		}

		scanner.close();
	}
}
