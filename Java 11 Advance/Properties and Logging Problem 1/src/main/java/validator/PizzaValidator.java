package validator;

import java.util.List;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.logging.LogFactory;

import com.infy.exception.InfyAcademyException;

import model.Foodie;
import model.Pizza;

public class PizzaValidator {
	
	public void validate(Foodie foodie) throws InfyAcademyException,ConfigurationException  {
//		will implement this method 
	}

	public Boolean isValidWalletBalance(Double walletBalance) {
//		will implement this method 
	}

	public Boolean isValidPizzasOrdered(List<Pizza> pizzasOrdered) {
//		will implement this method 
	}
	
}
