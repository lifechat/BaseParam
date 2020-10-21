/**
    *实现数据增加操作
     * @param vo 表示要执行操作的对象
     * @return 成功返回true，失败返回false
     *  @throws SQLException
    * */
package com.gechuang.bankExcersize;

/**  
*    
* 项目名称：BaseParam   
* 类名称：User   
* 类描述：   
* 创建人：25966   
* 创建时间：2020年10月20日 下午12:21:58   
* @version        
*/
public class User {
   private String cardNo;
   private String identity;
   private String username;
   private String password;
   private String phone;
   private double Banlance;
   /**
 * 
 */
public User() {
	// TODO Auto-generated constructor stub
}



public double getBanlance() {
	return Banlance;
}
public void setBanlance(double banlance) {
	Banlance = banlance;
}
public User(String cardNo, String identity, String username, String password, String phone, double banlance) {
	super();
	this.cardNo = cardNo;
	this.identity = identity;
	this.username = username;
	this.password = password;
	this.phone = phone;
	this.Banlance = banlance;
}
//getter and setter
public String getCardNo() {
	return cardNo;
}
public void setCardNo(String cardNo) {
	this.cardNo = cardNo;
}
public String getIdentity() {
	return identity;
}
public void setIdentity(String identity) {
	this.identity = identity;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}

}
