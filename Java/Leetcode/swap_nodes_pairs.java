class Solution {
public ListNode swapPairs(ListNode head) {
	//edge cases 1
    ListNode p = head;
    if(p == null) return p;
	
    //edge case 2
    ListNode ns = head.next;
    if(ns == null) return p;
    
    while(true){
        ListNode q = p.next;
        ListNode temp = q.next;
        q.next = p;
        
        if(temp == null){
            p.next = null;
            break;
        }else if(temp.next == null){
            p.next = temp;
            temp.next = null;
            break;
        }
        
        p.next = temp.next;
        p = temp;
    }
    return ns;
}
}
