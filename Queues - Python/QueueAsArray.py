class QueueAsArray:

    # Init the variables for the queue
    def __init__(self, capacity=6):
        self.n = capacity
        self.queue = [0] * self.n
        self.front = -1
        self.rear = -1
        self.current_items = 0

    # Inserts a randomly given number into the queue
    def enqueue(self, item):
        if self.is_full():
            print("The Queue is full")
        elif self.is_empty():
            self.front = 0
            self.rear = 0
            self.queue[self.rear] = item
            self.current_items += 1
        else:
            self.rear += 1
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
            self.front += 1
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

    # Shows the first Item in the queue
    def peek_front(self):
        if self.is_empty():
            print("The Queue is empty")
        else:
            print(" ")
            print(self.queue[self.front])

    # Tells if the queue is full
    def is_full(self):
        return self.current_items == self.n

    # Tells if the queue is empty
    def is_empty(self):
        return self.current_items == 0

    # Shows the current items in the queue
    def get_size(self):
        return self.current_items


# the main method
if __name__ == "__main__":
    queue = QueueAsArray(6)

    queue.enqueue(5)
    queue.enqueue(17)
    queue.enqueue(3)
    queue.enqueue(3)

    queue.dequeue()

    queue.enqueue(13)
    queue.enqueue(11)

    queue.peek_front()
    print(queue.get_size())
    queue.display()

# Note that in Python arrays are handled similar to lists
