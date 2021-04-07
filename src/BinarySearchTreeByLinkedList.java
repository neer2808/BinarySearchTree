public class BinarySearchTreeByLinkedList {
  public static  Node insert(Node root, Node newnode)
  {
    if(root == null)
    {
      root = newnode;
      return root;
    }
    if(root.data>newnode.data)
    {
      if(root.left == null)
      {
        root.left = newnode;
      }
      else
      {
        insert(root.left, newnode);
      }
    }
    else if(root.data< newnode.data)
    {
        if(root.right == null)
        {
          root.right = newnode;
        }
        else
        {
          insert(root.right, newnode);
        }
    }
    return root;
  }

  public static void preorder(Node root)
  {
    if(root == null)
    {
      return;
    }
    System.out.println(root.data);
    preorder(root.left);
    preorder(root.right);
  }

  public static Node getSuccessor(Node root)
  {
    if(root == null)
    {
      return null;
    }
    Node temp = root.right;
    while(temp.left != null)
    {
      temp = temp.left;
    }
  return temp;
  }
  public static Node getPredecessor(Node root)
  {
    if(root == null)
    {
      return null;
    }
    Node temp = root.left;
    while(temp.right != null)
    {
      temp = temp.right;
    }
    return temp;
  }

  public static Node delete( Node root, int val)
  {
    if(root == null)
    {
      return null;
    }
    if(val< root.data)
    {
      root.left = delete(root.left, val);
    }
    else if( val> root.data)
    {
      root.right = delete (root.right,val);
    }
    else
    {
        if(root.left == null ||root.right == null)
        {
          Node temp;
            temp= root.left== null? root.right: root.left;
            if(temp == null)
            {
              return null;
            }
            else
            {
              return temp;
            }
        }
        else
        {
          Node successor = getSuccessor(root);
          root.data = successor.data;
          root.right= delete(root.right, root.data);
          return root;
        }
    }
    return root;
  }
}
