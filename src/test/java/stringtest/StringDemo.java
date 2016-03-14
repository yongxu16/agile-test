package stringtest;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import cn.hyx.invoicing.customer.entity.Customer;

public class StringDemo {
	
	private static final Logger LOGGER = LogManager.getLogger(StringDemo.class) ;
	@Test
	public void testStringChar29() {
		String str = String.valueOf((char)29) ;
		String str1 = "hello" + str + "world" ;
		LOGGER.debug(str);
		LOGGER.debug("abc"+str+new Customer());
		
	}
	
	@Test
	public void testEscape() {
		LOGGER.debug(StringEscapeUtils.escapeHtml4("<html>"));
		LOGGER.debug( StringUtils.left("abc", 2));
	}
	
	/**
	 * 删除字符串中的所有空格
	 */
	@Test
	public void deleteSpace() {
		String str = " hanyx java  helo     world !!   " ;
		LOGGER.debug(StringUtils.deleteWhitespace(str));
	}
	
	@Test
	public void testPrintf() {
		testD(4);
	}
	
	private void testD(int d) {
		String format = "第%d此移动:\t圆盘从%c棒移动到%c棒\n";
		String str = String.format(format, d,'c','a') ;
		LOGGER.debug(str);
		System.out.printf("第%d 次, %c", 4,'c');
	}
}
