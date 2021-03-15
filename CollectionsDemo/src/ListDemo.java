import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.ibm.Book;

public class ListDemo {
	public static void main(String[] args) {
		bookList();
		// demo();

	}

	public static void bookList() {
		List<Book> books = new ArrayList<Book>();

		Book book1 = new Book("learn java");
		//Here we are using f to indicate the float value 
		book1.setPrice(100.0f);
		book1.setPublishYear(1990);
		books.add(book1);
		Book book2 = new Book("teach java");
		book2.setPrice(20.0f);
		book2.setPublishYear(1995);
		books.add(book2);
		
		System.out.println(books);

		// Passing Custom object as Parameter
		// books.add(new Book("learn Java"));
		// books.add(new Book("learn JavaScript"));

		// books.remove(1);
		// System.out.println(books);

//		Creating object of the iterator
//		Iterator <Book> it = books.iterator();
//		while (it.hasNext()) {
//			Book book = it.next();
//			
//			//Condition to filter book starting with "learn"
//			if(book.getTitle().contains("learn")) {
//				System.out.println(book);
//			}
//			
//		}

		// Sorting using Comparator in ascending order of the price
		//Only one comparator can be used in the sort method
		books.sort(new Comparator<Book>() {
			
			
			//Here we decide the condition of sorting
			@Override
			public int compare(Book book1, Book book2) {
				return (int)(book1.getPrice() - book2.getPrice());
			}

		});
		System.out.println("after sorting="+books);
	}

	public static void demo() {
		List<Integer> list = new ArrayList<Integer>();// Generics
		// Adding
		list.add(1);
		list.add(3);
		// list.add("Book");

		System.out.println("Before : " + list);
		// Removing
		// list.remove(1);

		System.out.println(list.contains(1));
		System.out.println("After : " + list);

		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}

	}

}
