public class BinaryTreeSum {

    public int getSumOfKeys(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sum = root.val;
        sum += getSumOfKeys(root.left);
        sum += getSumOfKeys(root.right);

        return sum;
    }

    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        BinaryTreeSum binaryTreeSum = new BinaryTreeSum();
        int sum = binaryTreeSum.getSumOfKeys(root);
        System.out.println("Sum of keys: " + sum);
    }
}
