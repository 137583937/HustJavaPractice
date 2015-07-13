package smartHome.ejb;

import javax.ejb.Remote;

/**
 *    session����һ���Ự״̬���ṩ�ͻ������ӷ���˵ĸ��ַ����ͷ���
 */

@Remote
public interface  Session{
	public String id=null; // ÿ��Session��ӦΨһ��һ��ID
	public User user=null; // ÿ��Session��Ҫ��һ��user

	// �û���Ϣ�Ĳ�ѯ�ӿ�
	public ResultMap getUserInfo(User user) ;

	// �豸��Ϣ�Ĳ�ѯ�ӿ�
	public ResultMap getEquipmentInfo(Equipment equipment) ;

	// �û���Ϣ�����ýӿ�
	public ResultMap setUserInfo(User User) ;

	// �豸��Ϣ���ýӿ�
	public ResultMap setEquipmentInfo(Equipment equipment) ;

	// �豸���ƵĽӿڣ�������ƿյ�
	public ResultMap setEquipment(Equipment equipment);

	// �豸���ݻ�ȡ�Ľӿڣ������ѯ�¶ȼƶ���
	public ResultMap getEquipment(Equipment equipment) ;

	// ��ʷ���ݵĲ�ѯ�ӿ�
	public ResultMap getHistoryData(Query query);

	// ��ѯ�û���Ϣ�б�Ľӿ�
	public ResultMap getMessage(User user) ;

	public String getId() ;

	public void setId(String id) ;

	public User getUser() ;

	public void setUser(User user) ;

	// �˳�����ӿ�
	public boolean quit() ;
}
