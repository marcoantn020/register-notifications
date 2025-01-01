package marcoantn020.registernotificationms.service;

import marcoantn020.registernotificationms.controller.dto.ScheduleNotificationDto;
import marcoantn020.registernotificationms.entity.Notification;
import marcoantn020.registernotificationms.entity.Status;
import marcoantn020.registernotificationms.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    @Transactional
    public void scheduleNotification(ScheduleNotificationDto dto) {
        notificationRepository.save(dto.toEntity());
    }

    public Optional<Notification> findById(Long notificationId) {
        return notificationRepository.findById(notificationId);
    }

    @Transactional
    public void cancelNotification(Long notificationId) {
        var notification = notificationRepository.findById(notificationId);
        if (notification.isPresent()) {
            notification.get().setStatus(Status.Values.CANCELED.toStatus());
            notificationRepository.save(notification.get());
        }
    }

    public void checkAndSend(LocalDateTime dateTime) {
        List<Notification> notifications = notificationRepository.findByStatusInAndDateTimeBefore(List.of(
                Status.Values.PENDING.toStatus(),
                Status.Values.ERROR.toStatus()
        ), dateTime);

        notifications
                .forEach(n -> {
                    // send notification
                    n.setStatus(Status.Values.SUCCESS.toStatus());
                    notificationRepository.save(n);
                });
    }
}
