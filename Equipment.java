package smartHome.ejb;

import java.io.Serializable;

/** 
 *    ���豸��ص���Ϣ
 */

public class Equipment implements Serializable {
	private String mac; // �豸Mac��ַ
	private String type; // �豸����
	private String cmd; // �豸�Ŀ��������֣������豸���Ƶ�ʱ��ʹ��
	private String description; // �豸��������Ϣ
	private String remark; // �豸�ı�ǣ����롰�����ȷ�����ܹ����Ƹ��豸���ñ�ǻ����豸��ӽ���ϵͳ���ɷ��������ɣ����Ҷ��û�����
	private String homeCode;//�豸���ڼ�ͥ�ı��
	
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
