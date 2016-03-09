package stringtest;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import cn.hyx.invoicing.customer.entity.Customer;

public class StringDemo {

	@Test
	public void testStringChar29() {
		String str = String.valueOf((char)29) ;
		String str1 = "hello" + str + "world" ;
		System.out.println(str);
		System.out.println("abc"+str+new Customer());
		
	}
	
	@Test
	public void testEscape() {
		System.out.println(StringEscapeUtils.escapeHtml4("<html>"));
		System.out.println( StringUtils.left("abc", 2));
	}
}
