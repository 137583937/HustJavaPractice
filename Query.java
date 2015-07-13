package smartHome.ejb;

import java.io.Serializable;


/**
 * 这是一个查询控制命令字，用于查询设备的历史数据
 */
public class Query implements Serializable {
	private String mac;
	private String dateFrom; // 查询的起止日期
	private String dateTo; // 查询的截至日期
	private String remark;
	private String type;

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	public String getDateTo() {
		return dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
