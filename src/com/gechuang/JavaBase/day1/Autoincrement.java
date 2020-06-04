/**
    *实现数据增加操作
     * @param vo 表示要执行操作的对象
     * @return 成功返回true，失败返回false
     *  @throws SQLException
    * */
package com.gechuang.JavaBase.day1;

/**  
*    
* 项目名称：BaseParam   
* 类名称：Autoincrement   
* 类描述：   自增自减的面试题
* 创建人：25966   
* 创建时间：2020年6月4日 上午10:15:32   
* @version        
*/
public class Autoincrement {
	 public static void main(String[] args) {
		 int i = 1;
		 i = i++;
		 int temp = i;
		 i++;
		 int k = temp+i*i;
		 i++;
		 System.out.println(i);
		 System.out.println(k);
	}
}
