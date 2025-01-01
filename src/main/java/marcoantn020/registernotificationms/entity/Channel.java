package marcoantn020.registernotificationms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_channel")
public class Channel {

    @Id
    @Column(name = "channel_id")
    private Long channelId;

    @Column(name = "description")
    private String description;

    public Channel() {
    }

    public Channel(Long channelId, String description) {
        this.channelId = channelId;
        this.description = description;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public enum values {
        EMAIL(1L,"EMAIL"),
        SMS(2L,"SMS"),
        WHATSAPP(3L,"WHATSAPP");

        private Long id;
        private String description;

        values(Long id, String description) {
            this.id = id;
            this.description = description;
        }

        public Channel toChannel() {
            return new Channel(id, description);
        }
    }
}
