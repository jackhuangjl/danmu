package dao;

import java.sql.*;

public class InformationDao {
	
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    static final String DB_URL = "jdbc:mysql://localhost:3306/test";
	 
	    // ���ݿ���û��������룬��Ҫ�����Լ�������
	    static final String USER = "root";
	    static final String PASS = "hjlwl130112";
	 
	    public ResultSet GetMessage(String sql) {
	        Connection conn = null;
	        Statement stmt = null;
	        ResultSet rs  = null;
	        try{
	            // ע�� JDBC ����
	            Class.forName("com.mysql.jdbc.Driver");
	        
	            // ������
	            System.out.println("�������ݿ�...");
	            conn = DriverManager.getConnection(DB_URL,USER,PASS);
	        
	            // ִ�в�ѯ
	            System.out.println(" ʵ����Statement��...");
	            stmt = conn.createStatement();

	            rs = stmt.executeQuery(sql);
	        }catch(SQLException se){
	            // ���� JDBC ����
	            se.printStackTrace();
	        }catch(Exception e){
	            // ���� Class.forName ����
	            e.printStackTrace();
	        }finally{

	        }
	       return rs;
	    }

}
