package com.jts.redis_pub_sub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private MessagePublisher messagePublisher;

    @GetMapping("/publish")
    public String publishMessage(@RequestParam String message) {
        messagePublisher.publish("your-channel", message);
        return "Message published!";
    }
}
