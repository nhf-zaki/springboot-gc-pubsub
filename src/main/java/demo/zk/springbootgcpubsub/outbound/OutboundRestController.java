package demo.zk.springbootgcpubsub.outbound;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class OutboundRestController {

    private final OutboundConfiguration.PubsubOutboundGateway messagingGateway;

    @PostMapping("/send")
    public void sendMessage(@RequestBody String message) {
        log.info("Send to outbound channel {}", message);
        messagingGateway.sendToPubsub(message);
    }
}
