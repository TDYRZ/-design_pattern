package cglibproxy;
/**
 * ������
 * @author yrz
 *
 */
public class CglibProxyDemo {
	public static void main(String[] args) {
		  // ���� Cglib ������
		Teacher teacher = (Teacher)MyCglibProxy.getProxy(new Teacher());
		  // ������ط���
		teacher.eat();
	}
}
