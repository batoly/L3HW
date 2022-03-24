/**
 * Created by Lenovo on 1/23/2022.
 */
public class Node {


    static class LinkedList{
        Node head;
        class Nodee{
            int data;
            Node next;
            Nodee(int f){
                data=f;
                next=null;
            }
        }
        void rotate(int s){
            if (s==0)
                return;
            Node current=head;
            int count=1;
            while (count<s&&current!=null){
                current=current.next;
                count++;
            }
            if (current==null)
                return;
            Node stNode=current;
            while (current.next !=null)
                current=current.next;
            current.next=head;
            head=stNode.next;
            stNode.next=null;
        }
        void push(int new_data){
            Node new_node=new Node(new_data);
            new_node.next=head;
            head=new_node;
        }
        void printList(){
            Node temp=head;
            while (temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            LinkedList list=new LinkedList();
            for (int i = 60; i >=10; i-=10) {
                list.push(i);
                System.out.println("given list");
                list.printList();
                list.rotate(4);
                System.out.println("rotated linked list");
                list.printList();

            }
        }
    }
    private Node next;
    private String data;
    public Node(int new_data) {

    }

}
