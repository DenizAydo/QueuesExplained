public class CircularQueueAsArrayExamples {

    /**
     * Main method
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        CircularQueueAsArray queue = new CircularQueueAsArray();

        queue.enqueue(9);
        queue.enqueue(7);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(8);
        // [9(front), 7 ,4 ,5 ,8(rear)]

        queue.dequeue(); // Removes '9' and declares '7' as new front
        // [9, 7(front) ,4 ,5 ,8(rear)]

        queue.enqueue(2); // Insert '2'
        // queue is equal to: '[2(rear), 7(front), 4, 5, 8]'
        // output array will show: '[7(front), 4, 5, 8, 2(rear)]'

        queue.peekFront(); // Will print '7'
        queue.peekRear(); // Will print '2'
        System.out.println(queue.isFull()); // Will print 'true'
        System.out.println(queue.getSize()); // Will print the number '5'
        queue.display(); // Displays the array of the queue in the console
    }
// Note that the console will output the array of the queue, which is not equal to the queue itself
}