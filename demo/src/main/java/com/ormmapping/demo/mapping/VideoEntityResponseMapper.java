package com.ormmapping.demo.mapping;

import com.ormmapping.demo.Entity.VideoEntity;
import com.ormmapping.demo.dto.VideoDto;
import com.ormmapping.demo.response.VideoResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface VideoEntityResponseMapper {
    @Mappings(
            @Mapping(target = "actorId", source = "actorEntity.id")
    )
    VideoResponse videoEntityToResponse(VideoEntity videoEntity);

    VideoDto videoEntityToDto(VideoEntity videoEntity);
}
