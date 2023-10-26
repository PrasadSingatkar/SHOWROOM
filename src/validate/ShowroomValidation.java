package validate;

import java.time.LocalDate;

import Main.Vehicle;

import Main.Color;
import custom_exception.InvalidInputException;

public class ShowroomValidation {
 
	public static Color parseAndValidateColor(String clr) //throws IllegalArgumentException
	{
		return Color.valueOf(clr.toUpperCase());
	}
	
	public static LocalDate parseAndValidateDate(String Date) throws InvalidInputException{
		LocalDate manuDate = LocalDate.parse(Date);
		LocalDate checkDate = LocalDate.of(2022,1,1);
		if(manuDate.isBefore(checkDate))
			throw new InvalidInputException("Manu date must be after 1st Jan 2022");
			return manuDate;
	}

	public static Vehicle validateAllInputs(String chasisNo, String vehicleColor, double price, String manufactureDate,
			String company) throws IllegalArgumentException, InvalidInputException {
		Color color = parseAndValidateColor(vehicleColor);
		LocalDate validatedDate = parseAndValidateDate(manufactureDate);
		return new Vehicle(chasisNo, color, price, validatedDate, company);
	}
}
