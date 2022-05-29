package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * @author zzl
 * @Date 2022/5/29
 * @description
 */
@SpringBootApplication
public class NacosConfigApplication {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext run = SpringApplication.run(NacosConfigApplication.class, args);
        while (true) {
            String userName = run.getEnvironment().getProperty("user.name");
            String userAge = run.getEnvironment().getProperty("user.age");
            String config = run.getEnvironment().getProperty("user.config");
            System.out.println("userName :" + userName + ";age :" + userAge+";config :"+config);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
