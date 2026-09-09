#include <stdio.h>
#include<string.h>
struct employees {
    char name[50];
    int id;
    int sal;
};

int main() {
    int no;
    printf("Enter how many Employees Data you need to save: ");
    scanf("%d", &no);

    struct employees e[no];

    for (int i = 0; i < no; i++) {
        printf("Name of %d employee: ", i + 1);
        scanf("%s", &e[i].name);

        printf("ID of %d employee: ", i + 1);
        scanf("%d", &e[i].id);

        printf("Salary of %d employee: ", i + 1);
        scanf("%d", &e[i].sal);
    }
    
    printf("\nEmployees Data\n");
    
    for (int i = 0; i < no; i++) {
    	printf("Name: %s\n",e[i].name);
    	printf("Id: %d\n",e[i].id);
    	printf("Salary: %d\n",e[i].sal);
	}
	
    return 0;
}