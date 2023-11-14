package demo.zk.springbootgcpubsub.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "gc.pubsub")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PubSubConfiguration {
    private String topic;
    private String subscription;
}
