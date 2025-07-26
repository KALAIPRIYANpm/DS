class Node {
    int data;
    Node right, left;
}

class BST {
    Node root;

    Node insert(Node root, int val) {
        if (root == null) {
            Node newnode = new Node();
            newnode.data = val;
            return newnode;
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right); 
        }
    }
}

public class bst {
    public static void main(String[] args) {
        BST obj = new BST();
        
        obj.root = obj.insert(obj.root, 4);
        obj.root = obj.insert(obj.root, 2);
        obj.root = obj.insert(obj.root, 6);
        obj.root = obj.insert(obj.root, 1);
        obj.root = obj.insert(obj.root, 3);
        
        
        obj.inorder(obj.root);
    }
}
