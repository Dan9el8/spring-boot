package com.author.kickstart.service;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Value(“${server.port}”)
    private int serverPort;
    @PostConstruct
    public void postConstruct() {
        System.out.println(serverPort);
        }
    }
