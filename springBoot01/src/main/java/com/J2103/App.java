package com.J2103;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ServletComponentScan //配置servlet
public class App 
{
    public static void main( String[] args )
    {

        SpringApplication.run(App.class,args);
    }
}
