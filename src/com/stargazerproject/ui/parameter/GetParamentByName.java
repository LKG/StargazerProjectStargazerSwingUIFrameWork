package com.stargazerproject.ui.parameter;


/**
 * 根据Key获取指定Value
 * 
 *@Web https://github.com/pisual http://www.pisual.com
 *@email pisual@163.com dsnsuva@163.com dsnsuva@gmail.com
 *@author Felixerio FelixSion
 */
public class GetParamentByName {
	
	/** 根据指定名称获取String类型结果 **/
	public static String GetParamentByKeyInSystemMemory(String key){
		String value = System.getProperty(key);
		return value;
	}
	
	/** 根据指定名称获取颜色数组，返回为一个三色RGB数组，如果没有次参数，返回一个初始化RGB #000000 **/
	public static int[] GetParamentByKeyInSystemMemoryTransformArray(String key){
		String stringResulr[] = System.getProperty(key).trim().split(",");
		int integerResult[] = new int[]{0,0,0};
		for(int i=0;i<stringResulr.length;i++){
			integerResult[i] = Integer.parseInt(stringResulr[i]);
		}
		return integerResult;
	}
	
	/** 根据指定名称获取数组形参数，如果没有次参数，返回一个初始化数组**/
	public static int[] GetParamentByKeyInSystemMemoryTransformNormallArray(String key){
		String stringResulr[] = System.getProperty(key).trim().split(",");
		int integerResult[] = new int[stringResulr.length];
		for(int i=0;i<stringResulr.length;i++){
			integerResult[i] = Integer.parseInt(stringResulr[i]);
		}
		return integerResult;
	}
	
}
