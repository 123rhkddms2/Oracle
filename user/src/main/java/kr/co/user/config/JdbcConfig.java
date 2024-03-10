package kr.co.user.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class JdbcConfig {

    @Bean
    public DataSource dataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        
        // 학원에서 하면 url끝에 orcl사용
        // 집에서 하면 oracle 버전 다르기 때문에 xe사용
        
        dataSource.setUrl("jdbc:oracle:thin:@//127.0.0.1:1521/orcl");
        //dataSource.setUrl("jdbc:oracle:thin:@//127.0.0.1:1521/xe");

        dataSource.setUsername("rhkddms");
        dataSource.setPassword("1234");

        // DBCP2 옵션 설정
        dataSource.setMaxTotal(13); // 최대 연결 풀 크기 설정
        dataSource.setMaxIdle(13);  // 최대 유휴 연결 풀 크기 설정

        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

}