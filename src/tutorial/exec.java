package tutorial;
import java.util.*;
import java.text.SimpleDateFormat;
import java.lang.*;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.sql.*;

import org.omg.CORBA.Request;
import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Calendar;  
import java.util.Date; 
import java.util.Scanner;
public class exec extends ActionSupport{
	ServletRequest request = ServletActionContext.getRequest();
    HttpServletRequest req = (HttpServletRequest) request;
    HttpSession session = req.getSession();
	
	private String username;
	private String password;
	private String color;
	private String toJsp;
	private teacherinf tecinf;
	private studentinf stdinf;
	
	private String rows;
	
	private String search;
	private String regis;

	private DateInf dateList;
	private String weeknum;
	private String weeknum2;
	public String getWeeknum2() {
    return weeknum2;
  }
  public void setWeeknum2(String weeknum2) {
    this.weeknum2 = weeknum2;
  }

  private String daterows;
	private String newdate;
	private String test;
	
	private String fbflag;
	
	private String letter;
	
	private String TecID;
	private String reserverows;
	private String apptInf;
	private String agree;
	
	public void setAgree(String agree) {
		this.agree = agree;
	}
	public String getAgree() {
		return agree;
	} 
	
	public void setApptInf(String apptInf) {
		this.apptInf = apptInf;
	}
	public String getApptInf() {
		return apptInf;
	} 
	
	public void setTest(String test) {
		this.test = test;
	}
	public String getTest() {
		return test;
	}
	
	public String getRegis() {
    return regis;
  }
  public void setRegis(String regis) {
    this.regis = regis;
  }
  public void setDateList(DateInf dateList) {
		this.dateList = dateList;
	}
	public DateInf getDateList() {
		return dateList;
	}
	
	public void setWeeknum(String weeknum) {
		this.weeknum = weeknum;
	}
	public String getWeeknum() {
		return weeknum;
	}
	
	public void setDaterows(String daterows) {
		this.daterows = daterows;
	}
	public String getDaterows() {
		return daterows;
	}
	
