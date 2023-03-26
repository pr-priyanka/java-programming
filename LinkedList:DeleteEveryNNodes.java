/*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/



public class Solution {
	
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		//Your code goes here
        	if (M==0)
        {
            return null;
        }
        if (N==0)
        {
            return head;
        }
    
        LinkedListNode<Integer> node=head,delNode=null;
        while(node!=null)
        {
            for (int i=0;i<M-1 && node!=null;i++)
            {
                //System.out.print(node.data+" ");
                node=node.next;
            }
            //System.out.println();
            if (node==null)
            {
                break;
            }
            
            delNode=node.next;         
            for (int i=0;i<N && delNode!=null;i++)
            {
                //System.out.print(delNode.data+" ");
                delNode=delNode.next;
            }
            node.next=delNode;
            node=delNode;
        }
         
        return head;
	}
}
