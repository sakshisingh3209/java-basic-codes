public class queueArray {
    public static class queue {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int val) {
            if (rear == arr.length-1) {
                System.out.println("Queue is full!");
                return;
            }
            if (front == -1) {
                front = rear = 0;
            } else {
                arr[rear] = val;
                rear++;
            }
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            int x = arr[front];
            front++;
            size--;
            return x;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[front];
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty!");
            } else {
                for (int i = front; i < rear; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        queue q = new queue();

        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);

        System.out.println("Queue elements:");
        q.display();

        int removedElement = q.remove();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Updated queue elements:");
        q.display();
    }
}
