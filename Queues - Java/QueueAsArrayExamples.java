public class QueueAsArrayExamples {

    /**
     * Main method
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        QueueAsArray queue = new QueueAsArray();

        queue.enqueue(5);
        queue.enqueue(17);
        queue.enqueue(3);
        queue.enqueue(3);
        // [5, 17, 3, 3]

        queue.dequeue();
        // [17, 3, 3]

        queue.enqueue(13);
        queue.enqueue(11);
        // [17, 3, 3, 13, 11]


        queue.peekFront(); // Will print '17'
        System.out.println(queue.getSize()); // Will output the size of queue
        queue.display(); // Displays the queue
    }
}
