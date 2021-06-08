import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-06-01
 * Time: 21:12
 */

public class Test {
    public static void main(String[] args) throws SQLException {
        //通过代码从控制台插入
        Scanner scanner=new Scanner(System.in);
        int id=scanner.nextInt();
        String name=scanner.next();
        double chinese=scanner.nextDouble();
        double math=scanner.nextDouble();
        double english=scanner.nextDouble();




        //1.先和数据库建立连接
        //a)建立一个数据源（Datasource）
        DataSource dataSource=new MysqlDataSource();
        //b)设置一些属性
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/rocket2021?characterEncoding=utf-8&&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("wangxp184219");
        //c)getconnection() 建立连接
            Connection connection = dataSource.getConnection();//大概率会连接失败   创建多个
        //2.拼装SQl语句
        //String sql="insert into exam_result values(10,'汤老师',50,60,80)";
        //语句对象
        //可以动态的构造sql
        String sql="insert into exam_result values(?,?,?,?,?)";
        PreparedStatement statement =connection.prepareStatement(sql);
        //将这几个值进行替换
        statement.setInt(1,id);
        statement.setString(2,name);
        statement.setDouble(3,chinese);
        statement.setDouble(4,math);
        statement.setDouble(5,english);
        System.out.println(statement.toString());

        //3.执行sql
        //执行的是select使用的 executeQuery
        //增删改  都是executeUpdate;
        int ret=statement.executeUpdate();//表示影响了几行数据；

        System.out.println(ret);
        //4.收尾   释放前面申请到的资源。
        statement.close();
        connection.close();

    }
}
