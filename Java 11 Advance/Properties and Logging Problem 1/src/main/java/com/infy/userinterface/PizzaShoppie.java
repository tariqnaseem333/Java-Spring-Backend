package com.infy.userinterface;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.LogFactory;

import com.infy.model.Foodie;
import com.infy.model.Pizza;
import com.infy.model.PizzaSize;
import com.infy.model.service.PizzaService;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.logging.Log;

public class PizzaShoppie {
	
	private static final Log LOGGER = LogFactory.getLog(PizzaShoppie.class);
	
	public static void main(String[] args) throws ConfigurationException {
		
		Configurations configurations = new Configurations();
		PropertiesConfiguration config = configurations.properties("configuration.properties");
		
		try {
			List<Pizza> pizzasOrdered = new ArrayList<>();
			pizzasOrdered.add(new Pizza(PizzaSize.REGULAR));
			pizzasOrdered.add(new Pizza(PizzaSize.MEDIUM));
			pizzasOrdered.add(new Pizza(PizzaSize.LARGE));
			Foodie foodie = new Foodie("Jacob", 1000d, pizzasOrdered);
			PizzaService pizzaService = new PizzaService();
			Double totalCost = pizzaService.purchasePizza(foodie);
			LOGGER.info((String)config.getProperty("Userinterface.SUCCESS") + " " + totalCost);
		} catch(Exception e) {
			LOGGER.error(config.getProperty(e.getMessage()));
		}
		
	}
	
}
