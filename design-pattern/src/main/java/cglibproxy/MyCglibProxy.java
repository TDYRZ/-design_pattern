package cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
/**
 * cglib������
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
		// ������Ҫ����Ķ���
		enhancer.setSuperclass(target.getClass());
		// ���ô�����
		enhancer.setCallback(new MyCglibProxy(target));
		return enhancer.create();
	}
}
