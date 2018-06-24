
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class DB {
 
private static Connection con = null;
private static Statement statement = null;
private static ResultSet set = null;
private String sql = "";
 
// ����SqlServer JDBC����
private static String driverNameOfSqlServer = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
// ���ݿ��û���
private static String DatabaseUser = "hsf";
// ���ݿ�����
private static String DatabasePassword = "201535020412";

// URL
private static String DatabaseUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=HSFDB " ;
 
//��ȡһ�����ݿ������
public Connection getConnection() {
try {
//ע����������
Class.forName(driverNameOfSqlServer);
// ��ȡ����
con = DriverManager.getConnection(DatabaseUrl, DatabaseUser,DatabasePassword);
} catch (Exception e) {
System.out.println("getConnection���ִ���");
e.printStackTrace();
}
return con;
}
//�����Ự
public Statement getStatement(Connection con){
if(con != null){
try {
statement = con.createStatement();
return statement;
} catch (SQLException e) {
System.out.println("getStatement���ִ���");
e.printStackTrace();
}
}
return null;
}
//��ѯ
public ResultSet getResultSetQuery(Statement statement,String sql) {
if(statement != null){
try {
set = statement.executeQuery(sql);
return set;
} catch (SQLException e) {
System.out.println("getResultSetQuery���ִ���");
e.printStackTrace();
}
}
return null;
}
//���ӣ��޸ģ�ɾ����¼
public void getResultSetUpdate(Statement statement,String sql) {
if(statement != null){
try {
statement.executeUpdate(sql);
} catch (SQLException e) {
System.out.println("getResultSetUpdate���ִ���");
e.printStackTrace();
}
}
}
//�ر�����
public static void colse(Connection con){
     if(con != null){
         try {
             con.close();
        } catch (SQLException e) {
              e.printStackTrace();
        }
    }
}
//�رջỰ
public static void close(Statement  statement){
if(statement != null){
try {
statement.close();
} catch (SQLException e) {
e.printStackTrace();
}
}
}
//�رղ�ѯ��
public static void close(ResultSet set){
    if(set != null){
        try {
             set.close();
       } catch (SQLException e) {
             e.printStackTrace();
           }
    }
}


}