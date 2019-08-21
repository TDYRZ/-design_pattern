/** 
 * Project Name:design-pattern 
 * File Name:ShopVisitor.java 
 * Package Name:visitor 
 * Date:2019��8��9������10:55:46 
 * Copyright (c) 2019, chenzhou1025@126.com All Rights Reserved. 
 * 
*/  
  
package visitor;  
/** 
 * ClassName:ShopVisitor <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2019��8��9�� ����10:55:46 <br/> 
 * @author   yrz
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public class ShopVisitor implements Visitor{

	public void visitor(ComputerBook computerBook) {
		System.out.println("�����Ǽ������ͼ�飬����ѡ��"+computerBook.getAuthor()+"��"+computerBook.getBookName()+"�ܼ�"+computerBook.getPrice()+",���µ�����");
	}

	public void visitor(HistoryBook historyBook) {
		System.out.println("��������ʷ��ͼ�飬����ѡ��"+historyBook.getAuthor()+"��"+historyBook.getBookName()+"�ܼ�"+historyBook.getPrice()+",���µ�����");
	}

	public void visitor(HumanityBook humanityBook) {
		System.out.println("������������ͼ�飬����ѡ��"+humanityBook.getAuthor()+"��"+humanityBook.getBookName()+"�ܼ�"+humanityBook.getPrice()+",���µ�����");
	}
	
}
 