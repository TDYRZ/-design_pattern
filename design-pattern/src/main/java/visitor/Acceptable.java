/** 
 * Project Name:design-pattern 
 * File Name:Acceptable.java 
 * Package Name:visitor 
 * Date:2019年8月9日上午11:27:31 
 * Copyright (c) 2019, chenzhou1025@126.com All Rights Reserved. 
 * 
*/  
  
package visitor;  
/** 
 * ClassName:Acceptable <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2019年8月9日 上午11:27:31 <br/> 
 * @author   yrz
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public interface Acceptable {
		// 主动接受拜访者
	    public void accept(Visitor visitor);
}
 