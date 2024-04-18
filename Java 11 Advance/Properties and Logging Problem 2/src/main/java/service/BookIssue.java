package service;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.infy.exception.InfyAcademyException;

public class BookIssue {
	
	private static final Log LOGGER = LogFactory.getLog(BookIssue.class);
	
	public void bookDetails(String bookName) throws InfyAcademyException, ConfigurationException {

		Configurations configurations = new Configurations();
		PropertiesConfiguration config = configurations.properties("configuration.properties");	

		try {
			if(bookName.equals(config.getProperty("B1_NAME"))) {
				if( Integer.parseInt((String)config.getProperty("B1_VALUE")) > 0)
					LOGGER.info(config.getProperty("BOOK_AVAILABLE"));
				else 
					throw new InfyAcademyException("BOOK_UNAVAILABLE");
			}
			else if(bookName.equals(config.getProperty("B2_NAME"))) {
				if( Integer.parseInt((String)config.getProperty("B2_VALUE")) > 0) 
					LOGGER.info(config.getProperty("BOOK_AVAILABLE"));
				else 
					throw new InfyAcademyException("BOOK_UNAVAILABLE");
			}
			else {
				throw new InfyAcademyException("INVALID_BOOKNAME");
			}
		} catch (InfyAcademyException e) {
			LOGGER.error(config.getProperty(e.getMessage()), e);
			throw e;
		}
		
	}

}
