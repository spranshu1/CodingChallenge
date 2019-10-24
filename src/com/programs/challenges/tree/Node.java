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
	
	public Node left, right;

	public int data;
	
	Node(int data){
		this.data = data;
	}

	public void insert(int value) {
		if(value <= data) {
			if(left == null) {
				left = new Node(value);
			} else {
				left.insert(value);
			}
		} else {
			if(right == null) {
				right = new Node(value);
			} else {
				right.insert(value);
			}
			
		}
	}
	
	public boolean contains(int value) {

		if(this.data == value ) {
			return true;
		}
		
		if(value <= this.data) {
			if(left != null) {
				return left.contains(value);
			}
		} else {
			if(right != null) {
				return right.contains(value);
			}
		}
		return false;
	}
	

	public void printTree(){

	}

}