	public void setNewdate(String newdate) {
		this.newdate = newdate;
	}
	public String getNewdate() {
		return newdate;
	}
/*	//教师时间表变量=============================================
	private String date1, date2, date3, date4, date5, date6, date7, date8, date9, date10;
	private String date11, date12, date13, date14, date15, date16, date17, date18, date19, date20;
	private String date21, date22, date23, date24, date25, date26, date27, date28;
	//教师时间getter setter函数=======================
	public void setDate1(String date1) {
		this.date1 = date1;
	}
	public String getDate1() {
		return date1;
	}
	
	public void setDate2(String date2) {
		this.date2 = date2;
	}
	public String getDate2() {
		return date2;
	}
	
	public void setDate3(String date3) {
		this.date3 = date3;
	}
	public String getDate3() {
		return date3;
	}
	
	public void setDate4(String date4) {
		this.date4 = date4;
	}
	public String getDate4() {
		return date4;
	}
	
	public void setDate5(String date5) {
		this.date5 = date5;
	}
	public String getDate5() {
		return date5;
	}
	
	public void setDate6(String date6) {
		this.date6 = date6;
	}
	public String getDate6() {
		return date6;
	}
	
	public void setDate7(String date7) {
		this.date7 = date7;
	}
	public String getDate7() {
		return date7;
	}
	
	public void setDate8(String date8) {
		this.date8 = date8;
	}
	public String getDate8() {
		return date8;
	}
	
	public void setDate9(String date9) {
		this.date9 = date9;
	}
	public String getDate9() {
		return date9;
	}
	
	public void setDate10(String date10) {
		this.date10 = date10;
	}
	public String getDate10() {
		return date10;
	}
	
	public void setDate11(String date11) {
		this.date11 = date11;
	}
	public String getDate11() {
		return date11;
	}
	
	public void setDate12(String date12) {
		this.date12 = date12;
	}
	public String getDate12() {
		return date12;
	}
	
	public void setDate13(String date13) {
		this.date13 = date13;
	}
	public String getDate13() {
		return date13;
	}
	
	public void setDate14(String date14) {
		this.date14 = date14;
	}
	public String getDate14() {
		return date14;
	}
	
	public void setDate15(String date15) {
		this.date15 = date15;
	}
	public String getDate15() {
		return date15;
	}
	
	public void setDate16(String date16) {
		this.date16 = date16;
	}
	public String getDate16() {
		return date16;
	}
	
	public void setDate17(String date17) {
		this.date17 = date17;
	}
	public String getDate17() {
		return date17;
	}
	
	public void setDate18(String date18) {
		this.date18 = date18;
	}
	public String getDate18() {
		return date18;
	}
	
	public void setDate19(String date19) {
		this.date19 = date19;
	}
	public String getDate19() {
		return date19;
	}
	
	public void setDate20(String date20) {
		this.date20 = date20;
	}
	public String getDate20() {
		return date20;
	}
	
	public void setDate21(String date21) {
		this.date21 = date21;
	}
	public String getDate21() {
		return date21;
	}
	
	public void setDate22(String date22) {
		this.date22 = date22;
	}
	public String getDate22() {
		return date22;
	}
	
	public void setDate23(String date23) {
		this.date23 = date23;
	}
	public String getDate23() {
		return date23;
	}
	
	public void setDate24(String date24) {
		this.date24 = date24;
	}
	public String getDate24() {
		return date24;
	}
	
	public void setDate25(String date25) {
		this.date25 = date25;
	}
	public String getDate25() {
		return date25;
	}
	
	public void setDate26(String date26) {
		this.date26 = date26;
	}
	public String getDate26() {
		return date26;
	}
	
	public void setDate27(String date27) {
		this.date27 = date27;
	}
	public String getDate27() {
		return date27;
	}
	
	public void setDate28(String date28) {
		this.date28 = date28;
	}
	public String getDate28() {
		return date28;
	}
	//教师日程表getter setter函数完毕
*/	
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



	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}



	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}



	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}



	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}



	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}



	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
////////////////////////////////////////////////
	public void setRows(String rows) {
		this.rows = rows;
	}
	
	public String getRows() {
		return rows;
	}
	
////////////////////////////////////////////////////	
	public void setSearch(String search) {
		this.search = search;
	}
	public String getSearch() {
		return search;
	}
