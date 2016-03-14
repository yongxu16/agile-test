package binnarytree;

public class BinaryTree {
	
	private Node root ;
	private int count ;
//	public static Object[] retData ;
	
	private static ThreadLocal<Object[]> myThreadLocal = new ThreadLocal<>() ;
	private static ThreadLocal<Integer> footThreadLocal = new ThreadLocal<>() ;
	
	public void add(Comparable data) {
		Node newNode = new Node(data) ;
		if (this.root == null ) {
			this.root = newNode ;
		} else {
			this.root.addNode(newNode);
		}
		this.count ++ ;
	}
	
	public Object[] toArray() {
		footThreadLocal.set(0);
		myThreadLocal.set(new Object[count]);
//		retData = new Object[count] ;
		this.root.toArray();
		return myThreadLocal.get() ;
	}
	
	public static Object[] getRetData() {
		return myThreadLocal.get() ;
	}
	
	public static int getFoot() {
		return footThreadLocal.get() == null ? 0 : footThreadLocal.get() ;
	}
	
	public static void setFootNext() {
		footThreadLocal.set(footThreadLocal.get() + 1);
	}
}
