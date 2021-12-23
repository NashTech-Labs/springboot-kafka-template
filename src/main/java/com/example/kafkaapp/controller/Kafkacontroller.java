package com.example.kafkaapp.controller;

import com.example.kafkaapp.services.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafkaapp")
public class Kafkacontroller {
    @Autowired
    Producer producer;

    @PostMapping(value = "/post")
    public void sendMessage(@RequestParam("msg") String msg) {
        this.producer.sendMessageToTopic(msg);
    }

}
