package P13;

public class binaryTree09 {
    node09 root;

    public binaryTree09() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new node09(data);
        } else {
            node09 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left == null) {
                        current.left = new node09(data);
                        break;
                    } else {
                        current = current.left;
                    }
                } else if (data > current.data) {
                    if (current.right == null) {
                        current.right = new node09(data);
                        break;
                    } else {
                        current = current.right;
                    }
                } else {
                    // If the data is already in the tree, do nothing
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean result = false;
        node09 current = root;
        while (current != null) {
            if (current.data == data) {
                result = true;
                break;
            } else if (data < current.data) { // Corrected this line
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    void traversePreOrder(node09 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(node09 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(node09 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    node09 getSuccessor(node09 del) {
        node09 successor = del.right;
        node09 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        // find node(current) that will be deleted
        node09 parent = root;
        node09 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        // deletion
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            // if there is no child, simply delete it
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;

                    }
                }
            } else if (current.left == null) {// if there is 1 child (right)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {// if ther is 1 child (left)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {// if there is 2 childs
                node09 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;

                    }
                    successor.left = current.left;
                }
            }
        }
    }

    // tugas 1
    node09 addRecursive(node09 current, int data) {
        if (current == null) {
            return new node09(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }

        return current;
    }

    // tugas 2
    void displayMinMax() {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        node09 current = root;
        int min = current.data;
        int max = current.data;
        while (current != null) {
            if (current.data < min) {
                min = current.data;
            } else if (current.data > max) {
                max = current.data;
            }
            current = current.right;
        }
        System.out.println("Nilai Terkecil: " + min);
        System.out.println("Nilai terbesar: " + max);
    }

    void leaf(node09 current) {
        if (current == null) {
            return;
        }

        if (current.left == null && current.right == null) {
            System.out.print(current.data + " ");
        }

        leaf(current.left);
        leaf(current.right);
    }

    int getLeafCount(node09 current) {
        int count = 0;
        if (current == null) {
            return 0;
        }

        if (current.left == null && current.right == null) {
            return 1;
        }

        count += getLeafCount(current.left);
        count += getLeafCount(current.right);
        return count;
    }
}
