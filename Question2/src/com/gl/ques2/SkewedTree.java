package com.gl.ques2;

class SkewedTree
{
	public Node node;
	public Node prevNode = null;
	public Node headNode = null;
	
	
	void flattenBTToSkewed(Node root)
	{
		
		if(root == null)
		{
			return;
		}
		
			flattenBTToSkewed(root.left);
		
		Node rightNode = root.right;
		Node leftNode = root.left;
	
		if(headNode == null)
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
	
		
			flattenBTToSkewed(rightNode);
		
	}
	void traverseRightSkewed(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);	
	}
}
