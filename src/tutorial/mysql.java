package tutorial;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import java.sql.Connection;


public class mysql {
    private String dbDriver="com.mysql.jdbc.Driver";   
    //private String dbUrl="jdbc:mysql://localhost:3306/teacher?characterEncoding=utf8&useSSL=true";//����ʵ������仯  
    //private String dbUser="root";  
    //private String dbPass="HljHhZMK661530";
    
	private String dbUrl="jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_teachermanagement?characterEncoding=utf8"; 
	 
   private String dbUser="1own5ykl10";  
   private String dbPass="k1zihx5wz4jhjih3ilz4xi52yy0yw4mjx4hw2l5l";
    
    public Connection getConn() 
    {  
        Connection conn=null;  
        try  
        {  
            Class.forName(dbDriver);  
        }  
        catch (ClassNotFoundException e)  
        {  
            e.printStackTrace();  
        }  
        try  
        {  
            conn = DriverManager.getConnection(dbUrl,dbUser,dbPass);//ע������������  
        }  
        catch (SQLException e)  
        {  
            e.printStackTrace();  
        }  
        return conn;  
    }

public int insert(String sql)  
{  
    int i=0;  
    /*String sql="insert into author(authorid,name,age,country) values(?,?,?,?)"; 
    String sql0="insert into book(isbn,title,authorid,publisher,publishdate,price) values(?,?,?,?,?,?)";
    */
    Connection cnn=getConn();  

    try{  
        PreparedStatement preStmt =cnn.prepareStatement(sql);  
        i=preStmt.executeUpdate();  
    }  
    catch (SQLException e)  
    {  
        e.printStackTrace();  
    }
    close(cnn);
    return i;
}  
public int update(String sql)
{  
    int i=0;  
    /*String sql="update author set  authorid=?,name=?,age=?,country=? where authorid=?";//ע��Ҫ��where����  
    */
    Connection cnn=getConn();  


    try{  
        PreparedStatement preStmt =cnn.prepareStatement(sql);  
        i=preStmt.executeUpdate();  
    }  
    catch (SQLException e)  
    {  
        e.printStackTrace();  
    }
    close(cnn);
    return i;//����Ӱ���������1Ϊִ�гɹ�  
}  

public List<String> select(String sql)
{  
    int i;
    Connection cnn = getConn();//�˴�Ϊͨ���Լ�д�ķ���getConn()�������
    List<String> list = new LinkedList<String>();
    try  
    {  
        Statement stmt = cnn.createStatement();  
        ResultSet rs = stmt.executeQuery(sql);  
        while(rs.next())  
        {  
            for(i = 1;i<=rs.getMetaData().getColumnCount();i++){
            list.add(rs.getString(i));}
        }  
        //���Խ����ҵ���ֵд���࣬Ȼ�󷵻���Ӧ�Ķ���  
    }  
    catch (SQLException e)  
    {  
        e.printStackTrace();  
    }
    close(cnn);
    return list;  
}  
public int delete(String sql)  
{  
    /*String sql = "delete from author where authorid=?"; */ 
    int i=0;  
    Connection conn = getConn();//�˴�Ϊͨ���Լ�д�ķ���getConn()�������  
    try  
    {  
        Statement stmt = conn.createStatement();  
        i = stmt.executeUpdate(sql);  
    }  
    catch (SQLException e)  
    {  
        e.printStackTrace();  
    }
    close(conn);
    return i;//������ص���1����ִ�гɹ�;  
}  
public static void close(Connection conn) {
    if(conn != null) {
      try {
          conn.close();
      } catch(Exception e) {
     e.printStackTrace();
      }
      conn = null;
    }
  }
}
