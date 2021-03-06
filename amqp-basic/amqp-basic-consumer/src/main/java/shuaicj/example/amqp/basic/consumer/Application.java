package shuaicj.example.amqp.basic.consumer;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Spring boot app.
 *
 * @author shuaicj 2017/07/21
 */
@SpringBootApplication
public class Application {

    static final String Q = "hello-q-basic";

    @Bean
    Queue queue() {
        return new Queue(Q);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
