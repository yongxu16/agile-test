package binnarytree;

public class Node {

	private Comparable<Object> data ;
	private Node left ;
	private Node right ;
	public Node(Comparable data) {
		this.data = data;
	}
	
	public void addNode(Node newNode) {
		if (this.data.compareTo(newNode.data) > 0) {
			if (this.left == null) {
				this.left = newNode ;
			} else {
				this.left.addNode(newNode);
			}
		} else {
			if (this.right == null) {
				this.right = newNode ;
			} else {
				this.right.addNode(newNode);
			}
		}
	}
	
	public void toArray() {
		if (this.left != null) {
			this.left.toArray();
		}
		BinaryTree.getRetData()[BinaryTree.getFoot()] = this.data ;
		BinaryTree.setFootNext();
		if (this.right != null) {
			this.right.toArray();
		}
	}
}
