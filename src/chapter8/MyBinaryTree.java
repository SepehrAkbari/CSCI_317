package chapter8;

public abstract class MyBinaryTree {
    protected int data;
    protected MyBinaryTree left;
    protected MyBinaryTree right;

    public MyBinaryTree(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public int getData() {
        return data;
    } 
    
    public MyBinaryTree getLeft() {
        return left;
    }

    public MyBinaryTree getRight() {
        return right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(MyBinaryTree node) {
        left = node;
    }

    public void setRight(MyBinaryTree node) {
        right = node;
    }

    public abstract void insert(int key);
    public abstract void remove();
    public abstract boolean search(int key);
}