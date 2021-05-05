/**
 * 
 */

package com.gwh.source;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * @author ZhaoXinGuo
 * 
 * @email sxdtzhaoxinguo@163.com
 */
public class DataSourceAspect {
	
	private final Logger logger = LoggerFactory.getLogger(DataSourceAspect.class);

	public void before(JoinPoint point) {
		Object target = point.getTarget();
		String method = point.getSignature().getName();
		Class<?>[] classz = target.getClass().getInterfaces();
		Class<?>[] parameterTypes = ((MethodSignature) point.getSignature()).getMethod().getParameterTypes();
		try {
			Method m = classz[0].getMethod(method, parameterTypes);
			//System.out.println(m.getAnnotation(DataSource.class).value());
			if (m != null && m.isAnnotationPresent(DataSource.class)) {
				DataSource data = m.getAnnotation(DataSource.class);
				DynamicDataSourceHolder.putDataSource(data.value());
				logger.info("---------------------" + "当前数据源为：" + data.value() + "---------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
