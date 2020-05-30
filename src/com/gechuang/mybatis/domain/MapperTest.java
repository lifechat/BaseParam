/**
    *实现数据增加操作
     * @param vo 表示要执行操作的对象
     * @return 成功返回true，失败返回false
     *  @throws SQLException
    * */
package com.gechuang.mybatis.domain;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.gechuang.mybatis.util.myBatisUtil;

/**  
*    
* 项目名称：BaseParam   
* 类名称：HelloMapperTest   
* 类描述：   
* 创建人：25966   
* 创建时间：2020年5月30日 下午3:59:31   
* @version        
*/
public class MapperTest {
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
    		     UserMapper mapper =  session.getMapper(UserMapper.class);
    		     mapper.add(user);
    		   //提交事务
    		   session.commit();
    		   //关闭资源
    		   session.close();
    	} catch (Exception e) {
    		e.printStackTrace();
    		if(session != null){
    			session.rollback();
    		}
    	}finally {
    		if(session != null){
    			session.close();
    		}
    	}
       }
    }
