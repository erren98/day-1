package com.ibm.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String, String> accounts = new TreeMap<String, String>();
		//Here -2 and -1 are not int but are Strings
		accounts.put("-2", "account2");
		accounts.put("-1", "account1");
		
		System.out.println(accounts);
	}

}
