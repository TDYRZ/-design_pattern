/** 
 * Project Name:design-pattern 
 * File Name:Visitor.java 
 * Package Name:visitor 
 * Date:2019年8月9日上午10:51:34 
 * Copyright (c) 2019, chenzhou1025@126.com All Rights Reserved. 
 * 
*/  
  
package visitor;  
/** 
 * ClassName:Visitor <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2019年8月9日 上午10:51:34 <br/> 
 * @author   yrz
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public interface Visitor {

	void visitor(ComputerBook computerBook);
	
	void visitor(HistoryBook historyBook);
	
	void visitor(HumanityBook humanityBook);
}
 