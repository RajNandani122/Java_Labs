class Node{
    int val;
    Node next;
}
public class ques2 {
    public static Node create(int i,int n){
        if(i > n){
            return null;
        }
        Node n1 = new Node();
        n1.val = i;

        n1.next = create(i+1, n);
        return n1;
    }
    public static void print(Node temp){
        if(temp == null){
            return;
        }
        System.out.println(temp.val+" ");
        print(temp.next);
    }
    public static int count(Node head,int count){
        if(head == null){
           return count;
        }
        return count(head.next,count+1);
    }
    public static void main(String[] args) {
        Node head = create(1, 6);
        System.out.println(count(head, 0));
    }
    
}
