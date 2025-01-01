package marcoantn020.registernotificationms.controller.dto;

import marcoantn020.registernotificationms.entity.Channel;
import marcoantn020.registernotificationms.entity.Notification;
import marcoantn020.registernotificationms.entity.Status;

import java.time.LocalDateTime;

public record ScheduleNotificationDto (LocalDateTime dateTime,
                                       String destination,
                                       String message,
                                       Channel.values channel){
    public Notification toEntity() {
        return new Notification(
                dateTime,
                destination,
                message,
                channel.toChannel(),
                Status.Values.PENDING.toStatus()
        );
    }
}
