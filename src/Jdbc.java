import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by user on 2018/7/14.
 * 通过jdbc
 */
public class Jdbc
{
    private  void testConnection(){
        //1加载驱动

        try {
            Class.forName(" com.mysql.jdbc.Driver");
            //2创建连接
            String dbURL =  "jdbc：mysql：//localhost:3306/hnb";
            //3创建数据库连接
            Connection connection = DriverManager.getConnection(dbURL,"root","root");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }}
        public static  void main (String [] args){
            Jdbc demo = new Jdbc();
        demo.testConnection();
        }


        //
        //



}

