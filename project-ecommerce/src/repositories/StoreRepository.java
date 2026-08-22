package repositories;

import java.util.ArrayList;
import java.util.List;

import models.Store;

public class StoreRepository {

	static List<Store> dataStore = new ArrayList<>();

	public Store findById(long id) {
		for (int i = 0; i < dataStore.size(); i++) {
			if (dataStore.get(i).getId() == id) {
				return dataStore.get(i);
			}
		}
		return null;
	}

	public void createStore(Store Store) {
		dataStore.add(Store);
	}

	public void reviewStore() {
		System.out.println(dataStore);
	}

	public void deleteStore(long id) {
		for (int i = 0; i < dataStore.size(); i++) {
			if (dataStore.get(i).getId() == id) {
				dataStore.remove(i);
				break;
			}
		}
	}

	public void updateStore(Store hasStore) {
		for (int i = 0; i < dataStore.size(); i++) {
			if (dataStore.get(i).getId() == hasStore.getId()) {
				dataStore.get(i).setName(hasStore.getName());
				dataStore.get(i).setDescription(hasStore.getDescription());
				dataStore.get(i).setQuantityStock(hasStore.getQuantityStock());
				dataStore.get(i).setPrice(hasStore.getPrice());
				dataStore.get(i).setCategory(hasStore.getCategory());
				dataStore.get(i).setActive(hasStore.getActive());
				break;

			}
		}
	}

}
