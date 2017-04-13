package dao;

import java.sql.*;

public class InformationDao {
	
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    static final String DB_URL = "jdbc:mysql://localhost:3306/test";
	 
	    // 数据库的用户名与密码，需要根据自己的设置
	    static final String USER = "root";
	    static final String PASS = "hjlwl130112";
	 
	    public ResultSet GetMessage(String sql) {
	        Connection conn = null;
	        Statement stmt = null;
	        ResultSet rs  = null;
	        try{
	            // 注册 JDBC 驱动
	            Class.forName("com.mysql.jdbc.Driver");
	        
	            // 打开链接
	            System.out.println("连接数据库...");
	            conn = DriverManager.getConnection(DB_URL,USER,PASS);
	        
	            // 执行查询
	            System.out.println(" 实例化Statement对...");
	            stmt = conn.createStatement();

	            rs = stmt.executeQuery(sql);
	        }catch(SQLException se){
	            // 处理 JDBC 错误
	            se.printStackTrace();
	        }catch(Exception e){
	            // 处理 Class.forName 错误
	            e.printStackTrace();
	        }finally{

	        }
	       return rs;
	    }

}
