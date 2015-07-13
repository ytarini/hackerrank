/*
  Merge two sorted lists A and B as one linked list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* MergeLists(Node *headA, Node* headB)
{
    if(headA == NULL)
        return headB;
    else if(headB == NULL)
        return headA;
    Node *headC, *tempA, *tempB, *tempC, *add;
    tempA = headA;
    tempB = headB;
    tempC = NULL;
    if(tempA != NULL && tempB != NULL)
    {
    if(tempA -> data < tempB -> data)
    {
        add = new Node;
        add -> data = tempA -> data;
        add -> next = NULL;
        tempC = add;
        tempA = tempA -> next;
    }
    else
    {
        add = new Node;
        add -> data = tempB -> data;
        add -> next = NULL;
        tempC = add;
        tempB = tempB -> next;
    }
    headC = tempC;
    }
    while(tempA != NULL && tempB != NULL)
    {
        if(tempA -> data < tempB -> data)
        {
            add = new Node;
            add -> data = tempA -> data;
            add -> next = NULL;
            tempC -> next = add;
            tempC = tempC -> next;
            tempA = tempA -> next;
        }
        else
        {
            add = new Node;
            add -> data = tempB -> data;
            add -> next = NULL;
            tempC -> next = add;
            tempC = tempC -> next;
            tempB = tempB -> next;
        }
    }
    if(tempA != NULL)
    {   
        while(tempA != NULL)
        {
            add = new Node;
            add -> data = tempA -> data;
            add -> next = NULL;
            tempC -> next = add;
            tempC = tempC -> next;
            tempA = tempA -> next;
        }
    }
    else if(tempB != NULL)
    {
        while(tempB != NULL)
        {
            add = new Node;
            add -> data = tempB -> data;
            add -> next = NULL;
            tempC -> next = add;
            tempC = tempC -> next;
            tempB = tempB -> next;
        }
    } 
    return headC;
}