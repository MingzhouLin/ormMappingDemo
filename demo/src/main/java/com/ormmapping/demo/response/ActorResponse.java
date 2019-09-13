package com.ormmapping.demo.response;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class ActorResponse {
    int id;
    String name;
    String age;
    String gender;
}
