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
        if (this.children.isEmpty()) {
           return;
        } else if(this.children.contains(childToRemove)){
            removeChild(childToRemove);
            return;
        }else {
            for (TreeNode child : this.children) {
            removeChild(childToRemove);    
            }
        }
        }
    
    public void removeChild(Object targetData){
        if (this.children.isEmpty()) {
            return;
        }
        for (TreeNode child : this.children) {
          if (child.data == targetData) {
            removeChild(child);
          }  
        }
        for (TreeNode child : this.children) {
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