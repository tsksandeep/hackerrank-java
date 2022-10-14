import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;

class Tree {
    private Node head;

    public Node getHead() {
        return head;
    }

    private class Node {
        private int value;
        private Node leftNode;
        private Node rightNode;

        public Node(int value) {
            this.value = value;
        }
    }

    public void Insert(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }

        var current = head;
        while (true) {
            if (value < current.value) {
                if (current.leftNode == null) {
                    current.leftNode = new Node(value);
                    return;
                }
                current = current.leftNode;
            } else {
                if (current.rightNode == null) {
                    current.rightNode = new Node(value);
                    return;
                }
                current = current.rightNode;
            }
        }
    }

    public boolean Find(int value) {
        var current = head;
        while (current != null) {
            if (value == current.value) {
                return true;
            } else if (value < current.value) {
                current = current.leftNode;
            } else {
                current = current.rightNode;
            }
        }
        return false;
    }

    private int successor(Node root) {
        root = root.rightNode;
        while (root.leftNode != null) {
            root = root.leftNode;
        }
        return root.value;
    }

    private int predecessor(Node root) {
        root = root.leftNode;
        while (root.rightNode != null) {
            root = root.rightNode;
        }
        return root.value;
    }

    public Node Delete(Node root, int value) {
        var current = root;
        if (current == null)
            return current;

        if (value > current.value) {
            current.rightNode = Delete(current.rightNode, value);
        } else if (value < current.value) {
            current.leftNode = Delete(current.leftNode, value);
        } else {
            if (current.leftNode == null && current.rightNode == null) {
                current = null;
            } else if (current.rightNode != null) {
                current.value = successor(current);
                current.rightNode = Delete(current.rightNode, current.value);
            } else {
                current.value = predecessor(current);
                current.leftNode = Delete(current.leftNode, current.value);
            }
        }

        return current;
    }

    public void BreadthFirstSearch() {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(head);

        while (true) {
            var node = queue.poll();
            if (node == null) {
                break;
            }

            System.out.println(node.value);

            if (node.leftNode != null) {
                queue.add(node.leftNode);
            }

            if (node.rightNode != null) {
                queue.add(node.rightNode);
            }
        }
    }

    public void traversePreOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.value);
        traversePreOrder(root.leftNode);
        traversePreOrder(root.rightNode);
    }

    public void traversePostOrder(Node root) {
        if (root == null) {
            return;
        }

        traversePostOrder(root.leftNode);
        traversePostOrder(root.rightNode);
        System.out.println(root.value);
    }

    public void traverseInOrder(Node root) {
        if (root == null) {
            return;
        }

        traverseInOrder(root.leftNode);
        System.out.println(root.value);
        traverseInOrder(root.rightNode);
    }

    public int height(Node root) {
        if (root.leftNode == null && root.rightNode == null) {
            return 0;
        }

        return 1 + Math.max(height(root.leftNode), height(root.rightNode))
    }

    public int min(Node root) {
        if (root.leftNode == null && root.rightNode == null) {
            return root.value;
        }

        var left = min(root.leftNode);
        var right = min(root.rightNode);

        return Math.min(Math.min(left, right), root.value)
    }

    public int minBst(Node root) {
        if (root == null) {
            throw new IllegalArgumentException();
        }

        var current = root;
        var last = current;

        while (current.leftNode != null) {
            last = current;
            current = current.leftNode;
        }

        return last.value;
    }
}

public class _46_binary_tree {

    public static void main(String[] args) throws IOException {
        Tree tree = new Tree();
        tree.Insert(10);
        tree.Insert(8);
        tree.Insert(20);
        tree.Insert(22);
        tree.Insert(4);
        tree.Insert(6);
        tree.Delete(tree.getHead(), 22);
        tree.BreadthFirstSearch();
    }
}