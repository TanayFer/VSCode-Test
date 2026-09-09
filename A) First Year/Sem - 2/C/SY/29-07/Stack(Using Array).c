#include<stdio.h>
#include<stdlib.h>
int main()	{
	int ary[100],no, opt, cnt, i;
	char opt2;
	do{
		printf("\n--------Menu Driven Array----------\n");
		printf("1: Insertion\n");
		printf("2: Deletion\n");
		printf("3: Transversion\n");
		printf("Enter what you want to perform: ");
		scanf("%d", &opt);
		switch(opt){
			
			case 1:printf("\nEnter how many elements you want to enter: ");
				scanf("%d",&no);
				for(i=0; i<no; i++)	{
					printf("Enter %d Number: ",i+1);
					scanf("%d",&ary[i]);
				}
				break;
			
			case 2:printf("\nEntered Elements\n");
				int sel;
				printf("Enter which position you want to delete: ");
				scanf("%d", &sel);
				sel--;
				
			    if (no <= 0) {
			        printf("Error: Array is empty. Cannot delete.\n");
			        return 1;
			    }
			    if (sel < 0 || sel >= no) {
			        printf("Error: Invalid position for deletion.\n");
			        return 1;
			    }
			    printf("Element %d deleted successfully from position %d.\n", ary[sel], sel);
			    while(i = sel) {
			        ary[i] = 0;
			        break;
			    }	
			break;
			
			case 3:printf("Entered Elements\n");
				for(i=0; i<no; i++)	{
					printf("%d\t",ary[i]);
				}
			break;
			
			default:printf("Error 404");
			break;
		}
		printf("\nEnter 1 to Repeat: ");
		scanf("%d",&cnt);
	}while(cnt==1);
	return 0;
}