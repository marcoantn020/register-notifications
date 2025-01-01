package marcoantn020.registernotificationms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_status")
public class Status {

    @Id
    @Column(name = "status_id")
    private Long statusId;

    @Column(name = "description")
    private String description;

    public Status() {
    }

    public Status(Long statusId, String description) {
        this.statusId = statusId;
        this.description = description;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public enum Values {
        PENDING(1L,"PENDING"),
        SUCCESS(2L,"SUCCESS"),
        ERROR(3L,"ERROR"),
        CANCELED(4L,"CANCELED");

        private Long id;
        private String description;

        Values(Long id, String description) {
            this.id = id;
            this.description = description;
        }

        public Status toStatus() {
            return new Status(id, description);
        }
    }
}
