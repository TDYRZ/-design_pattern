package staticproxy;

/**
 * ����ռٰ�
 * 
 * @author yrz
 *
 */
public class SunWuKong implements Appearance {
	private GaoCuilan gaoCuilan;

	public void show() {
		System.out.println("����----����տ�ʼ׼��");
		if (gaoCuilan == null) {
			gaoCuilan = new GaoCuilan();
		}
		gaoCuilan.show();
		System.out.println("����----����ձ任�ɹ�");
	}

}
