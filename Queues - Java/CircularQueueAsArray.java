public class CircularQueueAsArray {

    /**
     * Init a default capacity for the queue
     */
    private static final int n = 5;

    /**
     * Init the queue and giving the declared default capacity
     */
    private int[] queue = new int[n];

    /**
     * Front of the given queue
     */
    private int front = -1;

    /**
     * Rear of the given queue
     */
    private int rear = -1;

    /**
     * current Items in the queue
     */
    private int currentItems = 0;

    /**
     * Inserts a randomly given number into the queue
     *
     * @param item element to be added into the queue
     */
    public void enqueue(int item) {
        // If the queue is empty, direct front and rear to 0 and insert the item
        // Increase currentItems
        if(isEmpty()) {
            front = 0;
            rear = 0;
            queue[rear] = item;
            currentItems++;
        } else if(isFull()) { // equal to (rear + 1) % n
            System.out.println("The Queue is full");
        } else {
            // If neither is true, increase rear and insert the item
            // If rear is the end of the queue, direct it to the beginning for circular queue condition
            // Increase currentItems
            rear = (rear + 1) % n;
            queue[rear] = item;
            currentItems++;
        }
    }

    /**
     * Deletes the randomly given number from the queue
     */
    public void dequeue() {
        if(isEmpty()) System.out.println("The Queue is empty");
        // if front is equal to rear, direct both of them to -1
        else if(front == rear) {
            front = -1;
            rear = -1;
        } else {
            // If neither is true, increase front (deletes the item)
            // If front is the end of the queue, direct it to the beginning for circular queue condition
            // Decrease currentItems
            front = (front + 1) % n;
            currentItems--;
        }
    }

    /**
     * Displays the queue
     */
    public void display() {
        if (isEmpty()) {
            System.out.println("The Queue is empty");
        } else {
            StringBuilder result = new StringBuilder("[");
            int current = front;

            while (true) {
                result.append(queue[current]);

                if (current == rear) {
                    break;
                }

                result.append(", ");
                current = (current + 1) % n;
            }

            result.append("]");
            System.out.println(result);
        }
    }

    /**
     * Shows the front of the queue
     */
    public void peekFront() {
        if(isEmpty()) System.out.println("The Queue is empty");
        else {
            System.out.print(queue[front]);
            System.out.println(" " + "-> (front)");
        }
    }

    /**
     * Shows the rear of the queue
     */
    public void peekRear() {
        if(isEmpty()) System.out.println("The Queue is empty");
        else {
            System.out.print(queue[rear]);
            System.out.println(" " + "-> (rear)");
        }
    }

    /**
     * Tells if the queue is full
     *
     * @return if the current items in the queue are equal to the size n
     */
    public boolean isFull() {
        return currentItems == n;
    }

    /**
     * Tells if the queue is empty
     *
     * @return if there are no current items in the queue
     */
    public boolean isEmpty() {
        return currentItems == 0;
    }

    /**
     * Shows the current items in the queue
     *
     * @return gives back the items
     */
    public int getSize() {
        return currentItems;
    }
}


