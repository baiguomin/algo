package com.baiguomin.algo.sort;

/**
 * ClassName: ShellSort <br/>
 * date: 2016年9月22日 上午9:54:28 <br/>
 * @author baiguomin
 * @since JDK 1.7
 */
public class ShellSort {

	static double[]  arr =  new double[]{64,21,5,27.4,98.6,1.0};
	/**
	 * 上述数组用插入排序moveNum = 9 
	 * 希尔排序是对插入排序的改进，插入排序中的步长是1，也就是每一次数字比较的对象是和它相差一位
	 * 希尔排序引入了增量序列的概念，是一个步长的序列，序列的选择有多重多样
	 * 希尔本人建议的步长是  p = arr.len/2;p /= 2;p>0
	 * 希尔排序对插入排序的改进就是将数组的moveNum降低了
	 */
	public static void main(String[] args) {
		Integer moveNum = 0;
		int p;
		//1选择步长序列(本例子中为{3,1})
		for(int step = arr.length/2;step>0;step/=2){
			//2内部其实就是插入排序，只不过步长不是之前的1，当步长为1时，就是普通的插入排序
			for(int index=step;index<arr.length;index++){
				double tmp = arr[index];
				for(p=index;p>=step && arr[p-step]>tmp;p-=step){
					arr[p]= arr[p-step];
					moveNum++;
				}
				arr[p]= tmp;
			}
		}
		for(int index=0;index<arr.length;index++){
			System.out.println(arr[index]);
		}
		System.out.println("moveNum is"+moveNum);
	}
	
	
	
	
}
