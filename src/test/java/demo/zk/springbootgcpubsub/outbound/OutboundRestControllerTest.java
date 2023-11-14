package demo.zk.springbootgcpubsub.outbound;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OutboundRestControllerTest {
    @Autowired
    OutboundRestController controller;

    @Test
    void sendMessage() {
        controller.sendMessage("Hello hello");
        controller.sendMessage("Test 1 2 3");
    }

}