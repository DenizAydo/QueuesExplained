public class QueueAsArray {

    /**
     * Init a default capacity for the queue
     */
    private static final int n = 6;

    /**
     * Init the queue and giving it the declared default capacity
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
     * The current items in the queue
     */
    private int currentItems = 0;

    /**
     * Inserts a randomly given number into the queue
     * @param item element to be added into the queue
     */
    public void enqueue(int item) {
      if(isFull()) System.out.println("The Queue is full");
      // If the queue is empty, direct front and rear to 0 and insert the item
      // Increase currentItems
      else if(isEmpty()) {
          front = 0;
          rear = 0;
          queue[rear] = item;
          currentItems++;
      } else {
          // If neither is true, increase rear and insert the item
          // Increase currentItems
          rear++;
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
          // If neither is true, increase the front (deletes the item)
          // Decrease currentItems
        } else {
            front++;
            currentItems--;
        }
    }

    /**
     * Displays the queue
     */
    public void display() {
        if (isEmpty()) System.out.println("The Queue is empty");
        else {
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
     * Shows the first Item in the queue
     */
    public void peekFront() {
        if(isEmpty()) System.out.println("The Queue is empty");
        else {
            System.out.println(" ");
            System.out.println(queue[front]);
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
