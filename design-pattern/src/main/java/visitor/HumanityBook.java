/** 
 * Project Name:design-pattern 
 * File Name:HumanityBook.java 
 * Package Name:visitor 
 * Date:2019年8月9日上午10:49:12 
 * Copyright (c) 2019, chenzhou1025@126.com All Rights Reserved. 
 * 
*/  
  
package visitor;  
/** 
 * 人文类图书
 * ClassName:HumanityBook <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2019年8月9日 上午10:49:12 <br/> 
 * @author   yrz
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public class HumanityBook extends Book {

	public HumanityBook(String bookName, String author, float price) {
		super(bookName, author, price);
	}

	public void accept(Visitor visitor) {
		visitor.visitor(this);
	}

}
 