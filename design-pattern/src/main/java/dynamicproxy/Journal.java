package dynamicproxy;

/**
 * 日志接口
 * 
 * @author yrz
 *
 */
public interface Journal {
	// 记录sql
	String getSqlRecord();

	// 记录错误信息
	String getErrorRecord();
}
