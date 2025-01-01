package marcoantn020.registernotificationms.config;

import marcoantn020.registernotificationms.entity.Channel;
import marcoantn020.registernotificationms.entity.Status;
import marcoantn020.registernotificationms.repository.ChannelRepository;
import marcoantn020.registernotificationms.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DataLoader implements CommandLineRunner {

    @Autowired
    private ChannelRepository channelRepository;

    @Autowired
    private StatusRepository statusRepository;

    @Override
    public void run(String... args) throws Exception {
        Arrays.stream(Channel.values.values())
                .map(Channel.values::toChannel)
                .forEach(channelRepository::save);

        Arrays.stream(Status.Values.values())
                .map(Status.Values::toStatus)
                .forEach(statusRepository::save);

    }
}
