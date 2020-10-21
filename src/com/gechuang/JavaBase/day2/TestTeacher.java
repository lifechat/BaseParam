/**
    *实现数据增加操作
     * @param vo 表示要执行操作的对象
     * @return 成功返回true，失败返回false
     *  @throws SQLException
    * */
package com.gechuang.JavaBase.day2;

import javax.sql.rowset.serial.SerialArray;

/**  
*    
* 项目名称：BaseParam   
* 类名称：TestTeacher   
* 类描述：   
* 创建人：25966   
* 创建时间：2020年10月16日 上午9:03:54   
* @version        
*/
public class TestTeacher {
    String name;
    int age;
    double Score;
    
    //创建对象
    public void sayHi(){
    	System.out.println("同学们好，我是"+name+"年龄"+age+"分数是:"+Score);
    }
    //know
    public void know(DogClass d){
    	System.out.println(name+"要认识学生");
    	d.eat();
    }
}
