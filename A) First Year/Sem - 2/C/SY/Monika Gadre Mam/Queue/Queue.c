#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 100

// Basic array-based queue using global variables (no struct)
int queueArr[MAX_SIZE];
int front = -1;
int rear = -1;

// Initialize queue
void initQueue() {
    front = -1;
    rear = -1;
}

// Check if queue is empty
int isEmpty() {
    return (front == -1 || front > rear);
}

// Check if queue is full (simple non-circular queue)
int isFull() {
    return (rear == MAX_SIZE - 1);
}

// Enqueue operation
void enqueue(int value) {
    if (isFull()) {
        printf("Queue Overflow! Cannot add element %d\n", value);
        return;
    }
    if (front == -1) {
        front = 0;
    }
    rear++;
    queueArr[rear] = value;
    printf("Element %d added to queue successfully!\n", value);
}

// Dequeue operation
int dequeue() {
    if (isEmpty()) {
        printf("Queue Underflow! Queue is empty\n");
        return -1;
    }
    int value = queueArr[front];
    front++;
    // Reset when queue becomes empty
    if (front > rear) {
        initQueue();
    }
    printf("Element %d removed from queue successfully!\n", value);
    return value;
}

// Peek operation (view front element)
int peek() {
    if (isEmpty()) {
        printf("Queue is empty! No front element\n");
        return -1;
    }
    return queueArr[front];
}

// Display all elements
void display() {
    if (isEmpty()) {
        printf("Queue is empty!\n");
        return;
    }
    printf("Queue elements (front to rear): ");
    for (int i = front; i <= rear; i++) {
        printf("%d ", queueArr[i]);
    }
    printf("\n");
}

// Get current size
int getSize() {
    if (isEmpty()) return 0;
    return (rear - front + 1);
}

// Clear queue
void clearQueue() {
    initQueue();
    printf("Queue cleared successfully!\n");
}

// Menu
void displayMenu() {
    printf("\n=== QUEUE OPERATIONS MENU ===\n");
    printf("1. Enqueue (Add element)\n");
    printf("2. Dequeue (Remove element)\n");
    printf("3. Peek (View front element)\n");
    printf("4. Display queue\n");
    printf("5. Check if empty\n");
    printf("6. Check if full\n");
    printf("7. Get queue size\n");
    printf("8. Clear queue\n");
    printf("9. Exit\n");
    printf("============================\n");
    printf("Enter your choice: ");
}

int main() {
    int choice, value;
    initQueue();

    printf("Welcome to Basic Queue (Array, no struct) in C!\n");
    printf("Maximum queue size: %d\n", MAX_SIZE);

    while (1) {
        displayMenu();

        if (scanf("%d", &choice) != 1) {
            printf("Invalid input! Please enter a number.\n");
            while (getchar() != '\n');
            continue;
        }

        switch (choice) {
            case 1:
                printf("Enter element to enqueue: ");
                if (scanf("%d", &value) == 1) {
                    enqueue(value);
                } else {
                    printf("Invalid input! Please enter a number.\n");
                    while (getchar() != '\n');
                }
                break;

            case 2:
                dequeue();
                break;

            case 3:
                value = peek();
                if (value != -1) {
                    printf("Front element: %d\n", value);
                }
                break;

            case 4:
                display();
                break;

            case 5:
                if (isEmpty()) {
                    printf("Queue is empty\n");
                } else {
                    printf("Queue is not empty\n");
                }
                break;

            case 6:
                if (isFull()) {
                    printf("Queue is full\n");
                } else {
                    printf("Queue is not full\n");
                }
                break;

            case 7:
                printf("Current queue size: %d\n", getSize());
                break;

            case 8:
                clearQueue();
                break;

            case 9:
                printf("Thank you for using Basic Queue!\n");
                printf("Exiting program...\n");
                exit(0);

            default:
                printf("Invalid choice! Please enter a number between 1-9.\n");
                break;
        }
    }

    return 0;
}
