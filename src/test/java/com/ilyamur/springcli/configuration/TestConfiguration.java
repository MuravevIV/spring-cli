package com.ilyamur.springcli.configuration;

import com.ilyamur.springcli.Application;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan(basePackageClasses = Application.class)
@Profile(ApplicationProfile.TEST)
public class TestConfiguration {
}
