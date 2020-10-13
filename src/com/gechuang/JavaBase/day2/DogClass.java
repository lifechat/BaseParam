/**
    *实现数据增加操作
     * @param vo 表示要执行操作的对象
     * @return 成功返回true，失败返回false
     *  @throws SQLException
    * */
package com.gechuang.JavaBase.day2;

import com.gechuang.JavaBase.day1.Solution;

/**  
*    
* 项目名称：BaseParam   
* 类名称：DogClass   
* 类描述：   
* 创建人：25966   
* 创建时间：2020年10月14日 上午7:18:14   
* @version        
*/
public class DogClass {
		//属性
		//品种
	String breed;
	//age
	int age;
	//sex
	String sex;
	//color
	String furColor;
	//方法
	//eat 吃
	public void eat(){
		System.out.println("狗狗正在吃东西.....");
	}
	//sleep 睡觉
	public void sleep(){
		System.out.println("狗狗开始睡觉了....");
	}
	
}
