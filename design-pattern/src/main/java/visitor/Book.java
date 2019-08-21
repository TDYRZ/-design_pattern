/** 
 * Project Name:design-pattern 
 * File Name:Book.java 
 * Package Name:visitor 
 * Date:2019年8月9日上午10:43:31 
 * Copyright (c) 2019, chenzhou1025@126.com All Rights Reserved. 
 * 
*/  
  
package visitor;  
/** 
 * ClassName:Book <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2019年8月9日 上午10:43:31 <br/> 
 * @author   yrz
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public abstract class Book implements Acceptable{
	private String bookName;//书名
	
	private String Author;//作者
	
	private float price;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Book(String bookName, String author, float price) {
		super();
		this.bookName = bookName;
		Author = author;
		this.price = price;
	}
	
	
}
 