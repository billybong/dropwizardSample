package se.eyc.helloworld.healthcheck;

import com.yammer.metrics.core.HealthCheck;

/**
 * User: bisj
 * Date: 2013-10-09
 * Time: 13:21
 */
public class TemplateHealthCheck extends HealthCheck {

    private final String template;

    public TemplateHealthCheck(String template) {
        super("template");
        this.template = template;
    }

    @Override
    protected Result check() throws Exception {

        final String saying = String.format(template, "TEST");

        if(saying.contains("TEST")){
            return Result.healthy();
        }else{
            return Result.unhealthy("Template did not contain the name");
        }
    }
}
