package com.kunintns.kafka_web_message.Vo;

// JSON 데이터를 보낼 VO
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import com.fasterxml.jackson.databind.ObjectMapper;
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MessageVO {

   private String id;

   private String position;

   private String lng;

   private String lat;

   private String time;

}