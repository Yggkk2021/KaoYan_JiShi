package test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/1 20:10
 */
public class Main010 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String s = scan.next();
            char[] arr = s.toCharArray();
            Queue<Character> nodes = new LinkedList<>();
            for (char ch: arr) {
                nodes.offer(ch);
            }
            Tree root = createTree(nodes);
            if (root != null) {
                Tree.midOrderTraverse(root);
            }
        }
    }

    private static Tree createTree(Queue<Character> nodes) {
        char ch = nodes.poll();

        if (ch == '#') {
            return null;
        }

        Tree root =  new Tree();
        root.setData(ch);
        root.setLeft(createTree(nodes));
        root.setRight(createTree(nodes));

        return root;
    }
}

class Tree {
    private char data;
    private Tree left;
    private Tree right;

    public Tree() {}

    public Tree(char data) {
        this.data = data;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public Tree getLeft() {
        return left;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public Tree getRight() {
        return right;
    }

    public void setRight(Tree right) {
        this.right = right;
    }

    public static void midOrderTraverse(Tree tree) {
        if (tree.getLeft() != null) {
            midOrderTraverse(tree.getLeft());
        }
        System.out.print(tree.getData() + " ");
        if (tree.getRight() != null) {
            midOrderTraverse(tree.getRight());
        }
    }
}
