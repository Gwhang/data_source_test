/**
 * 
 */

package com.gwh.source;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 扩展Spring的AbstractRoutingDataSource抽象类，实现动态数据源<br/>
 * 
 * AbstractRoutingDataSource中的抽象方法determineCurrentLookupKey是实现数据源的route的核心.这里对该方法进行Override。<br/>
 * 
 * @author guanwanhang
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		return DynamicDataSourceHolder.getDataSouce();
	}

}
