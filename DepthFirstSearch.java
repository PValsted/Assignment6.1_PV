
/**
 * Class containing methods to do a Depth First Search on a tree
 * and find its height and number of nodes
 * @author Patrick Valsted
 *
 */
public class DepthFirstSearch {  

	Node root;
       
	/**
	 * Constructor prints info about how to search
	 */
	public DepthFirstSearch() {               
		System.out.println("Call DFS with root node to do a Depth First Search.");
	}//end constructor
	
    /**
     * Searches the entire tree printing the value of each node as it's traversed
     * @param node that you want to start searching from (usually the root)
     */
	public void DFS(Node node)        {
    	System.out.println(node.getData()); //prints value of node
    	
    	if (node.getlChild()==null && node.getrChild()==null) return; //if the node is a leaf, returns
    	else {
    		this.DFS(node.getlChild()); //recursively traverses to left child
    		this.DFS(node.getrChild()); //recursively traverses to right child
    	}
    }//end DFS
    
    /**
     * Counts the number of nodes in a tree using this method recursively
     * @param root of the tree
     * @return number of nodes in the tree
     */
    public int numNodes(Node root) {
    	if (root==null) return 0; //base case, if the node points to nowhere returns 0
    	else return 1+this.numNodes(root.getlChild())+this.numNodes(root.getrChild()); //adds 1 for the root plus the number of nodes all the way down tree
    }//end numNodes
    
    /**
     * Recursive method that calculates the heights of each branch and returns whichever is higher to give the tree height
     * @param node you want to start at (usually root)
     * @return height of tree
     */
    public int treeHeight(Node node) {
    
    	if (node==null)return 0; //base case, returns 0 if tree is empty
    	
    	int lHeight=treeHeight(node.getlChild()); //recursively calculates depth of left branch
    	int rHeight=treeHeight(node.getrChild()); //recursively calculates depth of right branch
    	
    	return 1+Math.max(lHeight, rHeight); //returns whichever value is higher plus 1 for the root
    	
    }//end treeHeight

}//end class