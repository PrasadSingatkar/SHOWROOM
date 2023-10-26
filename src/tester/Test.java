package tester;

import static validate.ShowroomValidation.validateAllInputs;

import java.util.Scanner;

import Main.Vehicle;

public class Test {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(
					"Enter vehicle details : chasisNo,  vehicleColor,  price,  manufactureDate(yr-mon-day), company");
			Vehicle vehicle = validateAllInputs(sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next());
			System.out.println(vehicle);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
