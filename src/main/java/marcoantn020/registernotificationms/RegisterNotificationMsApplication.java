package marcoantn020.registernotificationms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RegisterNotificationMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterNotificationMsApplication.class, args);
    }

}
