package dynamicproxy;
/**
 * ��ʵ��Ҫ���������
 * @author yrz
 *
 */
public class BlogProject implements Journal{

	public String getSqlRecord() {
		return "��ѯ�������Լ�¼:select xxx from xxx";
	}

	public String getErrorRecord() {
		return "����Ǳ�Խ��";
	}

}
