#include<stdio.h>
#include<stdlib.h>

typedef struct Node{
	int data;
	struct Node *next;
}Node;

Node *createNode(int data) {
    Node *newNode = (Node*)malloc(sizeof(Node));
    if (newNode == NULL) {
        printf("Memory allocation failed!\n");
        return NULL;
    }
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

Node *insertAtEnd(Node *head, int data) {
    Node* newNode = createNode(data);
    if (newNode == NULL) {
        return head;
    }
    
    if (head == NULL) {
        printf("Element %d inserted at end.\n", data);
        return newNode;
    }
    
    Node* temp = head;
    while (temp->next != NULL) {
        temp = temp->next;
    }
    temp->next = newNode;
    printf("Element %d inserted at end.\n", data);
    return head;
}

Node *deleteFromEnd(Node *head) {
    if (head == NULL) {
        printf("List is empty! Cannot delete.\n");
        return head;
    }
    
    if (head->next == NULL) {
        printf("Element %d deleted from end.\n", head->data);
        free(head);
        return NULL;
    }
    
    Node* temp = head;
    while (temp->next->next != NULL) {
        temp = temp->next;
    }
    
    printf("Element %d deleted from end.\n", temp->next->data);
    free(temp->next);
    temp->next = NULL;
    return head;
}

void display(Node *head) {
    if (head == NULL) {
        printf("List is empty!\n");
        return;
    }
    
    printf("Linked List: ");
    Node* temp = head;
    while (temp != NULL) {
        printf("%d", temp->data);
        if (temp->next != NULL) {
            printf(" -> ");
        }
        temp = temp->next;
    }
    printf(" -> NULL\n");
}

int main() {
    Node* head = NULL;
    int choice, data;

    do {
        printf("\n--- Singly Linked List Menu ---\n");
        printf("1. Insert at End\n");
        printf("2. Delete from End\n");
        printf("3. Display\n");
        printf("4. Exit\n");
        printf("Enter choice: ");
        
        if (scanf("%d", &choice) != 1) {
            printf("Invalid input.\n");
            while(getchar() != '\n');
            choice = 0;
            continue;
        }

        switch (choice) {
            case 1:
                printf("Enter data to insert: ");
                if (scanf("%d", &data) != 1) {
                    printf("Invalid data input.\n");
                    while(getchar() != '\n');
                    break;
                }
                head = insertAtEnd(head, data);
                break;
            case 2:
                head = deleteFromEnd(head);
                break;
            case 3:
                display(head);
                break;
            case 4:
                printf("Exiting program.\n");
                Node* current = head;
                Node* next_node;
                while (current != NULL) {
                    next_node = current->next;
                    free(current);
                    current = next_node;
                }
                break;
            default:
                printf("Invalid choice. Try again.\n");
        }
    } while (choice != 4);

    return 0;
}