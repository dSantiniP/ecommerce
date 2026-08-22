package services;

import models.Store;
import repositories.StoreRepository;

public class StoreService {

	static private StoreRepository storeRepository;

	public StoreService(StoreRepository storeRepository) {
		this.storeRepository = storeRepository;
	}

	public void createStore(Store store) {
		if (store.getQuantityStock() < 0) {
			System.out.println("Invalid quantity");
			return;

		}

		storeRepository.createStore(store);

	}

	public void reviewStore() {
		storeRepository.reviewStore();
	}

	public void updateStore(Store store) {
		if (store.getQuantityStock() < 0) {
			System.out.println("Invalid quantity");
			return;
		}
		storeRepository.updateStore(store);
	}

	public void deleteStore(long id) {
		if (id <= 0) {
			System.out.println("Invalid ID value");
		}
		storeRepository.deleteStore(id);

	}
}
