package com.ormmapping.demo;

import com.ormmapping.demo.Entity.ActorEntity;
import com.ormmapping.demo.Entity.VideoEntity;
import com.ormmapping.demo.dto.VideoDto;
import com.ormmapping.demo.mapping.ActorEntityToResponse;
import com.ormmapping.demo.mapping.VideoDtoResponseMapper;
import com.ormmapping.demo.mapping.VideoEntityResponseMapper;
import com.ormmapping.demo.response.ActorResponse;
import com.ormmapping.demo.response.VideoResponse;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements ApplicationRunner {
	@Autowired
	ActorEntityToResponse actorMapper;

	@Autowired
	VideoEntityResponseMapper videoMapper;

	@Autowired
	VideoDtoResponseMapper videoDtoResponseMapper;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public void run(ApplicationArguments arguments){
		ActorEntity actorEntity = ActorEntity.builder().id(1).age("18").gender("female").name("lisa").build();
		VideoEntity videoEntity = VideoEntity.builder().id(1).actorEntity(actorEntity).title("fromBrazzer").uploader("someone").build();
		ActorResponse actorResponse = actorMapper.actorEntityToResponse(actorEntity);
		VideoResponse videoResponse = videoMapper.videoEntityToResponse(videoEntity);
		VideoDto videoDto = videoDtoResponseMapper.videoResponseToDto(videoResponse);
		VideoDto videoDto1 = videoMapper.videoEntityToDto(videoEntity);
		System.out.println(actorResponse.toString());
		System.out.println(videoResponse.toString());
		System.out.println(videoDto.toString());
		System.out.println(videoDto1);
	}
}
