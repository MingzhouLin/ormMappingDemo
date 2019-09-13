package com.ormmapping.demo.dto;

import com.ormmapping.demo.Entity.ActorEntity;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class VideoDto {
    int id;
    int actorId;
    ActorEntity actorEntity;
    String title;
    String uploader;
}
