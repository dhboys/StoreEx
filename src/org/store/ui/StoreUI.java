package org.store.ui;

import java.util.Scanner;

import org.store.domain.Store;
import org.store.service.StoreService;

public class StoreUI {

	private Scanner scanner;
	private StoreService service;
	
	public StoreUI(Scanner scanner, StoreService service) {
		super();
		this.scanner = scanner;
		this.service = service;
	}

	
	public void find() {
		
		System.out.println("현재 위도를 입력");
		double lat = Double.parseDouble(scanner.nextLine());
		System.out.println("현재 경도를 입력");
		double lng = Double.parseDouble(scanner.nextLine());
		
		Store[] result = service.findNearStores(lat, lng);
		
		// foreach
		for (Store store : result) {
			System.out.println(store);
		}
	}
}
