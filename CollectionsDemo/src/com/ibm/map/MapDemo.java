package com.ibm.map;

import java.util.HashMap;
import java.util.Map;

import com.ibm.Book;

public class MapDemo {
	public static void main(String[] args) {
		createMapofBooks();
	}

	private static void createMapofBooks() {
		Map<String, Book> books = new HashMap<String, Book>();
		
		System.out.println(books.size());
		for(int i=0;i<5;i++) {
			Book book = new Book("java "+i);
			books.put("book "+i, book);
				
		}
		//Clearing all the elements
		//books.clear();
		
		//Removing particular key value pair
		//books.remove("java 4");
		
		//Contains key and Contains value
		System.out.println(books.containsKey("book 3"));

		System.out.println(books.size());//Entry = key+value
	}
	
	
	
	

}
