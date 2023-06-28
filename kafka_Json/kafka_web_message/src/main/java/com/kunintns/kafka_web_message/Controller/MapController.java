package com.kunintns.kafka_web_message.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kunintns.kafka_web_message.Service.KafkaConsumerService;
import com.kunintns.kafka_web_message.Service.KafkaProducerService;
import com.kunintns.kafka_web_message.Vo.MessageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/view")
public class MapController {

    private final KafkaConsumerService kafkaConsumerService;

    @Autowired
    public MapController(KafkaConsumerService kafkaConsumerService) {
        this.kafkaConsumerService = kafkaConsumerService;
    }

    @RequestMapping("/map")
    public String subscribe(/*Model model, KafkaConsumerService jsonData*/) {

        //model.addAttribute("jsonData", jsonData);
        return "/mapbox";
    }

    public static List<MessageVO> consumeRecord(MessageVO message, Model model) throws JsonProcessingException {

        List<MessageVO> jsonData = null;
        return null;
    }
}
