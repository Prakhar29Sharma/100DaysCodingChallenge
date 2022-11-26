#include<stdio.h>
#include<stdlib.h>

struct node {
    int data;
    struct node *prev;
    struct node *next;
};

struct node *list = NULL;

struct node* getnode() {
    return (struct node*) malloc(sizeof(struct node));
}

void insertBeg(int n) {
    struct node *nn = getnode();
    nn->data = n;
    nn->prev = NULL;
    if(list == NULL) {
        nn->next = NULL;
        list = nn;
    } else {
        nn->next = list;
        list = nn;
    }
}

void insertEnd(int n) {
    struct node *nn = getnode();
    nn->data = n;
    nn->next = NULL;
    if(list == NULL) {
        nn->prev = NULL;
        list = nn;
    } else {
        struct node *temp = list;
        while(temp->next!=NULL) {
            temp=temp->next;
        }
        temp->next = nn;
    }
}

void insertAt(int n, int pos) {
    if(list == NULL) {
        printf("List is Empty!\n");
    } else {
        if(pos == 1) {
            insertBeg(n);
            return;
        }
        int count = 0;
        struct node *nn = getnode();
        nn->data = n;
        struct node *prev = NULL;
        struct node *temp = list;
        while(temp->next!=NULL) {
            prev = temp;
            temp = temp->next;
            count++;
            if(count == pos-1) {
                // pointer manipulation
                prev->next = nn;
                nn->prev = prev;
                nn->next = temp;
                temp->prev = nn;
                break;
            }
        }
        if(count < pos-1) {
            printf("there're lesse number of elements in the list!\n");
        }
    }
}

void display() {
    if(list == NULL) {
        printf("List is Empty!\n");
    } else {
        struct node *temp = list;
        while(temp!=NULL) {
            printf("%d ", temp->data);
            temp = temp->next;
        }
        printf("\n");
    }
}

// Driver Code
int main()
{
    int ch, n, pos;
    
    while(1) {
        printf("---Doubly Linked List Menu---\n");
        printf("1. Insert at beginning\n");
        printf("2. Insert at end\n");
        printf("3. Insert at location\n");
        printf("4. Display\n");
        printf("5. Exit\n");
        printf("Enter your choice : ");
        scanf("%d", &ch);
        switch(ch) {
            case 1:
                printf("Enter a number : ");
                scanf("%d",&n);
                insertBeg(n);
                break;
            case 2:
                printf("Enter a number : ");
                scanf("%d",&n);
                insertEnd(n);
                break;
            case 3:
                printf("Enter a number : ");
                scanf("%d",&n);
                printf("Enter a position to insert element at : ");
                scanf("%d", &pos);
                insertAt(n, pos);
                break;
            case 4:
                display();
                break;
            case 5:
                exit(0);
                break;
            default:
                printf("Invalid Choice! Try Again!\n");
        }
    }

    return 0;
}