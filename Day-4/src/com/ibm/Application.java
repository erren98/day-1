package com.ibm;


class Book{
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws MyException,Exception {
		if(title == null) {
			
			throw new MyException("title is null");
		}
		this.title = title;
	}
	
	//Pratical use of Method overiding
	//Overiding toString() method so as to change the behaviour of that method
	//So when we print the book object name, it shows the title of book , not the hashcode
	@Override
	public String toString() {
		return this.title;
	}
	
}

public class Application {
	public static void main(String[] args) {
		Book book = new Book();
		//Adding try catch block to handle the exception
		try {
			book.setTitle(null);
		}
		//More specific exception or the subclass of the exception calss should be mentioned first
		//To avoid the exception
		catch(IllegalArgumentException argumentException) {
			argumentException.printStackTrace();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		//Finally Block
		finally {
			System.out.println("always...");
		}
		
		//book.setTitle(null);
		//Here we are overiding the toString method explicitly
		System.out.println(book.toString());
		
		Book book1 = new Book();
		
		//Here we are overiding the toString method implicitly
		try {
			book1.setTitle("Leaning Javascript");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(book1);
		
	}

}


