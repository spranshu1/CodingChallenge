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
 * @date Oct 17, 2019
 */
package com.programs.challenges.hackerrank.heightoftree;

import java.util.HashSet;
import java.util.Set;

import com.programs.challenges.tree.TreeNode;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int height(TreeNode root) {
		if (root == null) {
			return 0;
		}
		Set<Integer> dataMap = new HashSet<>();
		return height(root, dataMap) - 1;

	}

	public static int height(TreeNode treeNode, Set<Integer> set) {
		if (treeNode == null)
			return set.size();

		int left = 0, right = 0, curr = 0;

		if (set.contains(treeNode.data)) {
			return set.size();
		} else {
			set.add(treeNode.data);
			return Math.max(height(treeNode.left, new HashSet<Integer>(set)), height(treeNode.right, new HashSet<Integer>(set)));
		}
	}

}
