package springmvc.emp.dao;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Component;

import springmvc.emp.entity.Emp;
import springmvc.emp.util.JdbcUtil;

/**'
 * 员工管理模块
 * 持久层
 * @author leifeng
 * 2016年9月19日
 */
@Component("empDao")
public class EmpDao {
	/**
	 * 查询所有员工
	 */
	public List<Emp> findAll() throws Exception{
		QueryRunner runner=new QueryRunner(JdbcUtil.getDataSource());
		String sql="SELECT * FROM EMP";
		
		return runner.query(sql, new BeanListHandler<Emp>(Emp.class));
	}
	
	public static void main(String[] args) throws Exception {
		EmpDao dao=new EmpDao();
		for(Emp emp:dao.findAll()){
			System.out.println(emp);
		}
	}

}
