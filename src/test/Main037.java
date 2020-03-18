package test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年3月17日 下午6:57:28
*/
public class Main037 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			int n = scan.nextInt();
			Tree2 tree = null;
			for (int i = 0; i < n; i++) {
				int num = scan.nextInt();
				tree = insert(tree, num);
			}
			preOrder(tree);
            System.out.println();
            inOrder(tree);
            System.out.println();
            postOrder(tree);
            System.out.println();
		}
	}
	
	private static Tree2 insert(Tree2 root, int x) {
        if (root == null) {
            root = new Tree2(x);
            return root;
        } else if (x < root.getValue()) {
            root.left = insert(root.left, x);
        } else if (x > root.getValue()) {
            root.right = insert(root.right, x);
        }
        // 忽略数值相等的结点
        return root;
    }
	
	private static void preOrder(Tree2 tree) {
		if (tree != null) {
			System.out.print(tree.getValue() + " ");
		} else {
			return;
		}
		if (tree.getLeft() != null) {
			preOrder(tree.getLeft());
		}
		if (tree.getRight() != null) {
			preOrder(tree.getRight());
		}

	}
	
	private static void inOrder(Tree2 tree) {
		if (tree == null) {
			return;
		}
		if (tree.getLeft() != null) {
			inOrder(tree.getLeft());
		}
		System.out.print(tree.getValue() + " ");
		if (tree.getRight()!= null) {
			inOrder(tree.getRight());
		}
		
	}
	
	private static void postOrder(Tree2 tree) {
		if (tree == null) {
			return;
		}
		if (tree.getLeft() != null) {
			postOrder(tree.getLeft());
		}
		if (tree.getRight()!= null) {
			postOrder(tree.getRight());
		}
		System.out.print(tree.getValue() + " ");
	}
}

class Tree2 {
	
	int value;
	Tree2 left;
	Tree2 right;
	
	public Tree2(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Tree2 getLeft() {
		return left;
	}
	public void setLeft(Tree2 left) {
		this.left = left;
	}
	public Tree2 getRight() {
		return right;
	}
	public void setRight(Tree2 right) {
		this.right = right;
	}
}
