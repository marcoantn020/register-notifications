package marcoantn020.registernotificationms.repository;

import marcoantn020.registernotificationms.entity.Notification;
import marcoantn020.registernotificationms.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByStatusInAndDateTimeBefore(List<Status> status, LocalDateTime dateTime);
}
