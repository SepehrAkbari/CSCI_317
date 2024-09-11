package chapter4.Queue;

public class MyQueue {
    private char[] data;
    private int front, rear, count;

    public MyQueue(int size) {
        data = new char[size];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(char value) throws Exception{
        if (isFull()) {
            Exception e = new Exception("The Queue is full");
            throw e;
        } else {
            if (rear < data.length - 1) {
                data[++rear] = value;
            } else {
                rear = -1;
                data[++rear] = value;
            }
        }
    }

    public char dequeue() throws Exception {
        if (isEmpty()) {
            Exception e = new Exception("The Queue is empty");
            throw e;
        } else {
            count--;
            char item = data[front++];
            if (front == data.length) {
                front = 0;
            }
            return item;
        }
    }

    public boolean isFull() {
        return count == data.length;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int getLength() {
        return count;
    }

    public char peek() {
        return data[front];
    }
}
