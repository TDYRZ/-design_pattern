package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * jdk动态代理类
 * @author yrz
 *
 */
public class MyInvocationHandler implements InvocationHandler{

	private BlogProject blogProject;
	
	public MyInvocationHandler(BlogProject blogProject) {
		this.blogProject = blogProject;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("调用代理类");
		if (method.getName().equals("getSqlRecord")) {
			Object object = method.invoke(blogProject, args);
			System.out.println("调用记录sql的方法");;
			return object;
		}else {
			Object object = method.invoke(blogProject, args);
			System.out.println("调用记录错误日志的方法");
			return object;
		}
	}

}
