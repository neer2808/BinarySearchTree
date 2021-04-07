public class BinarySearchTreeByLinkedListMain {
  public static void main(String[] args) {

    Node rootnode = new Node(40);
    Node n1 = new Node(20);
    Node n2 = new Node(60);
    Node n3 = new Node(30);
  //  Node n4 = new Node(10);
  //  Node n5 = new Node(70);
   // Node n6 = new Node(50);
   // Node n7 = new Node(45);


    BinarySearchTreeByLinkedList.insert(null,rootnode);
    BinarySearchTreeByLinkedList.insert(rootnode,n1);
    BinarySearchTreeByLinkedList.insert(rootnode,n2);
    BinarySearchTreeByLinkedList.insert(rootnode,n3);
   // BinarySearchTreeByLinkedList.insert(rootnode,n4);
//    BinarySearchTreeByLinkedList.insert(rootnode,n5);
//    BinarySearchTreeByLinkedList.insert(rootnode,n6);
//    BinarySearchTreeByLinkedList.insert(rootnode,n7);

    BinarySearchTreeByLinkedList.preorder(rootnode);
    Node result= BinarySearchTreeByLinkedList.getSuccessor(rootnode);
    System.out.println("successor of root node is = ");
    System.out.println(result.data);
    Node result1= BinarySearchTreeByLinkedList.getPredecessor(rootnode);
    System.out.println("predecessor of root node is = ");
    System.out.println(result1.data);

    Node result3 = BinarySearchTreeByLinkedList.delete(rootnode, 40);
    System.out.println("++++++++++++++++++");
    BinarySearchTreeByLinkedList.preorder(rootnode);
  }
}
