import java.io.*;
import java.util.*;


public class MyLinkedList {
    Node head;
    //int a;

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
            if(temp!=null){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public boolean search(char ele){
        boolean flag=false;
        Node temp=head;
        while(temp!=null){
            if(temp.data==ele){
                flag=true;
            }
            temp=temp.next;
        }
        return flag;

    }




    public void add(char data) {

        Node n = new Node(data);
        if (head == null) {
            head = n;
        } else {
            n.next = head;
            head=n;

        }
        // a++;
    }
    public static void main(String[] args) {
        int cas,c1=0,c2=0;

        boolean res1,res2;
        Scanner sc=new Scanner(System.in);
        cas=sc.nextInt();
        int[] no=new int[cas];
        for(int i=0;i<cas;i++){
            no[i]=sc.nextInt();
        }
        sc.nextLine();

        MyLinkedList ravi=new MyLinkedList();
        MyLinkedList sashi=new MyLinkedList();
        for (int i = 0; i <cas; i++) {
            ravi.head=null;
            sashi.head=null;
            int a = 0;
            c1 = 0;
            c2 = 0;
            //System.out.println("hello");
            String str = sc.nextLine();
            // System.out.println(str);
            for (int j = 0; j < str.length(); j++) {
                res1 = ravi.search(str.charAt(j));
                res2 = sashi.search(str.charAt(j));
                if (res1 == false && res2 == false) {
                    if (a % 2 == 0) {
                        ravi.add(str.charAt(j));
                        a++;
                        c1++;
                        if (c1 == no[i])
                            break;
                    } else {
                        sashi.add(str.charAt(j));
                        a++;
                        c2++;
                        if (c2 == no[i])
                            break;
                    }
                }
            }
            ravi.display();
            sashi.display();
        }


    }
}
