/**
 * These materials are confidential and proprietary to Intellect Design Arena Ltd. and no part of these
 * materials should be reproduced, published, transmitted or distributed in any form or by any means,
 * electronic, mechanical, photocopying, recording or otherwise, or stored in any information storage or
 * retrieval system of any nature nor should the materials be disclosed to third parties or used in any
 * other manner for which this is not authorized, without the prior express written authorization of
 * Intellect Design Arena Ltd.
 *
 * Copyright 2017 Intellect Design Arena Limited. All rights reserved.
 *
 * @author pranshu.shrivastava
 * @date Mar 5, 2020
 */
package com.programs.challenges.hackerrank.lca;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
		TreeNode lca = null;
		WrapperNode LCA = new WrapperNode(lca);
		
		
		if(isNodePresent(root, p) && isNodePresent(root, q)) {
			findLCA(root,LCA,p,q);
			lca = LCA.node;
		}
		
		if(lca == null) {
			System.out.println("Lowest Common Ancistor not found\n");
		} else {
			System.out.println("LCA is :"+lca.data);
		}
		
		return lca;
		
		
		
	}
	
	public static class WrapperNode{
		TreeNode node;
		WrapperNode(TreeNode node){
			this.node = node;
		}
	}
	
	private static boolean findLCA(TreeNode root, WrapperNode lca, TreeNode p, TreeNode q) {
		
		if(root == null) {
			return false;
		}
		
		if(root == p || root == q) {
			lca.node = root;
			return true;
		}
		
		boolean left = findLCA(root.left, lca, p, q);
		boolean right = findLCA(root.right, lca, p, q);
		
		if(left && right) {
			lca.node = root;
		}
		
		return left || right;
		
	}
	
	private static boolean isNodePresent(TreeNode root, TreeNode node) {
		if(root == null) {
			return false;
		}
		
		if(root == node) {
			return true;
		}
		
		return isNodePresent(root.left, node) || isNodePresent(root.right,node);
	}

		
	
	public class TreeNode{
		int data;
		TreeNode left = null;
		TreeNode right = null;
		
		TreeNode(int data){
			this.data = data;
		}
	}

}
