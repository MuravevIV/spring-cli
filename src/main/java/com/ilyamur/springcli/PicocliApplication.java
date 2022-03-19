package com.ilyamur.springcli;

import com.ilyamur.springcli.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import picocli.CommandLine;

@Controller
@CommandLine.Command(version = "1.0.0-SNAPSHOT", mixinStandardHelpOptions = true)
public class PicocliApplication implements Runnable {

    @SuppressWarnings("FieldMayBeFinal")
    @CommandLine.Option(names = {"-i", "--input"}, required = true, description = "Input directory")
    private String input;

    @SuppressWarnings("FieldMayBeFinal")
    @CommandLine.Option(names = {"-o", "--output"}, required = true, description = "Output directory")
    private String output;

    @Autowired
    private ExampleService exampleService;

    @Override
    public void run() {
        exampleService.run(input, output);
    }
}
