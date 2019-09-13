package com.ormmapping.demo.mapping;

import com.ormmapping.demo.dto.VideoDto;
import com.ormmapping.demo.response.VideoResponse;
import lombok.ToString;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VideoDtoResponseMapper {
    VideoDto videoResponseToDto(VideoResponse videoResponse);
}
