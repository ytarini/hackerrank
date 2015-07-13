/*
  https://www.hackerrank.com/challenges/reverse-a-linked-list	

  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* Reverse(Node *head)
{
    Node *temp, *tail, *newhead;
    tail = head;
    while(tail -> next != NULL)
    {
        tail = tail -> next;
    }
    newhead = tail;
    while(tail != head)
    {
        temp = head;
        while(temp -> next != tail)
        {
            temp = temp -> next;
        }
        tail -> next = temp;
        tail = temp;
    }
    tail -> next = NULL;
    return newhead;
}