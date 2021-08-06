import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerDemo {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(LoggerDemo.class);
		logger.trace("Trace");
		logger.debug("Debug");
		logger.info("Info");
		logger.warn("Warn");
		logger.error("Error");
	}

}
