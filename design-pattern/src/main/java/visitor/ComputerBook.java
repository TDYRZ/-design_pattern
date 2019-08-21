/** 
 * Project Name:design-pattern 
 * File Name:ComputerBook.java 
 * Package Name:visitor 
 * Date:2019��8��9������10:47:30 
 * Copyright (c) 2019, chenzhou1025@126.com All Rights Reserved. 
 * 
*/  
  
package visitor;  
/** 
 * �������ͼ��
 * ClassName:ComputerBook <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2019��8��9�� ����10:47:30 <br/> 
 * @author   yrz
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public class ComputerBook extends Book {

	public ComputerBook(String bookName, String author, float price) {
		super(bookName, author, price);
	}

	public void accept(Visitor visitor) {
		visitor.visitor(this);
	}

}
 