/**
    *实现数据增加操作
     * @param vo 表示要执行操作的对象
     * @return 成功返回true，失败返回false
     *  @throws SQLException
    * */
package com.gechuang.mybatis.domain;


import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

/**  
*    
* 项目名称：BaseParam   
* 类名称：HelloTest   
* 类描述：   
* 创建人：25966   
* 创建时间：2020年5月29日 上午10:18:32   
* @version        
*/
public class HelloTest {
   @Test
   public void testSave(){
	   User user = new User();
	   user.setName("name");
	   user.setAge(17);
	   user.setEmail("email");
	   user.setBornDate(new Date());
	   
	   try {
		   //启动框架里面的方法，调用配置文件
		   SqlSessionFactory sf = new SqlSessionFactoryBuilder()
				   .build(Resources.getResourceAsStream("mybatis-config.xml"));
		   //通过工厂模式factory得到SqlSession,打开数据库的session会话机制
		   SqlSession session = sf.openSession();
		   //找到对应的sql，保存对应的对象
		   session.insert("com.dsir.Mybatis.domain.UserMapper", 1);
	} catch (Exception e) {
		// TODO: handle exception
	}
   }
}
