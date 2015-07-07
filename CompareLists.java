/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
int CompareLists(Node *headA, Node* headB)
{
    Node *tempA, *tempB;
    tempA = headA;
    tempB = headB;
    while(tempA != NULL && tempB != NULL)
    {
        if(tempA  -> data == tempB -> data)
        {
            tempA = tempA -> next;
            tempB = tempB -> next;
        }
        else
            return 0;
    }
    if(tempA != NULL)
        return 0;
    else if(tempB != NULL)
        return 0;
    else 
        return 1;
}