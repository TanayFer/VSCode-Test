#include<stdio.h>
#include <stdlib.h>
#define max 5
int queue[max];
int f= -1, r= -1;
int isFull()
{
    return (r+1) % max==f;
}

int isEmp()
{
    return f== -1;
}

void enqueue(int data)
{
    if (isFull()) {
        printf("Queue overflow\n");
        return;
    }
    if (f== -1) {
        f = 0;
    }
    r= (r+1) % max;
    queue[r]= data;
    printf("Element %d inserted\n", data);
}

int dequeue()
{
    if (isEmp()) {
        printf("Queue underflow\n");
        return -1;
    }
    int data= queue[f];
    if (f== r) {
        f= r = -1;
    }
    else {
        f= (f+1) % max;
    }
    return data;
}

void display()
{
    if (isEmp()) {
        printf("Queue is empty\n");
        return;
    }
    printf("Queue elements: ");
    for(int i=f; i<=r; i++){
    	printf("%d\t",queue[i]);
	}
}

int main()
{
	int no;
	while(1)	{
		printf("\n-------------------Queue OperatN's-------------------\n");
		printf("1:-Enqueue\n");
		printf("2:-Dequeue\n");
		printf("3:-Display\n");
		printf("4:-Exit\n");
		
		printf("What do you want to perform: ");
		scanf("%d",&no);
		switch(no){
			case 1:printf("Enter Data to Enqueue: ");
				int data;
				scanf("%d",&data);
				enqueue(data);
				break;
				
			case 2:dequeue();
				break;
			
			case 3:display();
				break;
			
			case 4:exit(0);
				break;
				
			default:printf("Error 404");
				break;
		}
	}
    return 0;
}
