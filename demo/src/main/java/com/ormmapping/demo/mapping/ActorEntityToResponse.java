package com.ormmapping.demo.mapping;

import com.ormmapping.demo.Entity.ActorEntity;
import com.ormmapping.demo.response.ActorResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActorEntityToResponse {
    ActorResponse actorEntityToResponse(ActorEntity actorEntity);
    ActorEntity actorResponseToEntity(ActorResponse actorResponse);
}
