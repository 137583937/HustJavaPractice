package smartHome.ejb;

import java.util.HashMap;

/**
 * ���ؽ������������һ��Map�ṹ�С�
 */
public class ResultMap {
	
	private String status; // ���صĽ��״̬��success��fail��overtime��error
	private String description; // ���ؽ������������fail����ʧ��ԭ��
	private HashMap<String, Object> resultData;// ���ص�����HashMap����Ҫ���ڷ��ز�ѯ���
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public HashMap<String, Object> getResultData() {
		return resultData;
	}

	public void setResultData(HashMap<String, Object> resultData) {
		this.resultData = resultData;
	}

	

	
	
	
}
