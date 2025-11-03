#include <stdio.h>
#include <stdlib.h>

// Structure for a node in the singly linked list
typedef struct Node {
    int data;
    struct Node* next;
} Node;

// Function to create a new node
Node* createNode(int data) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    if (newNode == NULL) {
        printf("Memory allocation failed!\n");
        return NULL;
    }
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

// Function to insert at the beginning of the list
Node* insertAtBeginning(Node* head, int data) {
    Node* newNode = createNode(data);
    if (newNode == NULL) {
        return head;
    }
    newNode->next = head;
    printf("Element %d inserted at beginning successfully!\n", data);
    return newNode;
}

// Function to insert at the end of the list
Node* insertAtEnd(Node* head, int data) {
    Node* newNode = createNode(data);
    if (newNode == NULL) {
        return head;
    }
    
    if (head == NULL) {
        printf("Element %d inserted at end successfully!\n", data);
        return newNode;
    }
    
    Node* temp = head;
    while (temp->next != NULL) {
        temp = temp->next;
    }
    temp->next = newNode;
    printf("Element %d inserted at end successfully!\n", data);
    return head;
}

// Function to insert at a specific position
Node* insertAtPosition(Node* head, int data, int position) {
    if (position < 1) {
        printf("Invalid position! Position should be >= 1\n");
        return head;
    }
    
    if (position == 1) {
        return insertAtBeginning(head, data);
    }
    
    Node* newNode = createNode(data);
    if (newNode == NULL) {
        return head;
    }
    
    Node* temp = head;
    for (int i = 1; i < position - 1 && temp != NULL; i++) {
        temp = temp->next;
    }
    
    if (temp == NULL) {
        printf("Position %d is out of bounds!\n", position);
        free(newNode);
        return head;
    }
    
    newNode->next = temp->next;
    temp->next = newNode;
    printf("Element %d inserted at position %d successfully!\n", data, position);
    return head;
}

// Function to delete from beginning
Node* deleteFromBeginning(Node* head) {
    if (head == NULL) {
        printf("List is empty! Cannot delete.\n");
        return head;
    }
    
    Node* temp = head;
    head = head->next;
    printf("Element %d deleted from beginning successfully!\n", temp->data);
    free(temp);
    return head;
}

// Function to delete from end
Node* deleteFromEnd(Node* head) {
    if (head == NULL) {
        printf("List is empty! Cannot delete.\n");
        return head;
    }
    
    if (head->next == NULL) {
        printf("Element %d deleted from end successfully!\n", head->data);
        free(head);
        return NULL;
    }
    
    Node* temp = head;
    while (temp->next->next != NULL) {
        temp = temp->next;
    }
    
    printf("Element %d deleted from end successfully!\n", temp->next->data);
    free(temp->next);
    temp->next = NULL;
    return head;
}

// Function to delete a specific element
Node* deleteElement(Node* head, int data) {
    if (head == NULL) {
        printf("List is empty! Element %d not found.\n", data);
        return head;
    }
    
    if (head->data == data) {
        Node* temp = head;
        head = head->next;
        printf("Element %d deleted successfully!\n", data);
        free(temp);
        return head;
    }
    
    Node* temp = head;
    while (temp->next != NULL && temp->next->data != data) {
        temp = temp->next;
    }
    
    if (temp->next == NULL) {
        printf("Element %d not found in the list!\n", data);
        return head;
    }
    
    Node* nodeToDelete = temp->next;
    temp->next = nodeToDelete->next;
    printf("Element %d deleted successfully!\n", data);
    free(nodeToDelete);
    return head;
}

// Function to delete at a specific position
Node* deleteAtPosition(Node* head, int position) {
    if (head == NULL) {
        printf("List is empty! Cannot delete.\n");
        return head;
    }
    
    if (position < 1) {
        printf("Invalid position! Position should be >= 1\n");
        return head;
    }
    
    if (position == 1) {
        return deleteFromBeginning(head);
    }
    
    Node* temp = head;
    for (int i = 1; i < position - 1 && temp != NULL; i++) {
        temp = temp->next;
    }
    
    if (temp == NULL || temp->next == NULL) {
        printf("Position %d is out of bounds!\n", position);
        return head;
    }
    
    Node* nodeToDelete = temp->next;
    temp->next = nodeToDelete->next;
    printf("Element %d at position %d deleted successfully!\n", nodeToDelete->data, position);
    free(nodeToDelete);
    return head;
}

