class Solution {
    public static Node reverse(Node head) {
		
        Node curr=head;
            Node prev=null;
            Node temp;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
	}
    public static Node reverse(Node head, int k) {
        // code here
        Node temp=head;
        for(int i=0;i<k-1;i++){
            temp=temp.next;
        }
        Node nxt=temp.next;
        temp.next=null;
        Node rev1=reverse(head);
        Node rev2=reverse(nxt);
        temp=rev1;
        while(temp.next!=null)
        temp=temp.next;
        temp.next=rev2;
        return rev1;
        
    }
}
