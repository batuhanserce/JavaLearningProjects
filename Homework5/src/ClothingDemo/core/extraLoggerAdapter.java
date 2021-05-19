package ClothingDemo.core;

import ClothingDemo.extraLogger.extraLogger;

public class extraLoggerAdapter implements extraLoggerService {

	@Override
	public void logToSystem(String message) 
	{
		extraLogger logger = new extraLogger();
		logger.message("What is the message?");
	}
	
	

}
