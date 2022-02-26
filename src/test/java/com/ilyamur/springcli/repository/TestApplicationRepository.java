package com.ilyamur.springcli.repository;

import com.ilyamur.springcli.configuration.ApplicationProfile;
import com.ilyamur.springcli.service.ExampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(ApplicationProfile.TEST)
public class TestApplicationRepository implements ApplicationRepository {

    private static final Logger LOG = LoggerFactory.getLogger(ExampleService.class);

    @Override
    public int load(String input) {
        LOG.info("TestApplicationRepository::load('{}')", input);
        return 1;
    }
}
