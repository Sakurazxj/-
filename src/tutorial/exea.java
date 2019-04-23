package tutorial;

import java.util.*;
import java.lang.*;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpServletRequest;
import java.sql.*;

import org.omg.CORBA.Request;

public class exea extends ActionSupport{
	private String toJsp;

	/**
	 * @return the toJsp
	 */
	public String getToJsp() {
		return toJsp;
	}

	/**
	 * @param toJsp the toJsp to set
	 */
	public void setToJsp(String toJsp) {
		this.toJsp = toJsp;
	}
	
	public String execute() 
	{
		int signnum=0;
		try {
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setCharacterEncoding("UTF-8");
			//toJsp  =  new  String(request.getParameter("toJsp").getBytes("ISO-8859-1"), "utf-8");
		    //toJsp1 = toJsp;
			ActionContext.getContext().put("toJsp", "toJsp"); 
			System.out.println(toJsp);
		}catch(Exception e){
	    	 System.out.print("登录失败，请重新登录！");
	    	 ActionContext.getContext().put("key", "未选择功能，请返回上一步重新操作！"); 
	    	 e.printStackTrace();
	     }
		if(signnum==0) {
			return "success";
		}
		else
		{
			return "error";
		}
	}
}
