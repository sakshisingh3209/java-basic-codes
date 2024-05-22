public class CircularQueue {
    public static class Queue {
        int rear = -1;
        int front = -1;
        int size = 0;
        int[] arr = new int[6];

        public void add(int val) throws Exception {
            if (size == arr.length) {
                throw new Exception("Queue is full!");
            } else if (size == 0) {
                front = rear = 0;
                arr[rear] = val;
            } else if (rear < arr.length - 1) {
                rear++;
                arr[rear] = val;
            } else { // rear == arr.length - 1
                rear = 0;
                arr[rear] = val;
            }
            size++;
        }

        public int remove() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is empty!");
            } else {
                int val = arr[front];
                if (front < arr.length - 1) {
                    front++;
                } else { // front == arr.length - 1
                    front = 0;
                }
                size--;
                return val;
            }
        }

        public int peek() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is empty");
            } else {
                return arr[front];
            }
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty!");
            } else if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else { // rear < front
                for (int i = front; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        System.out.println("Queue elements:");
        q.display();
        q.remove();
        q.remove();
        q.display();
        q.add(8);
        q.add(9);
        q.display();
        for(int i=0;i<q.arr.length;i++){
            System.out.print(q.arr[i]+" ");
        }
    }
}
