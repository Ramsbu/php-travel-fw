package com.phptravels.core;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.Properties;

public class WebDriverFactory {

    private static Properties properties;
    private static final Logger logger = Logger.getLogger(WebDriverFactory.class);

    static {
        try {
            loadPropertiesfile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Properties loadPropertiesfile() throws IOException {
        String log4jConfPath = "./conf/log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);

        properties = new Properties();
        String propFileName = "app.properties";
        InputStream inputStream = MethodHandles.lookup().lookupClass().getClassLoader().getResourceAsStream(propFileName);
        if (inputStream != null) {
            properties.load(inputStream);
        } else {
            throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
        }
        return properties;
    }


    public static WebDriver getDriver() {
        logger.info("Sample");
        WebDriver driver = null;
        switch (properties.getProperty("browser")) {
            case "chrome":
                String chromeDriverLocation = System.getProperty("webdriver.chrome.driver");
                if (StringUtils.isEmpty(chromeDriverLocation)) {
                    throw new IllegalArgumentException("webdriver.chrome.driver property should not be null");
                }
                File chromeDriverExecutable = new File(chromeDriverLocation);
                if (!chromeDriverExecutable.exists()) {
                    throw new RuntimeException("webdriver.chrome.driver not found: " + chromeDriverLocation);
                }

                DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                capabilities.setCapability("chrome.switches", Arrays.asList("--start-maximized"));
                driver = new ChromeDriver(capabilities);
                break;
            case "safari":
                DesiredCapabilities cap = DesiredCapabilities.safari();
                driver = new SafariDriver(cap);
                break;
            case "ff":
                DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
                driver = new FirefoxDriver(desiredCapabilities);
                break;
        }
        driver.manage().window().maximize();
        return driver;
    }
}
