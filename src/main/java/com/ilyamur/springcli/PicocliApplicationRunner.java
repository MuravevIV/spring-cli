package com.ilyamur.springcli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import picocli.CommandLine;

@Component
public class PicocliApplicationRunner implements CommandLineRunner {

    @Autowired
    private PicocliApplication picocliApplication;

    @Override
    public void run(String... args) {
        (new CommandLine(picocliApplication)).execute(args);
    }
}
