package smarttab.supportportal.impl.config;

import org.springframework.context.annotation.*;
import org.springframework.amqp.core.Queue;
import smarttab.supportportal.impl.test.*;

@Profile({"tut1","hello-world"})
@Configuration
public class RabbitTestConfig {

    @Bean
    public Queue hello() {
        return new Queue("hello");
    }

    @Profile("receiver")
    @Bean
    public Tut1Receiver receiver() {
        return new Tut1Receiver();
    }

    @Profile("sender")
    @Bean
    public Tut1Sender sender() {
        return new Tut1Sender();
    }

}
