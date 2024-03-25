package com.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.enduser.AppConstants;

@Configuration
public class KafkaConsumer {

	@KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC, groupId = AppConstants.GROUP_ID)
	public void consumeUpdatedLocationFromPublisher(String value) {
		System.out.println(value);
	}

}
