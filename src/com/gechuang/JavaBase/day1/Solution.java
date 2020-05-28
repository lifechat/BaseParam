/**
    *实现数据增加操作
     * @param vo 表示要执行操作的对象
     * @return 成功返回true，失败返回false
     *  @throws SQLException
    * */
package com.gechuang.JavaBase.day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**  
*    
* 项目名称：BaseParam   
* 类名称：Solution   
* 类描述： 求两数之和  
* 创建人：25966   
* 创建时间：2020年5月28日 下午4:13:52   
* @version        
*/
public class Solution {
	/**
	 * method1
	 * */
	public static int[] arr = {1,3,2,7,11,9,8};
	public static int target = 8;
	    public int[] getSum(int[] nums, int target) {
	        for (int i = 0; i < nums.length; i++) {
	            for (int j = i + 1; j < nums.length; j++) {
	                if (nums[j] == target - nums[i]) {
	                    return new int[] { i, j };
	                }
	            }
	        }
	        throw new IllegalArgumentException("No two sum solution");
	    }
	   /**
		* method2 哈希表遍历
		* */
	 public int[] getSum1(){
	    Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(arr[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
	    /**
	 	  * method3
	 	  * */
	  public int[] getSum2(int[] nums, int target) {
		        Map<Integer, Integer> map = new HashMap<>();
		        for (int i = 0; i < nums.length; i++) {
		            map.put(nums[i], i);
		        }
		        for (int i = 0; i < nums.length; i++) {
		            int complement = target - nums[i];
		            if (map.containsKey(complement) && map.get(complement) != i) {
		                return new int[] { i, map.get(complement) };
		            }
		        }
		        throw new IllegalArgumentException("No two sum solution");
		    }
	    public static void main(String[] args) {
		  Solution s = new Solution();
		  int [] res = s.getSum(arr, target);
		  System.out.println(Arrays.toString(res));
		}
}
