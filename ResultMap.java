package smartHome.ejb;

import java.util.HashMap;

/**
 * 返回结果都将储存在一个Map结构中。
 */
public class ResultMap {
	
	private String status; // 返回的结果状态：success，fail，overtime，error
	private String description; // 返回结果的描述，若fail描述失败原因
	private HashMap<String, Object> resultData;// 返回的数据HashMap，主要用于返回查询结果
	
	
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
