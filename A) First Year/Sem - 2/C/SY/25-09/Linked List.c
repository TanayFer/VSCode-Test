#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct Node* start = NULL;

// Create a new node
struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

// Insert at beginning
void insertAtBeginning(int data) {
    struct Node* newNode = createNode(data);
    newNode->next = start;
    start = newNode;
    printf("Inserted %d at the beginning.\n", data);
}

// Insert at end
void insertAtEnd(int data) {
    struct Node* newNode = createNode(data);
    if (start == NULL) {
        start = newNode;
        printf("Inserted %d at the end (list was empty).\n", data);
        return;
    }
    struct Node* temp = start;
    //This loop traverses the linked list from the beginning (start) all the way to the last node, i.e., the node whose next is NULL.
    while (temp->next != NULL)
        temp = temp->next;
    temp->next = newNode;
    printf("Inserted %d at the end.\n", data);
}

// Insert at specific position (1-based)
void insertAtPosition(int data, int pos) {
    if (pos <= 0) {
        printf("Invalid position.\n");
        return;
    }

    if (pos == 1) {
        insertAtBeginning(data);
        return;
    }

    struct Node* newNode = createNode(data);
    struct Node* temp = start;
    int count = 1;

    while (temp != NULL && count < pos - 1) {
        temp = temp->next;
        count++;
    }

    if (temp == NULL) {
        printf("Position %d is out of bounds.\n", pos);
        free(newNode);
        return;
    }

    newNode->next = temp->next;
    temp->next = newNode;
    printf("Inserted %d at position %d.\n", data, pos);
}

// Print the list
void printList() {
    if (start == NULL) {
        printf("List is empty.\n");
        return;
    }
    struct Node* temp = start;
    printf("Linked List: ");
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

// Length of list
int length() {
    int count = 0;
    struct Node* temp = start;
    while (temp != NULL) {
        count++;
        temp = temp->next;
    }
    return count;
}

// Search key
int search(int key) {
    struct Node* temp = start;
    int pos = 1;
    while (temp != NULL) {
        if (temp->data == key)
            return pos;
        temp = temp->next;
        pos++;
    }
    return -1;
}

// Delete by key
void deleteByKey(int key) {
    struct Node *temp = start, *prev = NULL;

    if (temp != NULL && temp->data == key) {
        start = temp->next;
        free(temp);
        printf("Node with key %d deleted.\n", key);
        return;
    }

    while (temp != NULL && temp->data != key) {
        prev = temp;
        temp = temp->next;
    }

    if (temp == NULL) {
        printf("Key %d not found.\n", key);
        return;
    }

    prev->next = temp->next;
    free(temp);
    printf("Node with key %d deleted.\n", key);
}

// Delete at position (1-based)
void deleteAtPosition(int pos) {
    if (start == NULL) {
        printf("List is empty.\n");
        return;
    }

    struct Node* temp = start;

    if (pos == 1) {
        start = temp->next;
        free(temp);
        printf("Node at position %d deleted.\n", pos);
        return;
    }

    struct Node* prev = NULL;
    int count = 1;
    while (temp != NULL && count != pos) {
        prev = temp;
        temp = temp->next;
        count++;
    }

    if (temp == NULL) {
        printf("Position %d does not exist.\n", pos);
        return;
    }

    prev->next = temp->next;
    free(temp);
    printf("Node at position %d deleted.\n", pos);
}

// Main Menu
int main() {
    int choice, data, pos, key;

    while (1) {
        printf("\n--- Linked List Menu ---\n");
        printf("1. Insert at Beginning\n");
        printf("2. Insert at End\n");
        printf("3. Insert at Position\n");
        printf("4. Print Linked List\n");
        printf("5. Length of Linked List\n");
        printf("6. Search in Linked List\n");
        printf("7. Delete by Key\n");
        printf("8. Delete at Position\n");
        printf("0. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter data to insert at beginning: ");
                scanf("%d", &data);
                insertAtBeginning(data);
                break;
            case 2:
                printf("Enter data to insert at end: ");
                scanf("%d", &data);
                insertAtEnd(data);
                break;
            case 3:
                printf("Enter data to insert: ");
                scanf("%d", &data);
                printf("Enter position to insert at: ");
                scanf("%d", &pos);
                insertAtPosition(data, pos);
                break;
            case 4:
                printList();
                break;
            case 5:
                printf("Length of Linked List: %d\n", length());
                break;
            case 6:
                printf("Enter key to search: ");
                scanf("%d", &key);
                pos = search(key);
                if (pos == -1)
                    printf("Key %d not found in the list.\n", key);
                else
                    printf("Key %d found at position %d.\n", key, pos);
                break;
            case 7:
                printf("Enter key to delete: ");
                scanf("%d", &key);
                deleteByKey(key);
                break;
            case 8:
                printf("Enter position to delete: ");
                scanf("%d", &pos);
                deleteAtPosition(pos);
                break;
            case 0:
                printf("Exiting program.\n");
                exit(0);
            default:
                printf("Invalid choice! Try again.\n");
        }
    }

    return 0;
}