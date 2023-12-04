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

    //addchild() method with parameter Object data
    public void addchild(Object childData){
        this.children.add(new TreeNode(childData));
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