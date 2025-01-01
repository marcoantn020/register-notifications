package marcoantn020.registernotificationms.controller;

import marcoantn020.registernotificationms.controller.dto.ScheduleNotificationDto;
import marcoantn020.registernotificationms.entity.Notification;
import marcoantn020.registernotificationms.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping
    public ResponseEntity<?> scheduleNotification(@RequestBody ScheduleNotificationDto dto) {
        notificationService.scheduleNotification(dto);
        return ResponseEntity.accepted().build();
    }

    @GetMapping("/{notificationId}")
    public ResponseEntity<Notification> getNotification(@PathVariable Long notificationId) {
        var notification = notificationService.findById(notificationId);
        return notification.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }

    @DeleteMapping("/{notificationId}")
    public ResponseEntity<Void> cancelNotification(@PathVariable Long notificationId) {
        notificationService.cancelNotification(notificationId);
        return ResponseEntity.noContent().build();
    }

}
