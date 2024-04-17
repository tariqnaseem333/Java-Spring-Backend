package com.infy.model.service;

import java.util.List;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.infy.exception.InfyAcademyException;
import com.infy.model.Foodie;
import com.infy.model.Pizza;
import com.infy.validator.PizzaValidator;

public class PizzaService {
	
	private static final Log LOGGER = LogFactory.getLog(PizzaService.class);
	
	public Double purchasePizza(Foodie foodie) throws InfyAcademyException,ConfigurationException {
		
		Configurations configurations = new Configurations();
		PropertiesConfiguration config = configurations.properties("configuration.properties");
		try {
			PizzaValidator pizzaValidator = new PizzaValidator();
			pizzaValidator.validate(foodie);
			Double totalCost = this.calculateCost(foodie.getPizzasOrdered());
			if(totalCost>foodie.getWalletBalance())
				throw new InfyAcademyException("Service.INSUFFICIENT_WALLET_BALANCE");
			LOGGER.info(foodie.getName() + " " + totalCost);
			return totalCost;
		} catch (InfyAcademyException e) {
			if(e.getMessage().contains("Service"))
				LOGGER.error(config.getProperty(e.getMessage()), e);
			throw e;
		}
		
	}
	
	//return the total cost of all the Pizza objects in the List
	public Double calculateCost(List<Pizza> pizzasOrdered) {
		return pizzasOrdered.stream().mapToDouble(pizza -> pizza.getCost()).sum();
	}
	
}
