import java.util.ArrayList;

public class TreeNode {


  public Object data; // a public Object instance variable called data
  public ArrayList<TreeNode> children;// a public ArrayList<TreeNode> instance variable called children

  //a constructor that takes one Object parameter, data
   public TreeNode(Object data) {
    this.data = data;//set the data class variable equal to the parameter data.
    this.children = new ArrayList<TreeNode>();//set the children class variable equal to a new ArrayList of TreeNodes.
    }
  public static void main(String[] args) {
    TreeNode root = new TreeNode("test");// instantiate a TreeNode root with argument of "test"
    System.out.println(root.data);//Print out the value of root‘s data.
  }
}