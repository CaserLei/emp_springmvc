package springmvc.emp.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtil {
	/**
	 * 去src目录下加载c3p0-config.xml
	 */
	private static ComboPooledDataSource dataSource=new ComboPooledDataSource();

	public static ComboPooledDataSource getDataSource() {
		return dataSource;
	}
	

}
