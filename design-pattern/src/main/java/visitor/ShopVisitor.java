/** 
 * Project Name:design-pattern 
 * File Name:ShopVisitor.java 
 * Package Name:visitor 
 * Date:2019年8月9日上午10:55:46 
 * Copyright (c) 2019, chenzhou1025@126.com All Rights Reserved. 
 * 
*/  
  
package visitor;  
/** 
 * ClassName:ShopVisitor <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2019年8月9日 上午10:55:46 <br/> 
 * @author   yrz
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public class ShopVisitor implements Visitor{

	public void visitor(ComputerBook computerBook) {
		System.out.println("这里是计算机类图书，您挑选的"+computerBook.getAuthor()+"的"+computerBook.getBookName()+"总计"+computerBook.getPrice()+",请下单购买。");
	}

	public void visitor(HistoryBook historyBook) {
		System.out.println("这里是历史类图书，您挑选的"+historyBook.getAuthor()+"的"+historyBook.getBookName()+"总计"+historyBook.getPrice()+",请下单购买。");
	}

	public void visitor(HumanityBook humanityBook) {
		System.out.println("这里是人文类图书，您挑选的"+humanityBook.getAuthor()+"的"+humanityBook.getBookName()+"总计"+humanityBook.getPrice()+",请下单购买。");
	}
	
}
 