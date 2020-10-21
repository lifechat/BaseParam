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
* 类名称：Bank   
* 类描述：   
* 创建人：25966   
* 创建时间：2020年10月21日 下午12:13:02   
* @version        
*/
public class Bank {
     private User[] users = new User[5];
     
     private int size;
     
     public void initial(){
    	 User user = new User();
    	 user.setCardNo("10086");
    	 user.setIdentity("13015453362");
    	 user.setUsername("xiaqi17");
    	 user.setPassword("1234567");
    	 user.setPhone("110");
    	 user.setBanlance(10000);
    	 
    	 //user2
    	 User user2 = new User("10086","13015453362","xiaqi17","1234567","110",6000);
    	 users[0] = user;
    	 users[1] = user2;
    	 size = 2;
     }
}
