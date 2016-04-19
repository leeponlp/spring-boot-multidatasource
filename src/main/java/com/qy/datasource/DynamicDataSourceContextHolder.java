package com.qy.datasource;

/**
 * This class is used for ...
 * 
 * @author leepon1990
 * @version 1.0, 2016年4月18日 下午3:39:57
 */

public class DynamicDataSourceContextHolder {

	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

	public static void setDataSourceType(String dataSourceType) {
		contextHolder.set(dataSourceType);
	}

	public static String getDataSourceType() {
		return contextHolder.get();
	}

	public static void clearDataSourceType() {
		contextHolder.remove();
	}

}