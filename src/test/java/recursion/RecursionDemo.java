package recursion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class RecursionDemo {
	private static final Logger LOGGER = LogManager.getLogger(RecursionDemo.class) ;

	/**
	 * 递推用例（含递归）
	 * 兔子产子用例 (斐波那契)
	 * 两个月大的一对兔子，以后每月生一对小兔子， 小兔子两个月后开始产子，
	 * 也就是1月份生， 3月份产子。假定没有发生死亡事件，那么一年后又多少对兔子s
	 */
	@Test
	public void testDemo01() {
		int month = 6 ;
		LOGGER.debug(fibonacci(month));
	}
	
	/**
	 * 兔子产子用例 (斐波那契)
	 * 基于递推算法公式
	 * Fn = F（n-2） + F（n-1）
	 * @param n 月份
	 */
	private int fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1 ;
		} else {
			int t1 = fibonacci(n - 1) ;
			int t2 = fibonacci(n - 2) ;
			return t1 + t2 ;
		}
	}
	
	/**
	 * 求阶乘
	 * 从1到指定数之间的所有自然数相乘的结果
	 * n!=n*(n-1)*(n-2)*....*2*1 推算公式如下
	 * n!=n*(n-1)!
	 */
	@Test
	public void testDemo02() {
		double n = 100 ;
		LOGGER.debug(fact(n));
	}
	
	/**
	 * 求阶乘
	 * n!=n*(n-1)!
	 * @param n 指定数
	 */
	private double fact(double n) {
		if (n <= 1) {
			return 1 ;
		} else {
			return n * fact(n-1) ;
		}
	}
	
	/**
	 * 汉诺塔
	 * 1) 将A棒上的n-1个圆盘移动到B棒上
	 * 2) A棒上的一个圆盘移动到C棒上
	 * 3) 将B棒上n-1个圆盘移动到C棒上
	 */
	private static long count;
	@Test
	public void testDemo03() {
		count = 0 ;
		int n = 2 ;
		hanoi(n, 'A', 'B', 'C');
		LOGGER.debug("总共需要{}步移动!",count);
	}
	
	/**
	 * 汉诺塔
	 * 1) 将A棒上的n-1个圆盘移动到B棒上
	 * 2) A棒上的一个圆盘移动到C棒上
	 * 3) 将B棒上n-1个圆盘移动到C棒上
	 * @param n 圆盘数量
	 * @param a A棒符号
	 * @param b B棒符号
	 * @param c C棒符号
	 */
	private void hanoi(int n, char a, char b, char c) {
		String format = "第{}步移动:\t圆盘从{}棒移动到{}棒.";
		if (n == 1) {
			LOGGER.debug(format, ++count, a, c);
		} else {
			hanoi(n - 1, a, c, b);	// 步骤
			LOGGER.debug(format, ++count, a, c);
			hanoi(n - 1, b, a, c);	// 步骤
		}
	}
	
}
