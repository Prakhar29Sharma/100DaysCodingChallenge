#include<stdio.h>

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
    insertBeg(4);
    insertBeg(5);
    insertEnd(6);
    insertEnd(10);
    insertBeg(23);
    display();
    return 0;
}