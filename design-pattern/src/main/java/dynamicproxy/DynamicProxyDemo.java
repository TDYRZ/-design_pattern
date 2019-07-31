package dynamicproxy;

import java.lang.reflect.Proxy;

import javax.security.auth.Subject;
/**
 * 测试类
 * @author yrz
 *
 */
public class DynamicProxyDemo {
	public static void main(String[] args) {
		//真实对象
		
		BlogProject blogProject = new BlogProject();
		
		MyInvocationHandler myInvocationHandler = new MyInvocationHandler(blogProject);
		//代理对象
		Journal journal = (Journal)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Journal.class}, myInvocationHandler);
		
		journal.getSqlRecord();
		
		journal.getErrorRecord();
	}
}
