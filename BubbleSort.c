//Authored by Seaghan Ennis
//Last Updated 1-17-2022
//This will create a linked list and then bubble sort it

#include <stdio.h>
#include<stdlib.h>

#define length 5


//Classic linked list node
struct LinkedNode{
    int value;
    struct LinkedNode * next;
};

//Make a new node by appending it at the end
void makeNewNode(struct LinkedNode * head, int newVal){


    //Make an node and move to front
    struct LinkedNode * current = head;
    while (current->next != NULL) {
        current = current->next;
    }

    current->next = (struct LinkedNode *) malloc(sizeof(struct LinkedNode));
    current->next->value = newVal;
    current->next->next = NULL;
    printf("Making new node with value %d and address %p\n", newVal, current->next);
}

//Print linked list
void print(struct LinkedNode * head){
    printf("Linked list: ");
    struct LinkedNode * current = head;

    while (current != NULL) {
        printf("%d ", current->value);
        current = current->next;
    }
    printf("\n");
}

struct LinkedNode* swap(struct LinkedNode* greater, struct LinkedNode* lesser){
    struct LinkedNode* temp = lesser->next; // save entry point to rest of linked list
    lesser->next = greater; //lesser is moved infront of greater
    greater->next = temp; //greater points to rest of list
    return lesser;
}

void bubbleSort(struct LinkedNode ** head){

    struct LinkedNode** current;
    int i, j, swapped;

    for (i = 0; i <= length + 1; i++) {

        current = head; //get head to start traversing
        swapped = 0;    //Will check if we had a swapped element
  
        for (j = 0; j < (length + 1) - i - 1; j++) {

            //Classic bubble sort algorithm, highest value floats to the top each iteration
            struct LinkedNode* p1 = *current;
            struct LinkedNode* p2 = p1->next;
    
            //Is the next value greater than the current value? If so then swap
            if (p1->value > p2->value) {
                *current = swap(p1, p2);
                swapped = 1;
            }
            //Move current to next node
            current = &(*current)->next;
        }

        if (swapped == 0){ break; } //No swap -> break

    }

}


//Main
int main(){
    //Head of list
    struct LinkedNode *head = (struct LinkedNode *) malloc(sizeof(struct LinkedNode));;
    head->value = 11;
    head->next = NULL;

    //Values for data in linked list
    int values[length] = {4,3,8,7,10};

    //Make all nodes
    for (int i = 0; i < length; i++){
        makeNewNode(head, values[i]);
    }

    //Print out list
    print(head);

    //Sort list
    bubbleSort(&head);

    //Print sorted list
    printf("After sorting - ");
    print(head);

    return 0;
}