package chapter8;

public class MyBinarySearchTree extends MyBinaryTree {
    public MyBinarySearchTree(int data) {
        super(data);
    }

    @Override
    public void insert(int key) {
        if (key <= data) {
            if (left == null) {
                left = new MyBinarySearchTree(key);
            } else {
                left.insert(key);
            }
        } else {
            if (right == null) {
                right = new MyBinarySearchTree(key);
            } else {
                right.insert(key);
            }
        }
    }

    @Override
    public void remove() {
    }

    @Override
    public boolean search(int key) {
        return false;
    }
}
