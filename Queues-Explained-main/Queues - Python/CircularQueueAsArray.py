class CircularQueueAsArray:

    # Init variables for the queue
    def __init__(self, capacity=5):
        self.n = capacity
        self.queue = [None] * self.n
        self.front = -1
        self.rear = -1
        self.current_items = 0

    # Inserts a randomly given number into the queue
    def enqueue(self, item):
        if self.is_empty():
            self.front = 0
            self.rear = 0
            self.queue[self.rear] = item
            self.current_items += 1
        elif self.is_full():
            print("The Queue is full")
        else:
            self.rear = (self.rear + 1) % self.n
            self.queue[self.rear] = item
            self.current_items += 1

    # Deletes the randomly given number from the queue
    def dequeue(self):
        if self.is_empty():
            print("The Queue is empty")
        elif self.front == self.rear:
            self.front = -1
            self.rear = -1
        else:
            self.front = (self.front + 1) % self.n
            self.current_items -= 1

    # Displays the queue
    def display(self):
        if self.is_empty():
            print("The Queue is empty")
        else:
            result = "["
            current = self.front
            while True:
                result += str(self.queue[current])
                if current == self.rear:
                    break
                result += ", "
                current = (current + 1) % self.n
            result += "]"
            print(result)

    # Shows the front of the queue
    def peek_front(self):
        if self.is_empty():
            print("The Queue is empty")
        else:
            print(f"{self.queue[self.front]} -> (front)")

    # Shows the rear of the queue
    def peek_rear(self):
        if self.is_empty():
            print("The Queue is empty")
        else:
            print(f"{self.queue[self.rear]} -> (rear)")

    # Tells if the queue is full
    def is_full(self):
        return self.current_items == self.n

    # Tells if the queue is empty
    def is_empty(self):
        return self.current_items == 0

    # Shows the current items in the queue
    def get_size(self):
        return self.current_items


# Main method
if __name__ == "__main__":
    queue = CircularQueueAsArray(5)

    queue.enqueue(9)
    queue.enqueue(7)
    queue.enqueue(4)
    queue.enqueue(5)
    queue.enqueue(8)
    # [9(front), 7, 4, 5, 8(rear)]

    queue.dequeue()  # Removes '9' and declares '7' as new front
    # [9, 7(front), 4, 5, 8(rear)]

    queue.enqueue(2)  # Insert '2'
    # queue is equal to: '[2(rear), 7(front), 4, 5, 8]'
    # output array will show: '[7(front), 4, 5, 8, 2(rear)]'

    queue.peek_front()  # Will print '7'
    queue.peek_rear()  # Will print '2'
    print(queue.is_full())  # Will print 'true'
    print(queue.get_size())  # Will print the number '5'
    queue.display()  # Displays the array of the queue in the console

# Note that in Python arrays are handled similar to lists
