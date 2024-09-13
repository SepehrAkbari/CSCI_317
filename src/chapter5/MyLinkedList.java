package chapter5;

public class MyLinkedList {
    private MyLink head; 
    private int count;

    public MyLinkedList(int item) {
        head = new MyLink(item);
        count = 1;
    }

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    public void insertHead(int item) {
        MyLink temp = new MyLink(item);
        temp.setNext(head);
        head = temp;
        count++;
    }

    public void insertTail(int item) {
        if (head == null) {
            insertHead(item);
        } else {
            MyLink current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            MyLink temp = new MyLink(item);
            current.setNext(temp);
            count++;
        }
    } 

    public boolean insertAtIndex(int item, int index) {
        if (index > count) {
            System.out.println("Index out of bounds");
            return false;
        } else
        if (head == null) {
            insertHead(item);
        } else {
            int currentNum = 0;
            MyLink current = head;
            while (currentNum < index - 1) {
                current = current.getNext();
                currentNum++;
            }
            MyLink temp = new MyLink(item);
            temp.setNext(current.getNext());
            current.setNext(temp);
            count++;
        }
        return true;
    }

    public String toString() {
        String output = "";
        if (head != null) {
            MyLink current = head;
            while (current != null) {
                output += current.getData() + " ";
                current = current.getNext();
            }
        }
        return output;
    }
}
