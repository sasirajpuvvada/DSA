//package JulyChallenge;
//
//
//import java.util.*;
//
//  }
//  class Solution {
//    public List<List<Integer>> levelOrderBottom(TreeNode root) {
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        List<List<Integer>> ans = new ArrayList<>();
//        if(root==null){
//            return ans;
//        }
//        queue.add(root);
//        while (true) {
//            List level = new ArrayList();
//            int size = queue.size();
//            if (size==0)
//                break;
//            while (size-->0) {
//                TreeNode temp = queue.peek();
//                level.add(temp.val);
//                queue.remove();
//                if (temp.left!=null) {
//                    queue.add(temp.left);
//                }
//                if (temp.right!=null) {
//                    queue.add(temp.right);
//                }
//            }
//            ans.add(level);
//
//        }
//        Collections.reverse(ans);
//        return ans;
//    }
//}
