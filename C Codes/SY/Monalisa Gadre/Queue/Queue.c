#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 100

// Structure to represent a queue
typedef struct {
    int data[MAX_SIZE];
    int front;
    int rear;
    int size;
} Queue;

// Function to initialize the queue
void initQueue(Queue* q) {
    q->front = 0;
    q->rear = -1;
    q->size = 0;
}

// Function to check if queue is empty
int isEmpty(Queue* q) {
    return q->size == 0;
}

// Function to check if queue is full
int isFull(Queue* q) {
    return q->size == MAX_SIZE;
}

// Function to add element to queue (Enqueue)
void enqueue(Queue* q, int value) {
    if (isFull(q)) {
        printf("Queue Overflow! Cannot add element %d\n", value);
        return;
    }
    
    q->rear = (q->rear + 1) % MAX_SIZE;
    q->data[q->rear] = value;
    q->size++;
    printf("Element %d added to queue successfully!\n", value);
}

// Function to remove element from queue (Dequeue)
int dequeue(Queue* q) {
    if (isEmpty(q)) {
        printf("Queue Underflow! Queue is empty\n");
        return -1;
    }
    
    int value = q->data[q->front];
    q->front = (q->front + 1) % MAX_SIZE;
    q->size--;
    printf("Element %d removed from queue successfully!\n", value);
    return value;
}

// Function to get front element without removing it
int peek(Queue* q) {
    if (isEmpty(q)) {
        printf("Queue is empty! No front element\n");
        return -1;
    }
    
    return q->data[q->front];
}

// Function to display all elements in queue
void display(Queue* q) {
    if (isEmpty(q)) {
        printf("Queue is empty!\n");
        return;
    }
    
    printf("Queue elements (front to rear): ");
    int i = q->front;
    for (int count = 0; count < q->size; count++) {
        printf("%d ", q->data[i]);
        i = (i + 1) % MAX_SIZE;
    }
    printf("\n");
}

// Function to get queue size
int getSize(Queue* q) {
    return q->size;
}

// Function to clear the queue
void clearQueue(Queue* q) {
    initQueue(q);
    printf("Queue cleared successfully!\n");
}

// Function to display menu
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
    Queue q;
    int choice, value;
    
    // Initialize the queue
    initQueue(&q);
    
    printf("Welcome to Queue Implementation in C!\n");
    printf("Maximum queue size: %d\n", MAX_SIZE);
    
    while (1) {
        displayMenu();
        
        // Get user choice
        if (scanf("%d", &choice) != 1) {
            printf("Invalid input! Please enter a number.\n");
            // Clear input buffer
            while (getchar() != '\n');
            continue;
        }
        
        switch (choice) {
            case 1:
                printf("Enter element to enqueue: ");
                if (scanf("%d", &value) == 1) {
                    enqueue(&q, value);
                } else {
                    printf("Invalid input! Please enter a number.\n");
                    while (getchar() != '\n');
                }
                break;
                
            case 2:
                dequeue(&q);
                break;
                
            case 3:
                value = peek(&q);
                if (value != -1) {
                    printf("Front element: %d\n", value);
                }
                break;
                
            case 4:
                display(&q);
                break;
                
            case 5:
                if (isEmpty(&q)) {
                    printf("Queue is empty\n");
                } else {
                    printf("Queue is not empty\n");
                }
                break;
                
            case 6:
                if (isFull(&q)) {
                    printf("Queue is full\n");
                } else {
                    printf("Queue is not full\n");
                }
                break;
                
            case 7:
                printf("Current queue size: %d\n", getSize(&q));
                break;
                
            case 8:
                clearQueue(&q);
                break;
                
            case 9:
                printf("Thank you for using Queue Implementation!\n");
                printf("Exiting program...\n");
                exit(0);
                break;
                
            default:
                printf("Invalid choice! Please enter a number between 1-9.\n");
                break;
        }
    }
    
    return 0;
}
