//Program to implement linked list
import java.util.Scanner;

public class LinkedList {

    static class Node{
        int data;
        Node next;

        Node(int x){
            this.data = x;
            this.next = null;
        }
    }

    public static void main(String[] args) { 
        Node head = null;
        int choice, element;
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("\n1.Insert At Begin\t2.Insert At End\t3.Display\t4.Exit");
            System.out.print("Enter the choice: ");
            choice = in.nextInt();
            switch(choice){
                case 1 -> {
                    System.out.print("Enter the element to be inserted: ");
                    element = in.nextInt();
                    head = insertAtBegin(head, element);
                }
                case 2 -> {
                    System.out.print("Enter the element to be inserted: ");
                    element = in.nextInt();
                    head = insertAtEnd(head, element);
                }
                case 3 -> display(head);
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }

    static Node insertAtBegin(Node head, int x){
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    static Node insertAtEnd(Node head, int x){
        Node temp = new Node(x);
        if(head == null){
            return temp;
        }
        Node cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = temp;
        return head;
    }

    static void display(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }
}
