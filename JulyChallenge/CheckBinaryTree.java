//package JulyChallenge;
// Day 13
//public class CheckBinaryTree {
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//
//        if(p==null || q==null) {
//            if(p==null && q==null)
//                return true;
//            return false;
//        }
//
//        Queue<TreeNode> q1 = new LinkedList<>();
//        Queue<TreeNode> q2 = new LinkedList<>();
//        q1.add(p);
//        q2.add(q);
//        while (q1.size()!=0 && q2.size()!=0) {
//
//            TreeNode temp = q1.poll();
//            TreeNode temp1 = q2.poll();
//            if (temp.val != temp1.val)
//                return false;
//            if (temp.left!=null && temp1.left!=null) {
//                q1.add(temp.left);
//                q2.add(temp1.left);
//            }
//            if (temp.left!=null && temp1.left==null) {
//                return false;
//            }
//            if (temp.left==null && temp1.left!=null) {
//                return false;
//            }
//
//            if (temp.right!=null && temp1.right!=null) {
//                q1.add(temp.right);
//                q2.add(temp1.right);
//            }
//            if (temp.right==null && temp1.right!=null) {
//                return false;
//            }
//            if (temp.right!=null && temp1.right==null) {
//                return false;
//            }
//
//
//        }
//        if(q1.isEmpty() && q2.isEmpty())
//            return true;
//        return false;
//
//
//    }
//}
