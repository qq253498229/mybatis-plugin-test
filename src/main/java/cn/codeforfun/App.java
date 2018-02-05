package cn.codeforfun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangbin
 */
@SpringBootApplication
@MapperScan(basePackages = "cn.codeforfun.**.mapper")
public class App {
  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }
}
