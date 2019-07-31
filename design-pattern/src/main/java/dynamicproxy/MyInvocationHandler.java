package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * jdk��̬������
 * @author yrz
 *
 */
public class MyInvocationHandler implements InvocationHandler{

	private BlogProject blogProject;
	
	public MyInvocationHandler(BlogProject blogProject) {
		this.blogProject = blogProject;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("���ô�����");
		if (method.getName().equals("getSqlRecord")) {
			Object object = method.invoke(blogProject, args);
			System.out.println("���ü�¼sql�ķ���");;
			return object;
		}else {
			Object object = method.invoke(blogProject, args);
			System.out.println("���ü�¼������־�ķ���");
			return object;
		}
	}

}
