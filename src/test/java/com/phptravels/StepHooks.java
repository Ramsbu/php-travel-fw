package com.phptravels;

import com.phptravels.core.FluentDriverProvider;
import com.phptravels.core.WebDriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;
import java.util.Properties;

public class StepHooks {

    FluentDriverProvider fluentDriver;
    private static Properties properties;

    static {
        try {
            properties = WebDriverFactory.loadPropertiesfile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Before
    public void initialize() throws IOException {
        fluentDriver = new FluentDriverProvider();
        fluentDriver.get().openUrl(properties.getProperty("url"));
    }

    @After
    public void disposeDriver(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            byte[] screenshot = fluentDriver.get().takeScreenShot();
            scenario.embed(screenshot, "image/png");  // Stick it in the report
        }
        if (fluentDriver != null) {
            //    fluentDriver.get().stopDriver();
        }
    }
}