/////////////////////////////////////////////////////
	public void setFbflag(String fbflag) {
		this.fbflag = fbflag;
	}
	public String getFbflag() {
		return fbflag;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}
	public String getLetter() {
		return letter;
	}
	
	public void setTecID(String TecID) {
		this.TecID = TecID;
	}
	public String getTecID() {
		return TecID;
	}
	
	public void setReserverows(String reserverows) {
		this.reserverows = reserverows;
	}
	public String getReserverows() {
		return reserverows;
	}

	
	public String searchTmp() {
		System.out.println("searchTmp");
		return "success";
	}
	
	public String searchTec() {		
		mysql connect = new mysql();	
		List<String> inf = new ArrayList<String>();
		teacherinf tec = new teacherinf();
		String sql = "select * from teacher where Name = '"+ search+"'";
		System.out.println(sql);		//  test
		System.out.println("username: "+ username);
		
		inf = connect.select(sql);
//		System.out.println(inf);		//test
		if(inf.size()==0)
			return "Fail";
		
		if(inf.size()!=0) {
	        tec.teacherId=   inf.get(0);
	        tec.teacherName= inf.get(1);
	        tec.teacherGender=inf.get(2);
	        tec.teacherBirthday=inf.get(3);
	        tec.teacherCollege=inf.get(4);                                     
	        tec.teacherPhone=inf.get(5);
	        tec.teacherEmile=inf.get(6);
	        tec.teacherResume=inf.get(7);
	        tec.achievement=inf.get(8);
	        setTecinf(tec);
		}
		setUsername(username);
		setWeeknum(Weeks());
		setWeeknum2(Weeks());
		System.out.println("searchinf:"+tecinf.teacherId);
		System.out.println(weeknum2);
		
		loadTecDate(inf.get(0));	//inf.get(0)为TecID

	//	ActionContext.getContext().put("apptlist1", loadAppt(username));
	//	System.out.println(loadAppt(username));
		loadStuAppt(username);
		
        return "success";
		
	}
	
	public String modStuInfTmp() {
		mysql connect = new mysql();
		
		String sql = "update student set ";
		switch(rows) {
		case "a2":
			sql = sql + "Name "; break;
		case "a3":
			sql = sql + "Sex "; break;
		case "a4":
			sql = sql + "Birthday "; break;
		case "a6":
			sql = sql + "College "; break;
		case "a7":
			sql = sql + "PhoneNum "; break;
		case "a8":
			sql = sql + "Email "; break;
		}
		sql = sql + "= '" + toJsp + "' where StuID = '" + username + "'";
		System.out.println(sql);
		
		int flag;
		flag = connect.update(sql);
		if(flag==1) {
			return "success";
		} else {
			System.out.println("fail");
			return "fail";
		}
		
	}
	
	public String modTecInfTmp() {
		mysql connect = new mysql();
		
		String sql = "update teacher set ";
		switch(rows) {
		case "s2":
			sql = sql + "Name "; break;
		case "s3":
			sql = sql + "Sex "; break;
		case "s4":
			sql = sql + "Birthday "; break;
		case "s5":
			sql = sql + "College "; break;
		case "s6":
			sql = sql + "PhoneNum "; break;
		case "s7":
			sql = sql + "Email "; break;
		case "s8":
			sql = sql + "Resume "; break;
		case "s11":
			sql = sql + "Achievement "; break;
		}
		if(username.length()==1) {
		  username = "000"+username;
		}
		else if(username.length()==2) {
      username = "00"+username;
    }
		else if(username.length()==3) {
      username = "0"+username;
    }
		
		sql = sql + "= '" + toJsp + "' where TecID = '" + username + "'";
		System.out.println(sql);
		
		int flag;
		flag = connect.update(sql);
		if(flag==1) {
			return "sucess";
		} else {
			System.out.println("fail");
			return "fail";
		}
		
//		System.out.println(username+toJsp+" test "+rows);
//		return "sucess";
	}
	

	public String execute() 
	{
		int signnum=2;
		mysql data = new mysql();
		teacherinf tec = new teacherinf();
		studentinf tec2 = new studentinf();
		List<String> inf = new ArrayList<String>();
		List<String> std = new ArrayList<String>();
		String sql = "select * from teacher where TecID = " + username;
		String sql2 = "select * from student where StuID = " + username;
		String sql3 ="insert into teacher(TecID,Password) VALUES("+ username +","+ password+");";
		String sql4 ="insert into student(StuID,Password) VALUES("+ username +","+ password+");";
		System.out.println("color = "+color);
		System.out.println(sql4);
		System.out.println(sql3);
		System.out.println(regis);
		System.out.println("sssssssss");
		try {
		    if(regis.equals("注册")) {
		      if(color.equals("学生")) {
		        data.insert(sql4);
		        return "login";
		      }
		      if(color.equals("老师")) {
		        data.insert(sql3);
		        return "login";
		      }
		    }
		    if(regis.equals("登录")) {
		      if(color.equals("学生")){
            //    Statement stmt = connect.createStatement();
                std = data.select(sql2);
                if(std.size()==0) {
                    return "error";
                }
                if(std.get(7).equals(password)) {       //password在Student表中的第七列
                    tec2.StdID=std.get(0);
                    tec2.Name=std.get(1);
                    tec2.Gender=std.get(2);
                    tec2.BirthDay=std.get(3);
                    tec2.College=std.get(4);
                    tec2.PhoneNum=std.get(5);
                    tec2.Email=std.get(6);
                    stdinf = tec2;
                    color = tec2.Name;
                    return "STUDENT";
                }else {
                    return "error";
                }

        }
      
        if(color.equals("教师")){
            System.out.println(color);
                //    Statement stmt = connect.createStatement();
                    inf = data.select(sql);
                    
                    if(inf.size()==0) {
                        return "error";
                    }
                    if(inf.get(11).equals(password)) {      //password在Student表中的第七列
                        //  session.setAttribute("TecID", TecInf.get(0));
                        //  session.setAttribute("TecInf", TecInf);
                        tec.teacherId=   inf.get(0);
                          tec.teacherName= inf.get(1);
                          tec.teacherGender=inf.get(2);
                          tec.teacherBirthday=inf.get(3);
                          tec.teacherCollege=inf.get(4);                                     
                          tec.teacherPhone=inf.get(5);
                          tec.teacherEmile=inf.get(6);
                          tec.teacherResume=inf.get(7);
                          tec.achievement=inf.get(8);
                          color = tec.teacherName+color;
                          setTecinf(tec);
                        return "TECAHER";
                        }else {
                            return "error";
                        }

                }
       
    String validator;                 //验证字符串
      validator = "jkl";
    HttpServletRequest request = ServletActionContext.getRequest();
    request.setCharacterEncoding("UTF-8");
    //color  =  new  String(request.getParameter("color").getBytes("ISO-8859-1"), "utf-8");
    if(inf.isEmpty()&&password.equals(tec.password))
    {
      signnum=0;
      return "success";
    }
    else
    {
      validator="ERROR";
      request.setAttribute("validator", validator);
      signnum=1;
      return "error";
    }
		    }
		    
		}catch(Exception e){
	    	 System.out.print("登录失败，请重新登录！");
	    	 ActionContext.getContext().put("key", "未选择功能，请返回上一步重新操作！"); 
	    	 e.printStackTrace();
	     }
		if(signnum==0) {
			return "success";
		}
		else if(signnum==1){
			return "error";
		}
		else {
			return "chain";
		}
	}
	
	public String modTecInf() {
	    setWeeknum(Weeks());
	    setWeeknum2(Weeks());
	    loadTecInf(username);
	    loadTecDate(username);
	    loadTecAppt(username);
		
        
  //=====================================
        session.setAttribute("TecID", username);
        
		return "success";
	}
	
	public String modStuInf() {
	    mysql data = new mysql();
        studentinf std = new studentinf();
        List<String> inf = new ArrayList<String>();        
        String sql = "select * from student where StuID = " + username;
        System.out.println(sql);
        
        inf = data.select(sql);
        System.out.println(inf);
        
        std.StdID=   inf.get(0);
        std.Name= inf.get(1);
        std.Gender=inf.get(2);
        std.BirthDay=inf.get(3);
        std.College=inf.get(4);                                     
        std.PhoneNum=inf.get(5);
        std.Email=inf.get(6);
        color = std.Name+color;
        setStdinf(std);

		return "success";
	}
	
	public String modDate() {
		mysql connect = new mysql();
		
		System.out.println("helloworld!");
		
		String sql = "update week" + weeknum +" set ";
		switch(daterows) {
		case "1":
			sql = sql + "date1 "; break;
		case "2":
			sql = sql + "date2 "; break;
		case "3":
			sql = sql + "date3 "; break;
		case "4":
			sql = sql + "date4 "; break;
		case "5":
			sql = sql + "date5 "; break;
		case "6":
			sql = sql + "date6 "; break;
		case "7":
			sql = sql + "date7 "; break;
		case "8":
			sql = sql + "date8 "; break;
		case "9":
			sql = sql + "date9 "; break;
		case "10":
			sql = sql + "date10 "; break;
		case "11":
			sql = sql + "date11 "; break;
		case "12":
			sql = sql + "date12 "; break;
			
		case "13":
			sql = sql + "date13 "; break;
		case "14":
			sql = sql + "date14 "; break;
		case "15":
			sql = sql + "date15 "; break;
		case "16":
			sql = sql + "date16 "; break;
		case "17":
			sql = sql + "date17 "; break;
		case "18":
			sql = sql + "date18 "; break;
			
		case "19":
			sql = sql + "date19 "; break;
		case "20":
			sql = sql + "date20 "; break;
		case "21":
			sql = sql + "date21 "; break;
		case "22":
			sql = sql + "date22 "; break;
		case "23":
			sql = sql + "date23 "; break;
		case "24":
			sql = sql + "date24 "; break;
		case "25":
			sql = sql + "date25 "; break;
		case "26":
			sql = sql + "date26 "; break;
		case "27":
			sql = sql + "date27 "; break;
		case "28":
			sql = sql + "date28 "; break;
		}
		if(username.length()==1) {
      username = "000"+username;
    }
    else if(username.length()==2) {
      username = "00"+username;
    }
    else if(username.length()==3) {
      username = "0"+username;
    }
		sql = sql + "= '" + newdate + "' where TecID = '" + username + "'";
		System.out.println(sql);
		
		int flag;
		flag = connect.update(sql);
		if(flag==1) {
			return "success";
		} else {
			System.out.println("fail");
			return "fail";
		}
		
//		System.out.println(username+toJsp+" test "+rows);
//		return "sucess";
	}
	
	public String newWeekDate() {

        if(fbflag.equals("1") && !weeknum.equals("1"))  
        	weeknum = String.valueOf(Integer.valueOf(weeknum)-1);
        else if(fbflag.equals("0") && !weeknum.equals("19"))
        	weeknum = String.valueOf(Integer.valueOf(weeknum)+1);
        
        loadTecInf(username);
        loadTecDate(username);
        loadTecAppt(username);
		return "success";
	}
	
	public String searchTecLetter() {
		List<String> list= new ArrayList<String>();
		List<String> list2= new ArrayList<String>();
    	mysql data = new mysql();
		char s = letter.toUpperCase().charAt(0);
    	
    	String  sql= "select Name  from teacher order by   ELT(INTERVAL(CONV(HEX(left(CONVERT("+"'"+s+"'"+" USING gbk),1)),16,10),"
    			+"0xB0A1,0xB0C5,0xB2C1,0xB4EE,0xB6EA,0xB7A2,0xB8C1,0xB9FE,0xBBF7,"
    			+"0xBFA6,0xC0AC,0xC2E8,0xC4C3,0xC5B6,0xC5BE,0xC6DA,0xC8BB,0xC8F6,"
    			+"0xCBFA,0xCDDA,0xCEF4,0xD1B9,0xD4D1),"
    			+"'A','B','C','D','E','F','G','H','J','K','L','M','N','O','P',"
    			+"'Q','R','S','T','W','X','Y','Z') asc";
    	list = data.select(sql);    	
    	
    	for (int i=0;i<list.size();i++){
    		String s2 = list.get(i);
    		if(s2.charAt(0) == s){
    			for (int j=i+1;j<list.size();j++){
    				if(list.get(j).charAt(0)==s+1) break;
    				System.out.print(list.get(j));
    			//	if(list.get(j).length()==3)	list2.add(list.get(j));
    			//	else list2.add(list.get(j)+"  ");
    				list2.add(list.get(j));
    			//	ActionContext.getContext().put("teacherlist", list);
    			}
    		}
    	}
    	ActionContext.getContext().put("teacherlist", list2);
    	System.out.print(list2.size());
    	return "success";
	}

	public String Reserve() {
		mysql connect = new mysql();
	//	List<String> apptlist = new ArrayList<String>();
		
		String sql = "insert into appointment values ('";
		sql = sql + username + "', '" + TecID + "', '"
				+ weeknum + "', '" + reserverows +"', '0', '" + ApptIndex() + "')";
		System.out.println(sql);
		
	    int i = connect.insert(sql);
		System.out.println(i);
		return "success";
	}
	
	public String newWeekDate1() {

        if(fbflag.equals("1") && !weeknum.equals("1"))  
        	weeknum = String.valueOf(Integer.valueOf(weeknum)-1);
        else if(fbflag.equals("0") && !weeknum.equals("19"))
        	weeknum = String.valueOf(Integer.valueOf(weeknum)+1);
        
        loadTecInf(TecID);
        loadTecDate(TecID);
        loadTecAppt(TecID);
		return "success";
	}
	
	public String TecModAppt() {
	  System.out.println("aaaaaa");
	  mysql connect = new mysql();
		List<String> inf = new ArrayList<String>();
		String index = apptInf.substring(0, 9);
		//System.out.println(search);
		System.out.println(index);
setWeeknum(Weeks());
    
    loadTecInf(username);
        loadTecDate(username);
        loadTecAppt(username);
		if(agree.equals("0")) {
			String sql = "update appointment set Flag = 1 where aindex="+index;
			
			String sql3 = "select * from appointment where aindex="+index;
			connect.update(sql);
			inf = connect.select(sql3);
			String Time = inf.get(3);
			String sql2 = "update week"+inf.get(2)+" set date"+Time +" = "+"'已预约'"+" where TecID = "+username;
			System.out.println("sql2"+sql2);
			connect.update(sql2);
		}
		
		if(agree.equals("1")) {
			String sql = "update appointment set Flag = 2 where aindex="+index;
			connect.update(sql);
		}		
		loadTecDate(username);
		loadTecAppt(username);
        return "success";
	}
	
	public String StuModAppt() {
		mysql connect = new mysql();
		List<String> inf = new ArrayList<String>();
		String index = apptInf.substring(0, 9);
		System.out.println(index);
		System.out.println(search);
		
		String sql = "delete from appointment  where aindex="+index;
		String sql2 = "select * from teacher where Name = '"+search+"'";
		inf = connect.select(sql2);
		connect.delete(sql);
		System.out.println(username);
		setWeeknum(Weeks());
		setTecID(inf.get(0));
		loadTecInf(TecID);
		loadStuAppt(username);
		loadTecDate(TecID);
		return "success";
	}
	
    public String delete()
    {
        
        return "success";
    }


    public teacherinf getTecinf() {
        return tecinf;
    }



    public void setTecinf(teacherinf tecinf) {
        this.tecinf = tecinf;
    }



    public studentinf getStdinf() {
        return stdinf;
    }



    public void setStdinf(studentinf stdinf) {
        this.stdinf = stdinf;
    }

    
    private String Weeks()
    {
    	Calendar s=Calendar.getInstance();
    	String ti = new String();
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        s.setFirstDayOfWeek(Calendar.MONDAY);
        s.setTimeInMillis(System.currentTimeMillis());
        System.out.println("当前时间:"+s.getTime());
        s.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        System.out.println("周一时间:"+s.getTime());
        ti = sdf.format(s.getTime());
        s.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        ti=ti+"到"+sdf.format(s.getTime());
        System.out.println(ti);
  //      System.out.println("周一时间:"+s.getTime());
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setFirstDayOfWeek(Calendar.MONDAY);
        c2.setFirstDayOfWeek(Calendar.MONDAY);
        c1.set(2019,1,25);
        int week1 = c1.get(Calendar.WEEK_OF_YEAR);
        int week2 = c2.get(Calendar.WEEK_OF_YEAR);
        System.out.println("学期开始时间是："+week1+"当前时间是："+week2);
         
        return String.valueOf(week2-week1+1);
        
    }


    private void loadTecInf(String TecID) {
    	mysql connect = new mysql();
	    
        teacherinf tec = new teacherinf();
        List<String> inf = new ArrayList<String>();
        String sql = "Select * from teacher where TecID = " + TecID;
        inf = connect.select(sql);
        tec.teacherId=   inf.get(0);
  //      tec.teacherId=   "test00000";
        tec.teacherName= inf.get(1);
   //     tec.teacherName= "test00000";
        tec.teacherGender=inf.get(2);
        tec.teacherBirthday=inf.get(3);
        tec.teacherCollege=inf.get(4);                                     
        tec.teacherPhone=inf.get(5);
        tec.teacherEmile=inf.get(6);
        tec.teacherResume=inf.get(7);
        tec.achievement=inf.get(8);
        
        color = tec.teacherName+color;
        setTecinf(tec);
    }

    private void loadTecDate(String TecID) {
    	mysql connect = new mysql();
    	
    	List<String> dateInf = new ArrayList<String>();
        DateInf date = new DateInf();
        System.out.println(weeknum);
        String sql2 = "select * from week" + weeknum + " where TecID = " + TecID;
        System.out.println("sql: " + sql2);
        dateInf = connect.select(sql2);
        
    	date.date1 = dateInf.get(1);
    	date.date2 = dateInf.get(2);
    	date.date3 = dateInf.get(3);
    	date.date4 = dateInf.get(4);
    	date.date5 = dateInf.get(5);
    	date.date6 = dateInf.get(6);
    	date.date7 = dateInf.get(7);
    	date.date8 = dateInf.get(8);
    	date.date9 = dateInf.get(9);
    	date.date10 = dateInf.get(10);
    	date.date11 = dateInf.get(11);
    	date.date12 = dateInf.get(12);
    	date.date13 = dateInf.get(13);
    	date.date14 = dateInf.get(14);
    	date.date15 = dateInf.get(15);
    	date.date16 = dateInf.get(16);
    	date.date17 = dateInf.get(17);
    	date.date18 = dateInf.get(18);
    	date.date19 = dateInf.get(19);
    	date.date20 = dateInf.get(20);
    	date.date21 = dateInf.get(21);
    	date.date22 = dateInf.get(22);
    	date.date23 = dateInf.get(23);
    	date.date24 = dateInf.get(24);
    	date.date25 = dateInf.get(25);
    	date.date26 = dateInf.get(26);
    	date.date27 = dateInf.get(27);
    	date.date28 = dateInf.get(28);

        setDateList(date);
        
        //System.out.println("loadDate:"+tecinf.teacherId);
    }
    
    

    private void loadStuAppt(String StuID) {
    	mysql connect = new mysql();
    	List<String> list1 = new ArrayList<String>();
    	List<String> list2 = new ArrayList<String>();
    	List<String> list3 = new ArrayList<String>();
    	List<String> list4 = new ArrayList<String>();
    	
    	String sql1 = "select * from appointment where Flag = 0 and StuID = " + StuID;
    	String stuid, stuname, tecid, tecname, week, day, time, flag, index;
    	list1 = connect.select(sql1);
    	System.out.println(sql1);
    	
    	for(int i = 0; i<list1.size(); i=i+6) {
    		stuid = list1.get(i);
    		stuname = get_stuname(list1.get(i));
    		tecid = list1.get(i+1);
    		tecname = get_tecname(list1.get(i+1));
    		week = list1.get(i+2);
    		day = get_day(list1.get(i+3));
    		time = get_time(list1.get(i+3));
    		index = list1.get(i+5);
    		
    		String str = index+" 你预约的"+tecname+"老师的"+week+"周周"+day+"的"+time+"节课尚未处理。";
    		list2.add(str);
    	}
    //	return list2;
    	ActionContext.getContext().put("apptlist1", list2);
    //===================================================================	
    	String sql2 = "select * from appointment where Flag != 0 and StuID = " + StuID;
    	list3 = connect.select(sql2);
    	
    	for(int i = 0; i<list3.size(); i = i +6) {
    		stuid = list3.get(i);
    		stuname = get_stuname(list3.get(i));
    		tecid = list3.get(i+1);
    		tecname = get_tecname(list3.get(i+1));
    		week = list3.get(i+2);
    		day = get_day(list3.get(i+3));
    		time = get_time(list3.get(i+3));
    		index = list3.get(i+5);
    		if(list3.get(i+4).equals("1")) {
    			flag = "已同意";
    		}else {
    			flag = "未同意";
    		}
    		
    		String str = index+"你预约的"+tecname+"老师的"+week+"周周"+day+"的"+time+"节课"+flag;
    		list4.add(str);
    	}
    	ActionContext.getContext().put("apptlist2", list4);
    	
    }
    private String get_stuname(String stuid) {
    	mysql connect = new mysql();
    	String sql = "select Name from student where StuID="+stuid;
    	return connect.select(sql).get(0);
    }
    private String get_tecname(String tecid) {
    	mysql connect = new mysql();
    	String sql = "select Name from teacher where TecID="+tecid;
    	return connect.select(sql).get(0);
    }
    private String get_day(String time) {
    	int n = Integer.valueOf(time)%7;
    	switch(n) {
    	case 1: 
    		return "一";
    	case 2: 
    		return "二";
    	case 3: 
    		return "三";
    	case 4: 
    		return "四";
    	case 5: 
    		return "五";
    	case 6: 
    		return "六";
    	case 0:
    		return "日";
    	}
    	return "ee";
    }
    private String get_time(String time) {
    	int n = (Integer.valueOf(time)-1)/7;
    	switch(n) {
    	case 0: 
    		return "1-2";
    	case 1: 
    		return "3-4";
    	case 2: 
    		return "5-6";
    	case 3: 
    		return "7-8";
    	}
    	return "ee";
    }
    
    private void loadTecAppt(String TecID) {
    	mysql connect = new mysql();
    	List<String> list1 = new ArrayList<String>();
    	List<String> list2 = new ArrayList<String>();
    	List<String> list3 = new ArrayList<String>();
    	List<String> list4 = new ArrayList<String>();
    	
    	String sql1 = "select * from appointment where Flag = 0 and TecID = " + TecID;
    	System.out.println("sql1"+sql1);
    	String stuid, stuname, tecid, tecname, week, day, time, flag, index;
    	list1 = connect.select(sql1);
    	
    	for(int i = 0; i<list1.size(); i=i+6) {
    		stuid = list1.get(i);
    		stuname = get_stuname(list1.get(i));
    		tecid = list1.get(i+1);
    		tecname = get_tecname(list1.get(i+1));
    		week = list1.get(i+2);
    		day = get_day(list1.get(i+3));
    		time = get_time(list1.get(i+3));
    		index = list1.get(i+5);
   // 		String str = "你预约的"+tecname+"老师的"+week+"周周"+day+"的"+time+"节课尚未处理。";
    		String str = index+" "+stuname+"同学预约你第"+week+"周周"+day+"的"+time+"节课"+"尚未处理";
    		list2.add(str);
    	}
    //	return list2;
    	ActionContext.getContext().put("apptlist3", list2);
    	ActionContext.getContext().put("apptlist1", list2);
    	
    //===========================================	
    	String sql2 = "select * from appointment where Flag != 0 and TecID = " + TecID;
    	list3 = connect.select(sql2);
    	
    	for(int i = 0; i<list3.size(); i = i +6) {
    		stuid = list3.get(i);
    		stuname = get_stuname(list3.get(i));
    		tecid = list3.get(i+1);
    		tecname = get_tecname(list3.get(i+1));
    		week = list3.get(i+2);
    		day = get_day(list3.get(i+3));
    		time = get_time(list3.get(i+3));
    		index = list3.get(i+5);
    		if(list3.get(i+4).equals("1")) {
    			flag = "已同意";
    		}else {
    			flag = "未同意";
    		}
    		
    		String str = index+" "+stuname+"同学预约你第"+week+"周周"+day+"的"+time+"节课"+flag;
    		list4.add(str);
    	}
    	ActionContext.getContext().put("apptlist4", list4);
    	ActionContext.getContext().put("apptlist2", list4);
    }
    
    private String ApptIndex() {
        long t = System.currentTimeMillis();//获得当前时间的毫秒数
        Random rd = new Random(t);//作为种子数传入到Random的构造器中
        return String.format("%09d", rd.nextInt(100000000));
    }
    
    
}