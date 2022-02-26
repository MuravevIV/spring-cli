package com.ilyamur.springcli.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

@Configuration
@Profile(ApplicationProfile.PROD)
public class ApplicationConfiguration {

    @Bean
    public FileSystem fileSystem() {
        return FileSystems.getDefault();
    }
}
