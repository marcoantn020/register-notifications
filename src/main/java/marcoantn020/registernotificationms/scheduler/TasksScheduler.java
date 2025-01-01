package marcoantn020.registernotificationms.scheduler;

import marcoantn020.registernotificationms.service.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Component
public class TasksScheduler {

    private static final Logger logger = LoggerFactory.getLogger(TasksScheduler.class);

    @Autowired
    private NotificationService notificationService;

    @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.MINUTES)
    public void checkTasksPending() {
        var datetime = LocalDateTime.now();
        logger.info("Running at {}", datetime);
        notificationService.checkAndSend(datetime);
    }
}
