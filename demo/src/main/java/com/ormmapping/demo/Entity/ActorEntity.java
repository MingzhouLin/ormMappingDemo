package com.ormmapping.demo.Entity;

import lombok.*;

@ToString
@Data
@Getter
@Setter
@Builder
public class ActorEntity {
    private int id;
    private String name;
    private String age;
    private String gender;
}
