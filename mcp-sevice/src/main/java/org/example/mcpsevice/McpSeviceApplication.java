package org.example.mcpsevice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
public class McpSeviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(McpSeviceApplication.class, args);
    }

}
