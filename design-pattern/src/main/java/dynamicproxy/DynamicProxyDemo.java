package dynamicproxy;

import java.lang.reflect.Proxy;

import javax.security.auth.Subject;
/**
 * ������
 * @author yrz
 *
 */
public class DynamicProxyDemo {
	public static void main(String[] args) {
		//��ʵ����
		
		BlogProject blogProject = new BlogProject();
		
		MyInvocationHandler myInvocationHandler = new MyInvocationHandler(blogProject);
		//�������
		Journal journal = (Journal)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Journal.class}, myInvocationHandler);
		
		journal.getSqlRecord();
		
		journal.getErrorRecord();
	}
}
