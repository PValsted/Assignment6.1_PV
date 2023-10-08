
/**
 * @author Nathan Johnson, Bellarmine University, Patrick Valsted
 *
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree(5);
		DepthFirstSearch aSearch=new DepthFirstSearch();
		aSearch.DFS(root); //the search
		System.out.println("Number of nodes traversed: "+aSearch.numNodes(root)); //uses method to find number of nodes
		System.out.println("Tree height: "+aSearch.treeHeight(root)); //uses method to find height
		
	}//end main

}//end class