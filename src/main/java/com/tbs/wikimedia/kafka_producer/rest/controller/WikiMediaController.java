package com.tbs.wikimedia.kafka_producer.rest.controller;

import com.tbs.wikimedia.kafka_producer.stream.consumer.WikiMediaStreamConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/wikimedia")
@RequiredArgsConstructor
public class WikiMediaController {
    private final WikiMediaStreamConsumer wikiMediaStreamConsumer;

    @GetMapping
    public void startPublishing() {
        wikiMediaStreamConsumer.consumeStreamAndPublish();
    }

}
