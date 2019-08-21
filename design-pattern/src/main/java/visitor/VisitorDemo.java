/** 
 * Project Name:design-pattern 
 * File Name:VisitorDemo.java 
 * Package Name:visitor 
 * Date:2019年8月9日上午10:58:47 
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
 * Date:     2019年8月9日 上午10:58:47 <br/> 
 * @author   yrz
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public class VisitorDemo {
	public static void main(String[] args) {
//		ComputerBook computerBook = new ComputerBook("java编程思想", "java之父",new Float(36.8));
//		
//		Visitor visitor=new ShopVisitor();
//		
//		visitor.Visitor(computerBook);
	
		
		//加到购物车
		List<Book>  bookList = Arrays.asList(
				new ComputerBook("java编程思想", "java之父",new Float(36.8)),
				new HistoryBook("明朝那些事", "MC",new Float(25.8)),
				new HumanityBook("朱自清散文集", "朱自清",new Float(68))
				);
		//实例化访问者
		Visitor visitor=new ShopVisitor();
		
		//接受访问者
		for (Book object : bookList) {
			 object.accept(visitor);
		}
		 
	}
}
 