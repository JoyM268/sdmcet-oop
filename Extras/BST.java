//Implementation of binary search trees

import java.util.Scanner;

public class BST {
    static class Node{
        int data;
        Node left, right;

        Node(int x){
            this.data = x;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args){
        Node root = null;
        int choice, element;
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("\n1.Insert\t2.Display\t3.Exit");
            System.out.print("Enter the choice: ");
            choice = in.nextInt();
            switch(choice){
                case 1 -> {
                    System.out.print("Enter the element to be inserted: ");
                    element = in.nextInt();
                    root = insert(root, element);
                }
                case 2 -> {
                    display(root);
                }
                case 3 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }   
    }

    static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        } else if(data < root.data){
            root.left = insert(root.left, data);
        } else{
            root.right = insert(root.right, data);
        }
        return root;
    }

    static void display(Node root){
        if(root == null){
            return;
        }
        display(root.left);
        System.out.print(root.data + " ");
        display(root.right);
    }
}
