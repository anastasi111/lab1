package org.example;

public class El {
    int val;
    El prev;
    El next;
    public El(int new_val,El prev,El next){
        this.next=next;
        this.prev=prev;
        this.val=new_val;
    }
    public El(int new_val){
        this.next=null;
        this.prev=null;
        this.val=new_val;
    }
    public El get_prev(){return prev;};
    public El get_next(){return next;};
    public int get_val(){return val;};
}