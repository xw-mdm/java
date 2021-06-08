import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-06-03
 * Time: 19:59
 */
//使用jdbc查找
public class Testjdbc {
    public static void main(String[] args) throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        //b)设置一些属性
        ((MysqlDataSource) dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/rocket2021?characterEncoding=utf-8&&useSSL=false");

        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("wangxp184219");
        Connection connection=dataSource.getConnection();
        String sql="select * from exam_result";

        PreparedStatement statement=connection.prepareStatement(sql);

        ResultSet resultSet=statement.executeQuery();
        //4.通过result 获取结果内容   遍历集合
        //每次调用next  类似i++  遍历完毕 返回false
        while(resultSet.next()){
            //可以获取一行数据
           int id= resultSet.getInt("id");
            String name=resultSet.getString("name");
            double chinese=resultSet.getDouble("chinese");
            double math=resultSet.getDouble("math");
            double english=resultSet.getDouble("english");
            System.out.println(id+" "+name+" "+chinese+" "+math+" "+english+" ");
        }
        resultSet.close();
        statement.close();
        connection.close();




    }
}

