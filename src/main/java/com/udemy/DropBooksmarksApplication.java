package com.udemy;

import com.udemy.resources.HelloResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DropBooksmarksApplication extends Application<DropBooksmarksConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropBooksmarksApplication().run(args);
    }

    @Override
    public String getName() {
        return "DropBooksmarks";
    }

    @Override
    public void initialize(final Bootstrap<DropBooksmarksConfiguration> bootstrap) {
        // TODO: application initialization
    }

    //Here is where we have to register our resources
    @Override
    public void run(final DropBooksmarksConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(
                new HelloResource()
        );
    }

}
