#include <stdio.h>
#include <stdlib.h>
#define max 10
int stack[max];
int top = -1;
void push(int value) {
    if (top >= max - 1) {
        printf("Stack Overflow: Cannot push element.\n");
    } else {
        top++;
        stack[top] = value;
        printf("%d pushed to stack.\n", value);
    }
}

void pop() {
    if (top < 0) {
        printf("Stack Underflow: Cannot pop element.\n");
    } else {
        printf("Popped element: %d\n", stack[top]);
        top--;
    }
}

void peek() {
    if (top < 0) {
        printf("Stack is empty.\n");
    } else {
        printf("Top element is: %d\n", stack[top]);
    }
}

void display() {
    int i;
    if (top < 0) {
        printf("Stack is empty.\n");
    } else {
        printf("Stack elements are: ");
        for (i = top; i >= 0; i--) {
            printf("%d ", stack[i]);
        }
        printf("\n");
    }
}

int main() {
    int choice, value;
    while (1) {
        printf("--- Stack Menu ---\n");
        printf("1. Push\n");
        printf("2. Pop\n");
        printf("3. Peek\n");
        printf("4. Display\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value to push: ");
                scanf("%d", &value);
                push(value);
                break;
            case 2:
                pop();
                break;
            case 3:
                peek();
                break;
            case 4:
                display();
                break;
            case 5:
                printf("Exiting program.\n");
                exit(0);
            default:
                printf("Invalid choice. Please try again.\n");
        }
    }
    return 0;
}