/*
Merge two sorted linked lists 
------------------------------------------
Given two sorted linked lists consisting of N and M nodes respectively. The task is to merge both of the list (in-place) and return head of the merged list.
 
Example 1:
Input:
N = 4, M = 3 
valueN[] = {5,10,15,40}
valueM[] = {2,3,20}
Output: 2 3 5 10 15 20 40
Explanation: After merging the two linked
lists, we have merged list as 2, 3, 5,
10, 15, 20, 40.

Example 2:
Input:
N = 2, M = 2
valueN[] = {1,1}
valueM[] = {2,4}
Output:1 1 2 4
Explanation: After merging the given two
linked list , we have 1, 1, 2, 4 as output.

Your Task:
The task is to complete the function sortedMerge() which takes references to the heads of two linked lists as the arguments and returns the head of merged linked list.

Expected Time Complexity : O(n+m)
Expected Auxilliary Space : O(1)

Constraints:
1 <= N, M <= 104
1 <= Node's data <= 105
*/

class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     if ( head1 == null){
         return head2;
     }
     if ( head2 == null){
         return head1;
     }
     
     if ( head1.data > head2.data){
         Node temp = head1;
         head1 = head2;
         head2 = temp;
     }
     
     Node res = head1;
     while ( head1 != null && head2 != null){
         Node temp = null;
         while ( head1 != null && head1.data <= head2.data){
             temp = head1;
             head1 = head1.next; 
         }
         temp.next = head2;
         temp = head1;
         head1 = head2;
         head2 = temp;
     }
     return res;
   } 
}
