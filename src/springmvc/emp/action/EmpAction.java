package springmvc.emp.action;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import springmvc.emp.entity.Emp;
import springmvc.emp.service.EmpService;

/**
 * 员工管理
 * 控制器
 * @author leifeng
 * 2016年9月19日
 */
@Controller
@RequestMapping(value="/emp")
public class EmpAction {

	//业务层
	private EmpService empService;
	
	@Resource(name="empService")
	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}

	
	/**
	 * 显示所有员工
	 */
	@RequestMapping(value="/showAllEmp")
	public @ResponseBody Map<String,Object> showAllEmp(Model model) throws Exception{
		Map<String,Object> allEmpMap=new HashMap<String,Object>();
		List<Emp> empList=empService.findAllEmp();
		
		allEmpMap.put("total", empList.size());
		allEmpMap.put("rows", empList);
		
		return allEmpMap;
	}
	

}
