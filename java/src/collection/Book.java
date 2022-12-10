package collection;

import java.util.HashSet;

public class Book 
{
	int bookid;
	String book;
	String author;
		
	Book(int bookid,String book,String author)
	{
		this.bookid=bookid;
		this.book=book;
		this.author=author;
	}
	
	public String toString()
	{
		return bookid+" "+book+" "+author;
	}
	public static void main(String arg[])
	{
	/*	HashSet<Book>b=new HashSet<Book>();
		b.add(new Book(1,"Book--Ramayan","Author--Valmiki"));
		b.add(new Book(2,"Book--Srimad Bhagavad Gita","Author--Maharshi veda"));
		b.add(new Book(3,"Book--Mahabharat","Author--Vedvyas"));
		b.add(new Book(4,"Book--Ramcharit Manas","Author--Tulsidas"));
		b.add(new Book(5,"Book--Rigveda","Author-- Vyasa"));
		b.add(new Book(6,"Book--Bharat Ke Pavitra Teerthsthal","Author--Narayan Bhakth"));  */
		
		HashSet<Book>b=new HashSet<Book>();
		b.add(new Book(1,"Book--Ramayan","Author--Valmiki"));
		b.add(new Book(2,"Book--Srimad Bhagavad Gita","Author--Maharshi veda"));
		b.add(new Book(3,"Book--Mahabharat","Author--Vedvyas"));
		
		b.add(new Book(4,"Book--Ramcharit Manas","Author--Tulsidas"));

		b.add(new Book(5,"Book--Rigveda","Author-- Vyasa"));
		b.add(new Book(6,"Book--Bharat Ke Pavitra Teerthsthal","Author--Narayan Bhakth"));
		
		System.out.println(b);
		for(Book p:b)
		{
			System.out.println(p);
		}
		
	}

}
