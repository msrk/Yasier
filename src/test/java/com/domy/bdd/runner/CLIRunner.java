package com.domy.bdd.runner;

import org.junit.Test;


import cucumber.api.cli.Main;
public class CLIRunner {

    @Test
    public void test() throws Throwable {
        Main.main(new String[]{


                "-g", "com/domy/bdd/cucumber",
                "-t", "@all",
                "src/test/resources"
        });
    }
}

