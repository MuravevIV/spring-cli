package com.ilyamur.springcli.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(ApplicationProfile.PROD)
public class ApplicationConfiguration {
}
