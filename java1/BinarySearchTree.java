// import javax.xml.crypto.NodeSetData;

public class BinarySearchTree {
	TreeNode root;    // initially NULL
	
	public TreeNode addNode(TreeNode current, int data) {
		// your logic 
		if (current==null)   //  root
			return new TreeNode(data);   // base case
		else if (data<current.val)
			current.left = addNode(current.left, data);
		else if (data>current.val)
			current.right = addNode(current.right, data);
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
	public void insert(int data) {
		root = addNode(root, data);
	}
    public int sum(TreeNode current){
        int sum=0;
        if(current!=null)
            return (sum+current.val+sum(current.left)+sum(current.right));
        return sum;
    }
	
	public boolean findNode(TreeNode current, int data) {
		boolean found = false;
		if (current!=null) {
			if (current.val==data)
				return true;
			else if (data<current.val)
				found = findNode(current.left, data);
			else if (data>current.val) 
				found = findNode(current.right, data);
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
            System.out.println(current.val);
            traversalInOrder(current.right);
        }
    }

    public void traversalPreOrder(TreeNode current)
    {
        if(current != null)
        {
            System.out.println(current.val);
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
            System.out.println(current.val);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(8);
		bst.insert(5);
		bst.insert(11);
		
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
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int val) {
		this.val=val;
		this.left=this.right=null;
	}
}