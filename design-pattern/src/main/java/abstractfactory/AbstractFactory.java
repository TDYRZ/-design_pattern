package abstractfactory;
/**
   * �ܵ���װ����
 * @author yrz
 *
 */
public abstract class AbstractFactory {
	//��װ����-----����
	abstract Engine getEngine(String engine);
	//��װ����-----����
	abstract Wheel getWheel(String wheel);
	//��װ����----���
	abstract Shell getShell(String shell);

}
