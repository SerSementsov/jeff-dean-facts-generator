package com.sementcov.boot.jeffdeanfacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class JeffDeanFactsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JeffDeanFactsApplication.class, args);
    }

    @Value("${configuration.projectName}")
    public void setProjectName(String projectName) {
        System.out.println("${configuration.projectName}" + projectName);
    }

    @Autowired
    public void setEnv(Environment env) {
        System.out.println("env.getProperty() = " + env.getProperty("configuration.projectName"));
    }

    @Autowired
    public void setConfigProps(ConfigProps configProps) {
        System.out.println("configProps.getProjectName = " + configProps.getProjectName());
    }
}

@Component
@ConfigurationProperties(prefix = "configuration")
class ConfigProps {

    private String projectName;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
