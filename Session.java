package smartHome.ejb;

import javax.ejb.Remote;

/**
 *    session代表一个会话状态，提供客户端连接服务端的各种方法和返回
 */

@Remote
public interface  Session{
	public String id=null; // 每个Session对应唯一的一个ID
	public User user=null; // 每个Session需要绑定一个user

	// 用户信息的查询接口
	public ResultMap getUserInfo(User user) ;

	// 设备信息的查询接口
	public ResultMap getEquipmentInfo(Equipment equipment) ;

	// 用户信息的设置接口
	public ResultMap setUserInfo(User User) ;

	// 设备信息设置接口
	public ResultMap setEquipmentInfo(Equipment equipment) ;

	// 设备控制的接口，比如控制空调
	public ResultMap setEquipment(Equipment equipment);

	// 设备数据获取的接口，比如查询温度计度数
	public ResultMap getEquipment(Equipment equipment) ;

	// 历史数据的查询接口
	public ResultMap getHistoryData(Query query);

	// 查询用户消息列表的接口
	public ResultMap getMessage(User user) ;

	public String getId() ;

	public void setId(String id) ;

	public User getUser() ;

	public void setUser(User user) ;

	// 退出程序接口
	public boolean quit() ;
}
