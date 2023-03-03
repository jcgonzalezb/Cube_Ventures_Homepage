package org.cubeVentures.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"org.cubeVentures.steps"},
        tags = "@webTesting"
)


/**
 * Represents the runner used to make the web module test.
 *
 * @author juancamilo.gonzalez
 * @version 1.0
 */
public class RunCucumberWeb extends AbstractTestNGCucumberTests{
}
