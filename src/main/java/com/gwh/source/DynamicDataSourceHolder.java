/**
 * 
 */
package com.gwh.source;

/**
 * @author ZhaoXinGuo
 * 
 * @email sxdtzhaoxinguo@163.com
 */
public class DynamicDataSourceHolder {

	public static final ThreadLocal<String> holder = new ThreadLocal<String>();

	public static void putDataSource(String name) {
		holder.set(name);
	}

	public static String getDataSouce() {
		return holder.get();
	}

}
