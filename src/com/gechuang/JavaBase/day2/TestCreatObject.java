/**
    *实现数据增加操作
     * @param vo 表示要执行操作的对象
     * @return 成功返回true，失败返回false
     *  @throws SQLException
    * */
package com.gechuang.JavaBase.day2;

/**  
*    
* 项目名称：BaseParam   
* 类名称：TestCreatObject   
* 类描述：   
* 创建人：25966   
* 创建时间：2020年10月14日 上午7:28:20   
* @version        
*/
public class TestCreatObject {
	public static void main(String[] args) {
		DogClass myDogClass  = new DogClass();
		
		//属性赋值
		myDogClass.breed = "萨摩";
		myDogClass.age = 2;
		myDogClass.sex = "公";
		myDogClass.furColor = "白色";
		
		//获取属性值
		System.out.println(myDogClass.breed);
		System.out.println(myDogClass.age);
		System.out.println(myDogClass.sex);
		System.out.println(myDogClass.furColor);
		
		myDogClass.eat();
		myDogClass.sleep();
	}
}
