package dynamicproxy;

/**
 * ��־�ӿ�
 * 
 * @author yrz
 *
 */
public interface Journal {
	// ��¼sql
	String getSqlRecord();

	// ��¼������Ϣ
	String getErrorRecord();
}
