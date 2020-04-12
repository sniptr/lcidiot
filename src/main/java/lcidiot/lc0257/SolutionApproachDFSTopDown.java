package main.java.lcidiot.lc0257;

import java.util.ArrayList;
import java.util.List;

import main.java.lcidiot.utils.TreeNode;

public class SolutionApproachDFSTopDown {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        preorder(root, paths, "");
        return paths;
    }
    
    private void preorder(TreeNode node, List<String> paths, String path){
        if(node == null) return;
        
        path += Integer.toString(node.val);
        
        if(node.left == null && node.right == null){
            paths.add(path);
            return;
        }else{
            path += "->";
            preorder(node.left, paths, path);
            preorder(node.right, paths, path);
        }
    }
}