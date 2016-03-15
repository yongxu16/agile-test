package digestutils;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class DigestUtilsDemo {
	private static final Logger LOGGER = LogManager.getLogger(DigestUtilsDemo.class) ;

	@Test
	public void test() {
		String password = DigestUtils.md5Hex("123") ;
		LOGGER.debug(password);
	}
}
