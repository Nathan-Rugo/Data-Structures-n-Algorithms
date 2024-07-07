# Queue Lab 🧍‍♀️🧍‍♂️🧍🚶‍♀️

## **Part 1**

### Steps

1. **Download Instructions**: Download the Queues lab instructions from the e-learning portal.
2. **Download Queue.java**: Download the `Queue.java` class from the e-learning portal.
3. **Create a Project**: Create a new NetBeans project for the lab on Queues.
4. **Add Queue.java**: Add the `Queue.java` class to the project.
5. **Modify Queue.java**: Modify the `Queue.java` class so that when a new item joins the queue, their queue position will be displayed. Use `System.out` for this.
6. **Create Test Class**: Create a test class for the queue class. Call it `QueueTest.java`. It should have a main method.
7. **Initialize Queue**: Create a queue with 10 elements. Hint: make use of the constructor just like the Stacks lab.
8. **Print Front and Rear Indices**: Print out the queue array index values of the current front and rear.
9. **Insert Elements**: Insert 10 elements into the queue.
10. **Print Queue Contents**: Print out the contents of the queue. Identify the elements at the front and rear.
11. **Print Indices Again**: Print out the indexes of the front and rear.
12. **Dequeue Elements**: Dequeue 3 elements.
13. **Enqueue Elements**: Enqueue 2 elements.
14. **Dequeue Again**: Dequeue 2 elements.
15. **Print Final Queue Contents**: Print out the contents of the queue.
16. **Print Final Indices**: Print out the indexes of the front and rear.
17. **Handle Overflow**: Enqueue 6 elements. Do you get an error? How can such an error be prevented? Make necessary changes to the insert method.
18. **Handle Underflow**: Dequeue 11 elements. Do you get an error? How can such an error be prevented? Make necessary changes to the remove method.

### Solution Files
- [Queue](Queue.java)
- [QueueTest](Queue.java)

## **Part 2**

### Task

Modify the code in Part 1 to simulate a bank queue system with a single queue. The system should accept strings (customer names) instead of just numbers.

### Requirements

1. **Accept Strings**: The queue should accept strings (customer names).
2. **Automatic Codes**: Automatically assign codes (a string) to people in the queue.
3. **Test Class**: Create a test class.
    - **Security Guard**: The test class should allow someone (e.g., a security guard) to enqueue a person when a new customer arrives.
    - **Bank Teller**: The test class should allow the bank teller to dequeue a person once they have been served.
    - **Peek Front**: The system should allow calling out the person (using their code) at the front after a person has been served.
4. **System Printout**: Use `System.out` for printouts.


### Solution Files
- [Bank](Bank.java)
- [BankTest](BankTest.java)

### How it works

- **Security Guard** enqueues customers as they arrive.
- Each customer is given a unique code (e.g., "C1", "C2").
- **Bank Teller** dequeues and serves customers.
- After serving, the system calls out the next customer in line.