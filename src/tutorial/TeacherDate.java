package tutorial;

import java.util.List;

import tutorial.mysql;

public class TeacherDate {

	static String TecID;
	static String weekNum;
	static List<String> dateList;
	
	public static void getDateList() {
		mysql connect = new mysql();
		String sql = "select * from week" + weekNum + " where TecID = "
				+ TecID;
		dateList = connect.select(sql);
		
	}
	
	public static void main(final String arg[]) {
		TecID = "0123";
		weekNum = "15";
		getDateList();
		System.out.println(dateList);
	}
}
