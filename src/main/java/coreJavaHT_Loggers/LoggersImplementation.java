package coreJavaHT_Loggers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggersImplementation {

	private static Logger log = LogManager.getLogger(LoggersImplementation.class);

	public static void main(String[] args) {
		log.debug("Hello debug...");
		log.info("Hello info...");
		log.warn("Hello Warning");
		log.error("Hello Error...");
		log.fatal("Hello Fatal");
	}
}
