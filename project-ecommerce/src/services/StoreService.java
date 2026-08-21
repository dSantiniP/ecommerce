package services;

import repositories.StoreRepository;

public class StoreService {
	
	static private StoreRepository storeRepository;
	
	public StoreService (StoreRepository storeRepository) {
		this.storeRepository = storeRepository;
	}
	
	

}
