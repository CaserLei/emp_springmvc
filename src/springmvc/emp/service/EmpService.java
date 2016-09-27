package springmvc.emp.service;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;

import springmvc.emp.dao.EmpDao;
import springmvc.emp.entity.Emp;

/**'
 * 员工管理模块
 * 业务层
 * @author leifeng
 * 2016年9月19日
 */
@Component("empService")
public class EmpService {
	
	private EmpDao empDao;
	@Resource(name="empDao")
	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}


	/**
	 * 查询所有员工
	 */
	public List<Emp> findAllEmp() throws Exception{
		
		return empDao.findAll();
	}

}
