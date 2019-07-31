package cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
/**
 * cglib代理类
 * @author yrz
 *
 */
public class MyCglibProxy implements MethodInterceptor {
	private Object target;

	public MyCglibProxy(Object target) {
		this.target = target;
	}

	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("###   before invocation");
		Object object = method.invoke(target, args);
		System.out.println("###   end invocation");
		return object;
	}

	public static Object getProxy(Object target) {
		Enhancer enhancer = new Enhancer();
		// 设置需要代理的对象
		enhancer.setSuperclass(target.getClass());
		// 设置代理人
		enhancer.setCallback(new MyCglibProxy(target));
		return enhancer.create();
	}
}