// Function to search for an element
int search(Node* head, int data) {
    Node* temp = head;
    int position = 1;
    
    while (temp != NULL) {
        if (temp->data == data) {
            printf("Element %d found at position %d\n", data, position);
            return position;
        }
        temp = temp->next;
        position++;
    }
    
    printf("Element %d not found in the list!\n", data);
    return -1;
}

// Function to display the list
void display(Node* head) {
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

// Function to count nodes
int countNodes(Node* head) {
    int count = 0;
    Node* temp = head;
    while (temp != NULL) {
        count++;
        temp = temp->next;
    }
    return count;
}

// Function to reverse the list
Node* reverse(Node* head) {
    if (head == NULL) {
        printf("List is empty! Cannot reverse.\n");
        return head;
    }
    
    Node* prev = NULL;
    Node* current = head;
    Node* next = NULL;
    
    while (current != NULL) {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }
    
    printf("List reversed successfully!\n");
    return prev;
}

// Function to free all nodes
Node* freeList(Node* head) {
    Node* temp;
    while (head != NULL) {
        temp = head;
        head = head->next;
        free(temp);
    }
    printf("All nodes freed successfully!\n");
    return NULL;
}

// Function to display menu
void displayMenu() {
    printf("\n=== SINGLY LINKED LIST OPERATIONS ===\n");
    printf("1.  Insert at beginning\n");
    printf("2.  Insert at end\n");
    printf("3.  Insert at position\n");
    printf("4.  Delete from beginning\n");
    printf("5.  Delete from end\n");
    printf("6.  Delete specific element\n");
    printf("7.  Delete at position\n");
    printf("8.  Search element\n");
    printf("9.  Display list\n");
    printf("10. Count nodes\n");
    printf("11. Reverse list\n");
    printf("12. Clear entire list\n");
    printf("13. Exit\n");
    printf("====================================\n");
    printf("Enter your choice: ");
}

int main() {
    Node* head = NULL;
    int choice, data, position;
    
    printf("Welcome to Singly Linked List Implementation in C!\n");
    
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
                printf("Enter element to insert at beginning: ");
                if (scanf("%d", &data) == 1) {
                    head = insertAtBeginning(head, data);
                } else {
                    printf("Invalid input! Please enter a number.\n");
                    while (getchar() != '\n');
                }
                break;
                
            case 2:
                printf("Enter element to insert at end: ");
                if (scanf("%d", &data) == 1) {
                    head = insertAtEnd(head, data);
                } else {
                    printf("Invalid input! Please enter a number.\n");
                    while (getchar() != '\n');
                }
                break;
                
            case 3:
                printf("Enter element to insert: ");
                if (scanf("%d", &data) == 1) {
                    printf("Enter position: ");
                    if (scanf("%d", &position) == 1) {
                        head = insertAtPosition(head, data, position);
                    } else {
                        printf("Invalid position input!\n");
                        while (getchar() != '\n');
                    }
                } else {
                    printf("Invalid data input!\n");
                    while (getchar() != '\n');
                }
                break;
                
            case 4:
                head = deleteFromBeginning(head);
                break;
                
            case 5:
                head = deleteFromEnd(head);
                break;
                
            case 6:
                printf("Enter element to delete: ");
                if (scanf("%d", &data) == 1) {
                    head = deleteElement(head, data);
                } else {
                    printf("Invalid input! Please enter a number.\n");
                    while (getchar() != '\n');
                }
                break;
                
            case 7:
                printf("Enter position to delete: ");
                if (scanf("%d", &position) == 1) {
                    head = deleteAtPosition(head, position);
                } else {
                    printf("Invalid input! Please enter a number.\n");
                    while (getchar() != '\n');
                }
                break;
                
            case 8:
                printf("Enter element to search: ");
                if (scanf("%d", &data) == 1) {
                    search(head, data);
                } else {
                    printf("Invalid input! Please enter a number.\n");
                    while (getchar() != '\n');
                }
                break;
                
            case 9:
                display(head);
                break;
                
            case 10:
                printf("Total nodes in the list: %d\n", countNodes(head));
                break;
                
            case 11:
                head = reverse(head);
                break;
                
            case 12:
                head = freeList(head);
                break;
                
            case 13:
                printf("Freeing memory...\n");
                head = freeList(head);
                printf("Thank you for using Singly Linked List Implementation!\n");
                printf("Exiting program...\n");
                exit(0);
                break;
                
            default:
                printf("Invalid choice! Please enter a number between 1-13.\n");
                break;
        }
        
        // Pause before showing menu again
        printf("\nPress Enter to continue...");
        while (getchar() != '\n');
        getchar();
    }
    
    return 0;
}
