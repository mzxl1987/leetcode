package com.leetcode.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Accounts Merge
 * @author Administrator
 *
 */
public class NO_721 {
	public List<List<String>> accountsMerge(List<List<String>> accounts) {
		if(null == accounts) return null;
		if(accounts.size() == 1) return accounts;
		
		Map<String,Node> emailAndAccount = new HashMap<>();
		
		List<Node> nodes = new LinkedList<>();
		
		for(List<String> s: accounts){
			Node node = new Node(s.get(0)); 
			for(int i = 1,maxI = s.size(); i < maxI; i++){
				String email = s.get(i);
				if(emailAndAccount.containsKey(email)) node.getRoot().parent = emailAndAccount.get(email).getRoot();
				else{
					emailAndAccount.put(email, node);
					node.emails.add(email);
				}
			}
			nodes.add(node);
		}
		
		List<List<String>> result = new ArrayList<>();
		
		for(Node node: nodes) if(node != node.parent) node.getRoot().append(node);
		
		for(Node n: nodes){
			if(n == n.parent){
				List<String> item = new LinkedList<>();
				item.add(n.name);
				
				Collections.sort(n.emails);
				item.addAll(n.emails);
				
				result.add(item);
			}
		}
		
		return result;
    }
	
	class Node{
		
		private String name;
		private List<String> emails;
		private Node parent;
		
		public Node(String name){
			this.name = name;
			this.emails = new ArrayList<>();
			this.parent = this;
		}
		
		public Node getRoot(){
			return getRoot(this);
		}
		
		private Node getRoot(Node o){
			if(o.parent == o) return o;
			return getRoot(o.parent);
		}
		
		public void append(Node node){
			this.emails.addAll(node.emails);
		}
	}
}
