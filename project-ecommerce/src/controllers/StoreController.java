package controllers;

import java.util.InputMismatchException;
import java.util.Scanner;

import models.Store;
import services.StoreService;

public class StoreController {

	private StoreService storeService;
	private Scanner scanner;

	public StoreController(StoreService storeService, Scanner scanner) {
		this.storeService = storeService;
		this.scanner = scanner;
	}

	public void buildStore() {

		try {
			System.out.print("Product name: ");
			String name = scanner.nextLine();

			System.out.print("Product description: ");
			String description = scanner.nextLine();

			System.out.print("Product quantity: ");
			int quantityStock = scanner.nextInt();

			System.out.print("Product price: ");
			double price = scanner.nextDouble();
			scanner.nextLine();

			System.out.print("Product category: ");
			String category = scanner.nextLine();

			System.out.print("Product active: ");
			boolean active = scanner.nextBoolean();

			Store store = new Store(name, description, quantityStock, price, category, active);
			storeService.createStore(store);
			System.out.println("Product registred successfully!");

		} catch (InputMismatchException e) {
			System.out.println("Error: Enter a valid numeric value.");
			scanner.nextLine();
		}
	}

	public void listStore() {
		storeService.reviewStore();
	}

	public void editStore() {

		try {
			System.out.print("Product ID to Update: ");
			long id = scanner.nextLong();
			scanner.nextLine();

			System.out.print("New name: ");
			String name = scanner.nextLine();

			System.out.print("New description: ");
			String description = scanner.nextLine();

			System.out.print("New product quantity: ");
			int quantityStock = scanner.nextInt();

			System.out.print("New product price: ");
			double price = scanner.nextDouble();
			scanner.nextLine();

			System.out.println("New product category: ");
			String category = scanner.nextLine();

			System.out.println("New product active: ");
			boolean active = scanner.nextBoolean();

			Store store = new Store(name, description, quantityStock, price, category, active);
			storeService.updateStore(store);
			System.out.println("Product updated successfully!");

		} catch (InputMismatchException e) {
			System.out.println("Error: Enter a valid numeric value.");
			scanner.nextLine();
		}
	}

	public void removeProductStore() {

		try {
			System.out.println("Product ID to Delete: ");
			long id = scanner.nextLong();
			scanner.nextLine();

			storeService.deleteStore(id);
			System.out.println("Product removed successfully!");

		} catch (InputMismatchException e) {
			System.out.println("Error: Enter a valid numeric ID.");
			scanner.nextLine();
		}
	}
}
