package config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tx.TxService;

import javax.sql.DataSource;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 16:25
 */

@EnableTransactionManagement
@Configuration
@ComponentScan("tx")
public class Demo22TxAnnotation {

    /**
     * 创建数据源
     */
    @Bean
    public DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mybatis";
        druidDataSource.setUrl(url);
        druidDataSource.setInitialSize(1);
        druidDataSource.setMaxWait(60000);
        return druidDataSource;
    }

    /**
     * 创建模板
     * @return
     */
    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    /**
     * 配置文件中添加事务管理器
     * @return
     */
    @Bean
    public PlatformTransactionManager platformTransactionManager(){
        return  new DataSourceTransactionManager(dataSource());
    }



}
