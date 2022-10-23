package org.example;

/**
 *  Class Container
 */
public class List {
    /**
     * Making a container with a doubly linked list.
     */
    private El phead;
    private El tail;


    /**
     * The function of adding an element to the container.
     * Parameter (new_val) - element to add.
     */
    public void add(int new_val) {
        if(this.phead==null){
            this.phead=new El(new_val);
            this.tail=this.phead;
        }
        else{
            this.tail.next=new El(new_val,this.tail,null);
            this.tail=this.tail.next;
        }
    }

    
    /**
     * * Method for getting the element value.
     * Printing a list of all the element.
     */
    public void print() {
        El cur=this.phead;
        while(cur!=null){
            System.out.print(cur.val);
            System.out.print(" ");
            cur=cur.next;
        }
    }

    /**
     * Method for getting the element value.
     * Parameter (search) - index of the element whose value we want to get.
     * Return node of the element with the given index.
     */
    public int get(int search){
        int i=0;
        int result=-1;
        El cur =this.phead;
        while (i<search && cur !=null){
            cur=cur.next;
            i++;
        }
        if(i!=search || cur ==null ){
            System.out.print("Dynamic memory error!");
        }
        else{
            result=cur.val;
        }
        return result;
    }
    /**
     * *Method of deleting an element.
     * Parameter (value) - index of the item we want to delete.
     * Return the result as a string.
     */
    public String remove(int val){
        int i=0;
        El cur=this.phead;
        while(i<val && cur!=null ) {
            i++;
            cur=cur.next;
        }
        if(cur!=null && i == val) {
            if(i!=0){
                cur.prev.next=cur.next;
                if(cur.next!=null){
                    cur.next.prev=cur.prev;
                }
            }
            else{
                this.phead=this.phead.next;
                this.phead.prev=null;
            }
            cur.next=null;
            cur.prev=null;
            cur=null;
            return "Item removed";
        }
        else{
            return "Element not found";
        }
    }

}