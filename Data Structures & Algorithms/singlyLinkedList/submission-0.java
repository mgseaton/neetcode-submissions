class LinkedList {

    private ListNode head; 

    public LinkedList() {
        this.head = new ListNode(null); 
    }

    public int get(int index) {
        int currIndex = 0; 
        ListNode currNode = this.head.getNext(); 
        while (currNode != null) {
            if (currIndex == index) return currNode.getVal(); 
            currNode = currNode.getNext(); 
            currIndex++; 
        }
        return -1; 
    }

    public void insertHead(int val) {
        ListNode currHead = this.head.getNext(); 
        ListNode newHead = new ListNode(val); 
        newHead.setNext(currHead); 
        this.head.setNext(newHead); 
    }

    public void insertTail(int val) {
        ListNode currNode = this.head; 
        while (currNode.hasNext()) {
            currNode = currNode.getNext(); 
        }
        currNode.next = new ListNode(val); 
    }

    public boolean remove(int index) {
        int currIndex = 0; 
        ListNode prevNode = this.head, currNode = this.head.getNext(); 
        while (currNode != null) {
            if (currIndex == index) {
                prevNode.setNext(currNode.getNext()); 
                return true; 
            }
            prevNode = prevNode.getNext(); 
            currNode = currNode.getNext(); 
            currIndex++; 
        }
        return false; 
    }

    public int[] getValues() {
        List<Integer> list = new ArrayList<>(); 
        ListNode currNode = this.head.getNext(); 
        while (currNode != null) {
            list.add(currNode.getVal()); 
            currNode = currNode.getNext(); 
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

class ListNode {

    private ListNode next; 
    private Integer val; 

    public ListNode(Integer val) {
        this.val = val; 
    }

    public void setNext(ListNode next) {
        this.next = next; 
    }

    public boolean hasNext() {
        return this.next != null; 
    }

    public int getVal() {
        return this.val; 
    }

    public ListNode getNext() {
        return this.next; 
    }

}