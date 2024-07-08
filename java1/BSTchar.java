// import javax.xml.crypto.NodeSetData;

public class BSTchar {
	TreeNode root;    // initially NULL
	
	public TreeNode addNode(TreeNode current, char c) {
		// your logic 
		if (current==null)   //  root
			return new TreeNode(c);   // base case
		else if (c<current.data)
			current.left = addNode(current.left, c);
		else if (c>current.data)
			current.right = addNode(current.right, c);
		return current;     // leaf
		
	}
	
	public int countNodes(TreeNode current) {
		// write your logic
		// use current.left to traverse left side 
		// use current.right to traverse right side 
		if (current!=null)
			return 1+countNodes(current.left)+countNodes(current.right);
		return 0;   // it is the leaf node
	}
	
	// call this function to set the value
	public void insert(char c) {
		root = addNode(root, c);
	}
    public int sum(TreeNode current){
        int sum=0;
        if(current!=null)
            return (sum+current.data+sum(current.left)+sum(current.right));
        return sum;
    }
	
	public boolean findNode(TreeNode current, char c) {
		boolean found = false;
		if (current!=null) {
			if (current.data==c)
				return true;
			else if (c<current.data)
				found = findNode(current.left, c);
			else if (c>current.data) 
				found = findNode(current.right, c);
		}
		return found;
	}
    public int countLeaves(TreeNode current) {

		// if the node has a right child
		if (current.right!=null && current.left==null)
			return countLeaves(current.right);
		
		// if the node has a left child
		else if (current.right==null && current.left!=null)
			return countLeaves(current.left);
		
		// if the node has no children (this is the leaf node)
		else if (current.right==null && current.left==null)
			return 1;
		
		// if the node has exactly two children
		return countLeaves(current.left)+countLeaves(current.right);
	}
	public void traversalInOrder(TreeNode current)
    {
        if(current != null)
        {
            traversalInOrder(current.left);
            System.out.println(current.data);
            traversalInOrder(current.right);
        }
    }

    public void traversalPreOrder(TreeNode current)
    {
        if(current != null)
        {
            System.out.println(current.data);
            traversalInOrder(current.left);
            traversalInOrder(current.right);
        }
    }

    public void traversalPostOrder(TreeNode current)
    {
        if(current != null)
        {

            traversalInOrder(current.left);
            traversalInOrder(current.right);
            System.out.println(current.data);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BSTchar bst = new BSTchar();
		bst.insert('C');
		bst.insert('B');
		bst.insert('D');
		
		// System.out.println(bst.countNodes(bst.root));
        // System.out.println(bst.sum(bst.root));
        // System.out.println(bst.findNode(bst.root,8));
        // System.out.println(bst.countLeaves(bst.root));
		bst.traversalPostOrder(bst.root);
		bst.traversalInOrder(bst.root);
		bst.traversalPreOrder(bst.root);
		
	}

}

class TreeNode {
	char data;
	TreeNode left;
	TreeNode right;
	
	TreeNode(char data) {
		this.data=data;
		this.left=this.right=null;
	}
}