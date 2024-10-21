package chapter8;

public class TestBST {
    public static void main(String[] args) {
        MyBinarySearchTree bst = new MyBinarySearchTree(5);
        bst.insert(3);
        bst.insert(8);
        bst.insert(6);
        bst.insert(9);
        bst.insert(1);
        System.out.println(bst.search(6));
        System.out.println(bst.search(2));
    }
}
