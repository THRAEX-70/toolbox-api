package org.thraex;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 鬼王
 * @date 2020/04/10 14:23
 */
@SpringBootApplication
@EnableSwagger2Doc
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
