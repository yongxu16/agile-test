package binnarytree;

import org.apache.commons.lang.ArrayUtils;

class MyThread implements Runnable {
	@Override
	public void run() {
		BinaryTree bt = new BinaryTree() ;
		bt.add("F");
		bt.add("C");
		bt.add("A");
		bt.add("5");
		bt.add("G");
		System.out.println(ArrayUtils.toString(bt.toArray()));
	}
	
}
public class Client {
	public static void main(String[] args) {
		for (int i = 0; i < 100000; i++) {
			new Thread(new MyThread()).start();
		}
	}
}
