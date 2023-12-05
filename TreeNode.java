import java.util.ArrayList;

public class TreeNode {


  public Object data; // a public Object instance variable called data

  public ArrayList<TreeNode> children;// a public ArrayList<TreeNode> instance variable called children

  //a constructor that takes one Object parameter, data
   public TreeNode(Object data) {
    this.data = data;//set the data class variable equal to the parameter data.
    this.children = new ArrayList<TreeNode>();//set the children class variable equal to a new ArrayList of TreeNodes.
    }


    //addchild() method with parameter TreeNode child
    public void addchild(TreeNode child){
        //use ArrayList‘s .add() method to add child to this TreeNode’s children list.
        this.children.add(child);
    }

    //addChild() method with parameter Object data
    public void addchild(Object childData){
        this.children.add(new TreeNode(childData));
    }

    //removeChild() with TreeNode parameter
    public void removeChild(TreeNode childToRemove){
      //If this node has no children or wrote an if statement that checks whether the current node has no children. Use ArrayList’s .isEmpty() function on this.children 
        if (this.children.isEmpty()) {
           return;//the function would return if above condition is met
        } 
        //added an else if statement that checks whether this.children includes childToRemove
        else if(this.children.contains(childToRemove)){
            removeChild(childToRemove);//the function would remove child from this.children if above condition is met
            return;
        } 
        else {
          //a for loop through each child of this.children.
            for (TreeNode child : this.children) {
            removeChild(childToRemove);   // Each child calls removeChild() with the same argument: childToRemove.
            }
        }
        }
    
    public void removeChild(Object targetData){
       //If this node has no children or wrote an if statement that checks whether the current node has no children. Use ArrayList’s .isEmpty() function on this.children 
      if (this.children.isEmpty()){
          return;//the function would return if above condition is met
        }
        //create a for loop that checks each child in this.children.
        for (TreeNode child : this.children) {
          //For each child, if its data matched the target data
          if (child.data == targetData) {
            removeChild(child);// would use .remove(child) on this.children
            return; // and return.
          }  
        }
        //created a for loop that iterated through each TreeNode child in this.children
        //Note:  This for loop code will only be reached if the for loop above it did not find any matching child data in this.children
        for (TreeNode child : this.children) {
          //have each child instance call .removeChild() with the argument targetData.
            child.removeChild(targetData);
        }
    }



    
  public static void main(String[] args) {
    TreeNode root = new TreeNode("test");// instantiate a TreeNode root with argument of "test"
    System.out.println(root.data);//Print out the value of root‘s data.

    //Add first child below
    root.addchild(15);
    //Print size of root's children
    System.out.println(root.children.size());

    // instantiate a TreeNode root with argument of 30
    TreeNode biggerChild = new TreeNode(30);
    //Add second child below
    biggerChild.addchild(30);
    //Print.size of root's children
    System.out.println(root.children.size());


  }
}