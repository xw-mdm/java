import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-06-03
 * Time: 20:52
 */
//通过这个类  保证Datasource 唯一
public class DButil {
    private  static DataSource dataSource=null;
    public static  DataSource getDataSource(){
        if(dataSource==null){
            dataSource=new MysqlDataSource();
           ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/rocket2021?characterEncoding=utf-8&&useSSL=false");
           ((MysqlDataSource)dataSource).setUser("root");
           ((MysqlDataSource)dataSource).setPassword("wangxp184219");
            }
        return  dataSource;
        }
    }

