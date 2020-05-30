/**
    *实现数据增加操作
     * @param vo 表示要执行操作的对象
     * @return 成功返回true，失败返回false
     *  @throws SQLException
    * */
package com.gechuang.mybatis.domain;

import java.util.List;


/**  
*    
* 项目名称：BaseParam   
* 类名称：UserMapper   
* 类描述：   
* 创建人：25966   
* 创建时间：2020年5月30日 下午3:56:34   
* @version        
*/
public interface UserMapper {
   void add(User u);
   
   void update(User u);
   
   User get(Long id);
   
   void delete(Long id);
   
   List<User> list();
}
