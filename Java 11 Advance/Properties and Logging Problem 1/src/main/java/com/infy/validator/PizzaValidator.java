package com.infy.validator;

import java.util.List;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.logging.LogFactory;

import com.infy.exception.InfyAcademyException;
import com.infy.model.Foodie;
import com.infy.model.Pizza;

public class PizzaValidator {
	
	public void validate(Foodie foodie) throws InfyAcademyException,ConfigurationException  {
		
		Configurations configurations = new Configurations();
		PropertiesConfiguration config = configurations.properties("configuration.properties");
		String errorStatus = null;
		if(!isValidWalletBalance(foodie.getWalletBalance())) {
			errorStatus="Validator.INVALID_WALLET_BALANCE";
		}
		else if(!isValidPizzasOrdered(foodie.getPizzasOrdered())) {
			errorStatus="Validator.INVALID_PIZZAS_ORDERED";
		}
		if (errorStatus != null) {
			InfyAcademyException exception = new InfyAcademyException(errorStatus);
			if(exception.getMessage().contains("Validator"))
				LogFactory.getLog(this.getClass()).error(config.getProperty(exception.getMessage()), exception);
			throw exception;
		}
		
	}

	public Boolean isValidWalletBalance(Double walletBalance) {
		return walletBalance > 0;
	}

	public Boolean isValidPizzasOrdered(List<Pizza> pizzasOrdered) {
		return !(pizzasOrdered == null || pizzasOrdered.isEmpty());
	}
	
}
