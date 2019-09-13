package com.ormmapping.demo.response;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class VideoResponse {
    int id;
    int actorId;
    String title;
    String uploader;
}
