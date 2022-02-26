package com.ilyamur.springcli;

import com.ilyamur.springcli.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import picocli.CommandLine;

@Controller
@CommandLine.Command(name = "file-seq-renamer", version = "1.0.0-SNAPSHOT", mixinStandardHelpOptions = true)
public class PicocliApplication implements Runnable {

    @SuppressWarnings("FieldMayBeFinal")
    @CommandLine.Option(names = {"-i", "--input"}, required = true, description = "Input directory")
    private String input;

    @SuppressWarnings("FieldMayBeFinal")
    @CommandLine.Option(names = {"-o", "--output"}, required = true, description = "Output directory")
    private String output;

    public static void main(String[] args) {
        int exitCode = new CommandLine(new PicocliApplication()).execute(args);
        System.exit(exitCode);
    }

    @Autowired
    private ExampleService exampleService;

    @Override
    public void run() {
        exampleService.run(input, output);
    }
}
