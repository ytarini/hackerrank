/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
int GetNode(Node *head,int positionFromTail)
{
    int size = 1;    
    Node *temp;
    temp = new Node;
    temp = head;
    while(temp -> next != NULL)
    {
        size++;
        temp = temp -> next;
    }
    temp = head;
    for(int i = 1; i < size - positionFromTail; i++)
    {
        temp = temp -> next;
    }
    return temp -> data;
    
}