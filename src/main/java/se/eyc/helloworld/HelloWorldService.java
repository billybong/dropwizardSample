package se.eyc.helloworld;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import se.eyc.helloworld.healthcheck.TemplateHealthCheck;
import se.eyc.helloworld.resource.HelloWorldResource;

/**
 * User: bisj
 * Date: 2013-10-09
 * Time: 12:24
 */
public class HelloWorldService extends Service<HelloWorldConfiguration> {

    public static void main(String[] args) throws Exception{
        new HelloWorldService().run(args);
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
        bootstrap.setName("hello-world");
    }

    @Override
    public void run(HelloWorldConfiguration configuration, Environment environment) throws Exception {
        environment.addResource(new HelloWorldResource(configuration.getTemplate(), configuration.getDefaultName()));
        environment.addHealthCheck(new TemplateHealthCheck(configuration.getTemplate()));
    }
}
