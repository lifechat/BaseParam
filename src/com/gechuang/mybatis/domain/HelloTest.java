/**
    *实现数据增加操作
     * @param vo 表示要执行操作的对象
     * @return 成功返回true，失败返回false
     *  @throws SQLException
    * */
package com.gechuang.mybatis.domain;


import java.io.IOException;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.gechuang.mybatis.util.myBatisUtil;

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
	   
	   SqlSession session = null;
	   try {
		   //启动框架里面的方法，调用配置文件
		   session = myBatisUtil.openSession();
		   //通过工厂模式factory得到SqlSession,打开数据库的session会话机制
		   session.insert("mybatis.domain.UserMapper.add", user);
		   //提交事务
		   session.commit();
		   //关闭资源
		   session.close();
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		if(session != null){
			session.close();
		}
	}
   }
   @Test
   public void testUpdate(){
	   try {
		SqlSession session = myBatisUtil.openSession();
		   
		User user = new User();
		user.setId(2L);
		user.setName("update");
		user.setEmail("2596642641@qq.com");
		user.setAge(18);
		user.setBornDate(new Date());
		
		session.update("mybatis.domain.UserMapper.update",user);
		session.commit();
		session.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
   }
}
