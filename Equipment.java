package smartHome.ejb;

import java.io.Serializable;

/** 
 *    和设备相关的信息
 */

public class Equipment implements Serializable {
	private String mac; // 设备Mac地址
	private String type; // 设备类型
	private String cmd; // 设备的控制命令字，用于设备控制的时候使用
	private String description; // 设备的描述信息
	private String remark; // 设备的标记，必须“标记正确”才能够控制该设备。该标记会在设备添加进入系统后由服务器生成，并且对用户隐藏
	private String homeCode;//设备所在家庭的编号
	
	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getHomeCode() {
		return homeCode;
	}

	public void setHomeCode(String homeCode) {
		this.homeCode = homeCode;
	}

}
