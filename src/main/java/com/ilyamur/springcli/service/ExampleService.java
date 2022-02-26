package com.ilyamur.springcli.service;

import com.ilyamur.springcli.repository.ApplicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    private static final Logger LOG = LoggerFactory.getLogger(ExampleService.class);

    @Autowired
    private ApplicationRepository applicationRepository;

    public int run(String input, String output) {
        LOG.info("ExampleService::run('{}', '{}')", input, output);
        return applicationRepository.load(input);
    }
}
