package com.ormmapping.demo.Entity;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class VideoEntity {
    int id;
    ActorEntity actorEntity;
    String title;
    String uploader;
}
