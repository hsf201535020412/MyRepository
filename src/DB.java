
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
 
// 加载SqlServer JDBC驱动
private static String driverNameOfSqlServer = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
// 数据库用户名
private static String DatabaseUser = "hsf";
// 数据库密码
private static String DatabasePassword = "201535020412";

// URL
private static String DatabaseUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=HSFDB " ;
 
//获取一个数据库的连接
public Connection getConnection() {
try {
//注册驱动程序
Class.forName(driverNameOfSqlServer);
// 获取连接
con = DriverManager.getConnection(DatabaseUrl, DatabaseUser,DatabasePassword);
} catch (Exception e) {
System.out.println("getConnection出现错误");
e.printStackTrace();
}
return con;
}
//创建会话
public Statement getStatement(Connection con){
if(con != null){
try {
statement = con.createStatement();
return statement;
} catch (SQLException e) {
System.out.println("getStatement出现错误");
e.printStackTrace();
}
}
return null;
}
//查询
public ResultSet getResultSetQuery(Statement statement,String sql) {
if(statement != null){
try {
set = statement.executeQuery(sql);
return set;
} catch (SQLException e) {
System.out.println("getResultSetQuery出现错误");
e.printStackTrace();
}
}
return null;
}
//增加，修改，删除记录
public void getResultSetUpdate(Statement statement,String sql) {
if(statement != null){
try {
statement.executeUpdate(sql);
} catch (SQLException e) {
System.out.println("getResultSetUpdate出现错误");
e.printStackTrace();
}
}
}
//关闭连接
public static void colse(Connection con){
     if(con != null){
         try {
             con.close();
        } catch (SQLException e) {
              e.printStackTrace();
        }
    }
}
//关闭会话
public static void close(Statement  statement){
if(statement != null){
try {
statement.close();
} catch (SQLException e) {
e.printStackTrace();
}
}
}
//关闭查询集
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