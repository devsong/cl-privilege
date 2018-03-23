package com.cl.privilege;

import java.util.concurrent.CountDownLatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@ImportResource("classpath*:/META-INF/applicationContext.xml")
@EnableAspectJAutoProxy
@EnableAutoConfiguration
@Slf4j
public class PrivliegeServer {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(PrivliegeServer.class, args);
        ctx.registerShutdownHook();
        log.info("***privliege server started***");
        try {
            new CountDownLatch(1).await();
        } catch (InterruptedException e) {
        }
    }
}
