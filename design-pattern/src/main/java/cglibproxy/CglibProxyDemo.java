package cglibproxy;
/**
 * 测试类
 * @author yrz
 *
 */
public class CglibProxyDemo {
	public static void main(String[] args) {
		  // 生成 Cglib 代理类
		Teacher teacher = (Teacher)MyCglibProxy.getProxy(new Teacher());
		  // 调用相关方法
		teacher.eat();
	}
}
