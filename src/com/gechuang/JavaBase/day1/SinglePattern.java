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
* 类名称：SinglePattern   
* 类描述：   
* 创建人：25966   
* 创建时间：2020年5月28日 下午7:39:41   
* @version        
*/
public class SinglePattern {
	/**
	 *  单例模式步骤
	 *    1、创建 SingleObject 的一个对象
	 *    2、让构造函数为 private，这样该类就不会被实例化
	 *    3、 获取唯一可用的对象
	 * 
	   private static SinglePattern instance = new SinglePattern();
	 
	   //让构造函数为 private，这样该类就不会被实例化
	   private SinglePattern(){}
	 
	   public static SinglePattern getInstance(){
	      return instance;
	   }
	 
	   public void showMessage(){
	      System.out.println("Hello World!");
	   }
	   **/
   
	
	/**
     * 饿汉式单例
     * */
	private static SinglePattern instance = new SinglePattern();
	private SinglePattern(){}
		
	public static SinglePattern getInstance(){
		   return instance;
	}
	}
	
	
	/**
     * 懒汉式单例
     * 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized
	private static SinglePattern instance;
	private SinglePattern(){}
	public static synchronized SinglePattern getInstance(){
	   if(instance == null){
		   instance = new SinglePattern();
	   }
	   return instance;
	}
	*/
