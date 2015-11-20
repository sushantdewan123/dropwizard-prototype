package com.dropwizard.myproject;

import com.dropwizard.myproject.health.TemplateHealthCheck;
import com.dropwizard.myproject.resources.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by dewans on 11/19/15.
 */
public class HelloWorldApplication extends Application<HelloWorldConfiguration> {

    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
        // do nothing ...
    }

    @Override
    public void run(HelloWorldConfiguration helloWorldConfiguration,
                    Environment environment)
            throws Exception {
        final HelloWorldResource resource = new HelloWorldResource(helloWorldConfiguration.getTemplate(),
                helloWorldConfiguration.getDefaultName());
        environment.jersey().register(resource);
        final TemplateHealthCheck healthCheck = new TemplateHealthCheck(helloWorldConfiguration.getTemplate());
        environment.healthChecks().register("template", healthCheck);
    }
}
