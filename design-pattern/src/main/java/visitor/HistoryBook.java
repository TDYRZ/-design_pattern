/** 
 * Project Name:design-pattern 
 * File Name:HistoryBook.java 
 * Package Name:visitor 
 * Date:2019��8��9������10:50:07 
 * Copyright (c) 2019, chenzhou1025@126.com All Rights Reserved. 
 * 
*/  
  
package visitor;  
/** 
 * ClassName:HistoryBook <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2019��8��9�� ����10:50:07 <br/> 
 * @author   yrz
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public class HistoryBook extends Book {

	public HistoryBook(String bookName, String author, float price) {
		super(bookName, author, price);
	}

	public void accept(Visitor visitor) {
		visitor.visitor(this);
	}

}
 