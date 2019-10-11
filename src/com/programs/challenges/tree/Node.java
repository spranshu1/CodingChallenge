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
 * @date Oct 11, 2019
 */
package com.programs.challenges.tree;

public class Node {
	
	Node left, right;
	
	private Integer data,level;
	
	Node(int data){
		this.data = data;
	}
	
	public void set(int data) {
		if(this.data == null) {
			this.data = data;
		}
		
		if(this.data >= data) {
			if(left == null) {
				left = new Node(data);
			} else {
				left.set(data);
			}
		} else {
			if(right == null) {
				right = new Node(data);
			} else {
				right.set(data);
			}
			
		}
	}
	
	public boolean contains(int data) {
		if(this.data == null) {
			return false;
		}
		if(this.data == data ) {
			return true;
		}
		
		if(this.data >= data) {
			if(left != null) {
				return left.contains(data);
			}
		} else {
			if(right != null) {
				return right.contains(data);
			}
		}
		return false;
	}
	
	public void inOrderTraversal() {
		
	}

}
