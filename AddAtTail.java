/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* Insert(Node *head,int data)
{
  // Complete this method
    Node *temp, *last;
    if(head == NULL)
        {
        temp = new Node;
        temp -> data = data;
        temp -> next = NULL;
        head = temp;
        } 
    else
        {
        temp = new Node;
        temp = head;
        while(temp -> next != NULL)
            temp = temp -> next;
        last = new Node;
        last -> data = data;
        temp -> next = last;
        last -> next = NULL;
        }   
    return head;
}