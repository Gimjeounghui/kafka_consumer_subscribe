package com.kunintns.kafka_web_message.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kunintns.kafka_web_message.Vo.MessageVO;
import org.apache.kafka.common.protocol.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/* 주어진 MessageVO 객체를 Kafka에 전송하는 class. 해당 메시지의 시간출력과 KafkaTemplate을 사용하여 메시지를 지정된 topic으로 전송 */
@Service
public class KafkaProducerService {
    private final String topic = "3D-Digital-Twin";
    // KafkaTemplate 인스턴스로 KafkaTemplate<String, MessageVO> 타입으로 주입. Kafka 메시지 전송가능
    private final KafkaTemplate<String, MessageVO> kafkaTemplate;

    @Autowired
    public KafkaProducerService(KafkaTemplate<String, MessageVO> kafkaTemplate) {

        this.kafkaTemplate = kafkaTemplate;
    }

    // sendMessage() : MessageVO 객체를 인자로 받아 Kafka 메시지 전송
    public void sendMessage(MessageVO message) throws Exception {

        System.out.println("Producer: " + message.getTime());
        // 메시지를 지정된 topic으로 전송
        kafkaTemplate.send(topic, message);
    }
}