package com.baiguomin.algo.search;

/**
 * ClassName: ArrayBinarySearch <br/>
 * date: 2016年10月18日 上午10:17:58 <br/>
 * @author baiguomin1991@163.com
 * 数组二分查找针对于有序的数组，也称折半查找
 * 这个问题是我去喜马拉雅面试的时候问到的一个问题
 * @since JDK 1.7
 */
public class ArrayBinarySearch {
	static double[] arr = new double[]{1,2,3,4,5,6,7,8,9};//我们假定此数组是有序的
	
	public static void main(String[] args) {
		double destanation = 9;//这个使我们的查找目标，如果存在，返回下标，如果不存在，就返回-1
		int index = binarySearch(arr,destanation);
		System.out.println("index is"+index);
	}

	private static int binarySearch(double[] arr, double destanation) {
		int low = 0;
		int high = arr.length - 1;
		while(low<=high && (low <= arr.length-1)){
			//1.取中间值
			int middle = (low + high) /2 ;
			if(destanation == arr[middle]){
				return middle;
			}else{
				//2.如果目标值比中间值大，就去右半部分查找
				if(destanation > arr[middle]){
					low = middle + 1;
				}else{
				//2.如果目标值比中间值小，就去左半部分查找
					high = middle - 1;
				}
			}
		}
		//如果一致没找到，那就返回 -1
		return -1;
	}
}
