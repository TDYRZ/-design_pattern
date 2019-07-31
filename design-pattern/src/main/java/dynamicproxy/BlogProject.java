package dynamicproxy;
/**
 * 真实需要被代理的类
 * @author yrz
 *
 */
public class BlogProject implements Journal{

	public String getSqlRecord() {
		return "查询所有留言记录:select xxx from xxx";
	}

	public String getErrorRecord() {
		return "数组角标越界";
	}

}
