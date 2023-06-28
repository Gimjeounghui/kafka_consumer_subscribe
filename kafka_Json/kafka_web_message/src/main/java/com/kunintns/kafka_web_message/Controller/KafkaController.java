package com.kunintns.kafka_web_message.Controller;

import com.kunintns.kafka_web_message.Service.KafkaProducerService;
import com.kunintns.kafka_web_message.Service.KafkaConsumerService;
import com.kunintns.kafka_web_message.Vo.MessageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class KafkaController {

    // KafkaProducerService 의존성 주입
    private final KafkaProducerService kafkaProducerService;

    private final KafkaConsumerService kafkaConsumerService;

    @Autowired
    public KafkaController(KafkaProducerService kafkaProducerService, KafkaConsumerService kafkaConsumerService) {
        this.kafkaProducerService = kafkaProducerService;
        this.kafkaConsumerService = kafkaConsumerService;
    }

    //sendMessageToKafka 메서드 : HTTP POST 요청 처리
    @PostMapping("/message")
    public String sendMessageToKafka(@RequestBody MessageVO message) throws Exception {
        // @RequestBody : 요청의 본문에서 MessageVO 객체 바인딩

        // 메시지를 Kafka에 전송
        kafkaProducerService.sendMessage(message);
        return "success";
    }
}
