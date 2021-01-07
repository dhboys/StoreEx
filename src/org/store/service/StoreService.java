package org.store.service;

import org.store.domain.Store;

public class StoreService {

	private Store[] stores;
	
	public StoreService(Store[] stores) {
		super();
		this.stores = stores;
	}

	// 주변맛집 찾는 기능
	public Store[] findNearStores( double currentLat , double currentLng) {
		
		
		return null;
	}
	
}
