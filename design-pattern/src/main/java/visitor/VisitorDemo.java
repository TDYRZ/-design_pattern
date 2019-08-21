/** 
 * Project Name:design-pattern 
 * File Name:VisitorDemo.java 
 * Package Name:visitor 
 * Date:2019��8��9������10:58:47 
 * Copyright (c) 2019, chenzhou1025@126.com All Rights Reserved. 
 * 
*/  
  
package visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 
 * ClassName:VisitorDemo <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2019��8��9�� ����10:58:47 <br/> 
 * @author   yrz
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public class VisitorDemo {
	public static void main(String[] args) {
//		ComputerBook computerBook = new ComputerBook("java���˼��", "java֮��",new Float(36.8));
//		
//		Visitor visitor=new ShopVisitor();
//		
//		visitor.Visitor(computerBook);
	
		
		//�ӵ����ﳵ
		List<Book>  bookList = Arrays.asList(
				new ComputerBook("java���˼��", "java֮��",new Float(36.8)),
				new HistoryBook("������Щ��", "MC",new Float(25.8)),
				new HumanityBook("������ɢ�ļ�", "������",new Float(68))
				);
		//ʵ����������
		Visitor visitor=new ShopVisitor();
		
		//���ܷ�����
		for (Book object : bookList) {
			 object.accept(visitor);
		}
		 
	}
}
 