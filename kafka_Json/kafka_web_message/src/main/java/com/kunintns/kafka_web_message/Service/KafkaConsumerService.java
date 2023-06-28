package com.kunintns.kafka_web_message.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kunintns.kafka_web_message.Vo.MessageVO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;

@Service
public class KafkaConsumerService {

    // json 데이터를 담을 변수
    private ObjectMapper objectMapper = new ObjectMapper();
    private KafkaConsumerService jsonData; // JSON 데이터를 저장할 객체

    // kafka에서 메세지를 수신하면 호출되는 메서드
    @KafkaListener(topics = "3D-Digital-Twin", groupId = "3D-Digital-Twin", containerFactory = "kafkaListener")
    public List<MessageVO> consumeRecord(MessageVO message) throws JsonProcessingException {
    //     void

        /* Kafka topic에서 받아온 MessageVO */
        System.out.println("@@@@ 3D-Digital-Twin topic 데이터 구독성공 @@@@");
        System.out.println(message);
        /*
        System.out.println("ID = " + message.getId());
        System.out.println("position = " + message.getPosition());
        System.out.println("lng = " + message.getLng());
        System.out.println("lat = " + message.getLat());
        System.out.println("latitude = " + message.getTime());
        */

        return List<MessageVO>;
    }
}

/*
@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "input100-topic", groupId = "topic", containerFactory = "kafkaListener")
    public void consumeRecord(ConsumerRecord<String, MessageVO> record) {
        MessageVO message = record.value();
        System.out.println(String.format("Consumed message: %s", message));
    }
}
*/