/* 
* write a menu driven program to implement list ADT using single link list and perform insert at end, insert at location
* delete at location
*/

#include<stdio.h>
#include<stdlib.h>

struct node {
    int info;
    struct node *next;
};

struct node *list = NULL;

struct node* getnode()
{
    return (struct node*)malloc(sizeof(struct node));
}

void insertAtBeg(int x)
{
    if(list == NULL)
    {
        struct node *nn;
        nn = getnode();
        nn->info = x;
        nn->next = NULL;
        list = nn;
    }
    else
    {
        struct node *nn;
        nn = getnode();
        nn->info=x;
        nn->next = list;
        list = nn;
    }
    return;
}

void insertAtEnd(int x)
{
    if(list == NULL)
    {
        int ch;
        printf("List is Empty!\n");
        printf("Do you want to insert first element?\nEnter 1 for yes : ");
        scanf("%d", &ch);
        if(ch == 1)
        {
            insertAtBeg(x);
        }
        return;
    }
    else
    {
        struct node *nn, *temp;
        nn = getnode();
        nn->info = x;
        nn->next = NULL;
        temp = list;
        while(temp->next!=NULL)
        {
            temp = temp->next;
        }
        temp->next = nn;
    }
}

void insertAt(int x, int pos)
{
    if(list == NULL)
    {
        int ch;
        printf("List is Empty!\n");
        printf("Do you want to insert first element?\nEnter 1 for yes : ");
        scanf("%d", &ch);
        if(ch == 1)
        {
            insertAtBeg(x);
        }
        return;
    }
    else
    {
        int count = 1;
        struct node *nn, *temp, *prevtemp;
        temp = list;
        if(pos <= 0)
        {
            printf("value of position must be valid!\n");
            return;
        }
        if(pos == 1)
        {
            insertAtBeg(x);
            return;
        }
        nn = getnode();
        nn->info = x;
        while(temp->next!=NULL)
        {
            
            if(count == pos)
            {
                break;
            }
            prevtemp = temp;
            temp = temp->next;
            count++;
        }
        if(pos > count)
        {
            printf("position is greater than length of the list!\n");
            return;
        }
        nn->next = temp;
        prevtemp->next = nn;

        
    }
}

void deleteAt(int pos)
{
    if(list == NULL)
    {
        printf("List is Empty!\n");
    }
    else
    {
        if(pos <= 0)
        {
            printf("value of position must be valid!\n");
            return;
        }
        int count = 1;
        struct node *temp, *prevtemp;
        temp = list;
        while(temp->next!=NULL)
        {
            if(count == pos)
            {
                break;
            }
            prevtemp = temp;
            temp = temp->next;
            count++;
        }
        if(pos > count)
        {
            printf("position is greater than length of list!\n");
            return;
        }
        prevtemp->next = temp->next;
    }
}

void show()
{
    if(list == NULL)
    {
        printf("List is Empty!\n");
    }
    else
    {
    struct node *temp;
    temp = list;
    while(temp!=NULL)
    {
        printf("%d ", temp->info);
        temp = temp->next;
    }
    printf("\n");
    }
    return;
}

int main()
{
    int ch, n, pos;
    while(1)
    {
        printf("-----List Menu-----\n");
        printf("1. Insert at beginning\n");
        printf("2. Insert at end\n");
        printf("3. Insert at location\n");
        printf("4. Delete at location\n");
        printf("5. Show\n"); 
        printf("6. Exit\n");
        printf("Enter your choice : ");
        scanf("%d", &ch);
        switch(ch)
        {
            case 1:
                printf("Enter a value to insert at Beginning : ");
                scanf("%d", &n);
                insertAtBeg(n);
                break;
            case 2:
                printf("Enter a value to insert at End : ");
                scanf("%d", &n);
                insertAtEnd(n);
                break;
            case 3:
                printf("Enter a value to insert : ");
                scanf("%d", &n);
                printf("Enter position : ");
                scanf("%d", &pos);
                insertAt(n,pos);
                break;
            case 4:
                printf("Delete at Position : ");
                scanf("%d", &pos);
                deleteAt(pos);
                break;
            case 5:
                show();
                break;
            case 6:
                exit(0);
                break;
            default:
                printf("Invalid Choice! Try Again!\n");
        }
    }
}

