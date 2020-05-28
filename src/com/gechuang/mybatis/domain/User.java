package com.gechuang.mybatis.domain;

/**
    *实现数据增加操作
     * @param vo 表示要执行操作的对象
     * @return 成功返回true，失败返回false
     *  @throws SQLException
    * */
import java.sql.Date;
/**  
*    
* 项目名称：com.gechuang.java   
* 类名称：User   
* 类描述：   
* 创建人：25966   
* 创建时间：2020年5月28日 上午10:48:50   
* @version        
*/
public class User {
   private Long id;
   private String name;
   private String email;
   private int age;
   private Date bornDate;
   
   
   //getter setter
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Date getBornDate() {
	return bornDate;
}
public void setBornDate(Date bornDate) {
	this.bornDate = bornDate;
}




//
/* (non-Javadoc)  重写，overload 重载
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", bornDate=" + bornDate + "]";
}
  
}
