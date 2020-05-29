/**
    *实现数据增加操作
     * @param vo 表示要执行操作的对象
     * @return 成功返回true，失败返回false
     *  @throws SQLException
    * */
package com.gechuang.mybatis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**  
*    
* 项目名称：BaseParam   
* 类名称：myBatisUtil   
* 类描述：   
* 创建人：25966   
* 创建时间：2020年5月29日 下午7:52:26   
* @version        
*/
public class myBatisUtil {
      private static myBatisUtil instance = new myBatisUtil();
      private SqlSessionFactory factory;
      
      private myBatisUtil(){
    	  try {
			factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
		} catch (Exception e) {
			e.printStackTrace();
		}
      }
      
      public static SqlSession openSession(){
    	  return instance.factory.openSession();
      }
}
