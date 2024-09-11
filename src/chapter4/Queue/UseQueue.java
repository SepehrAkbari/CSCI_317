package chapter4.Queue;

public class UseQueue {
    public static void main(String[] args) {
        MyQueue q = new MyQueue(10);

        String text = "Lake Forest College";
        for (int i = 0; i < text.length(); i++) {
            if (q.isFull()) {
                System.out.println("Queue is full");
                break;
            }
            System.out.println("Queuing " + text.charAt(i));
            try {
                q.enqueue(text.charAt(i));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            System.out.println("Dequeuing " + q.dequeue());
            System.out.println("Dequeuing " + q.dequeue());
            System.out.println("Dequeuing " + q.dequeue());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String text2 = "ABRACADBRA";
        for (int j = 0; j < text2.length(); j++) {
            if (q.isFull()) {
                System.out.println("Queue is full");
                break;
            }
            System.out.println("Queuing " + text.charAt(j));
            try {
                q.enqueue(text.charAt(j));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            q.dequeue();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
