package abstractfactory;
/**
   * 总的组装工厂
 * @author yrz
 *
 */
public abstract class AbstractFactory {
	//组装所需-----引擎
	abstract Engine getEngine(String engine);
	//组装所需-----轮子
	abstract Wheel getWheel(String wheel);
	//组装所需----外壳
	abstract Shell getShell(String shell);

}
