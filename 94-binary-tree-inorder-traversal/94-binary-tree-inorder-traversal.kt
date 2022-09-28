/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    
    val _result: ArrayList<Int> = ArrayList()
    
    fun inorderTraversal(root: TreeNode?): List<Int> {
        if (root != null){
            addValues(root)
        } else {
            return emptyList()
        }
        return _result.toList()
    }
    
    fun addValues(treeNode: TreeNode) {
        if (treeNode.left != null){
            addValues(treeNode.left!!)
        }
        
        _result.add(treeNode.`val`)
        if (treeNode.right != null) {
            addValues(treeNode.right!!)
        }
    }
}