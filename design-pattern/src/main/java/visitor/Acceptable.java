/** 
 * Project Name:design-pattern 
 * File Name:Acceptable.java 
 * Package Name:visitor 
 * Date:2019��8��9������11:27:31 
 * Copyright (c) 2019, chenzhou1025@126.com All Rights Reserved. 
 * 
*/  
  
package visitor;  
/** 
 * ClassName:Acceptable <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2019��8��9�� ����11:27:31 <br/> 
 * @author   yrz
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public interface Acceptable {
		// �������ܰݷ���
	    public void accept(Visitor visitor);
}
 