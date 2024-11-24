package Linkedlist;

public class Linked {
    public class Linkedlist {
        class Node{
            int data;
            Node next;
    
        }
        private Node head;
        private Node tail;
        private Node size;
        
        
    }
    public int addFirst(){}
    public void addLast(int item){
        if(size=0)
        addfirst(item);
        else{
            Node nn=new Node();
            nn.data=item;
            tail.next=nn;
            tail=nn;
            size++;
        }
    }
    public Node getNode(int index){
        Node temp=head;
        for(int i=0;i<index;i++)
        temp=temp.next;
        return temp;

    }

    public void addAtIndex(int index,int item){

    }
    public int getIndex(int k){
        if(k=0 || k>=size)
        return -1;
    }
        else if(k==0)
            index=size-1;
            getLast
        }
        else{
            return getNode(index).data;

    }

public int removeFirst(){
        int rv=head.data;
        if(size==1){
            head=null;
            tail=null;
        }
        else{
            Node temp=head;
            head=head.next;
            temp.next=null;
        }
        size--;
        return rv;
    }
}
public int removeLast(){
    if(size==0)
    return removeFirst();
    else{
        int rv=tail.data;
            Node Sl=getNode(size-2);
            Sl.next=null;
            tail=Sl;
            size--;
            return rv;
    }
    
}

public int removeIndex(int k){
    if(k==0)

}


    public void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        
    }
    
    
    
}
