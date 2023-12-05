public class Tree {

    //fields or Instance variable;
    public TreeNode root;

    //Constructor
    public Tree(TreeNode root){
        this.root = root;
    }
  
    public void print(){
        print(this.root,0);
    }


    public void print(TreeNode current, int level){
        String levelMarks = "";
        for(int i = 0; i < level; i++ ){
            levelMarks += "-- ";
        }
        System.out.println(levelMarks + current.data);
        for (TreeNode child : current.children) {
            print(child, level + 1);
        }
    }

    public static void main(String[] args) {
        TreeNode treeRoot = new TreeNode("S");
        TreeNode child1 = new TreeNode("N");
        TreeNode child2 = new TreeNode("O");
        TreeNode grandchild1 = new TreeNode("W");
        TreeNode grandchild2 = new TreeNode("Y");
        treeRoot.addchild(child1);
        treeRoot.addchild(child2);
        child1.addchild(grandchild1);
        child2.addchild(grandchild2);

        Tree letters = new Tree(treeRoot);
        letters.print();
    }
}
