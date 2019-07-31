package staticproxy;

/**
 * 孙悟空假扮
 * 
 * @author yrz
 *
 */
public class SunWuKong implements Appearance {
	private GaoCuilan gaoCuilan;

	public void show() {
		System.out.println("首先----孙悟空开始准备");
		if (gaoCuilan == null) {
			gaoCuilan = new GaoCuilan();
		}
		gaoCuilan.show();
		System.out.println("结束----孙悟空变换成功");
	}

}
