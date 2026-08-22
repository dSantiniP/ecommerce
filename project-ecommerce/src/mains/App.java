package mains;

import java.util.InputMismatchException;
import java.util.Scanner;

import controllers.StoreController;
import repositories.StoreRepository;
import services.StoreService;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		StoreRepository storeRepository = new StoreRepository();
		StoreService storeService = new StoreService(storeRepository);
		StoreController storeController = new StoreController(storeService, scanner);
		
		int choice = 0;
		
		while(true){
			System.out.println("=== PRODUCT SYSTEM ===");
			System.out.println("1 - Registrer Product");
			System.out.println("2 - List Products");
			System.out.println("3 - Update Product");
			System.out.println("4 - Delete Product");
			System.out.println("0 - Exit");
			System.out.println("Choose an option: ");
			
			try {
				choice = scanner.nextInt();
				scanner.nextLine();			
			} catch (InputMismatchException e) {
				System.out.println("Error: Enter numbers only.");
				scanner.nextLine();
				continue;		
			}
			
			switch (choice) {
				case 1: 
					storeController.buildStore();
					break;
				case 2:
					storeController.listStore();
					break;
				case 3:
					storeController.editStore();
					break;
				case 4:
					storeController.removeProductStore();
					break;
				case 0:
					System.out.println("Exiting System...");
					scanner.close();
					return;
				default:
					System.out.println("Invalid option! Try again.");							
			}
		}
	}
}
