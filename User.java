package smartHome.ejb;

import java.io.Serializable;

/**
 * 储存用户相关的状态信息，连接信息
 */

public class User implements Serializable {
	private String name;
	private String id;
	private String password;
	private String check; // 客户端提交的校验码，防止连接攻击。具体实现可以根据客户Mac地址经算法生成
	private String clientIP;
	private String clientPort;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return id;
	}
	
	public void setID(String id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}

	public String getClientIP() {
		return clientIP;
	}

	public void setClientIP(String clientIP) {
		this.clientIP = clientIP;
	}

	public String getClientPort() {
		return clientPort;
	}

	public void setClientPort(String clientPort) {
		this.clientPort = clientPort;
	}
}
