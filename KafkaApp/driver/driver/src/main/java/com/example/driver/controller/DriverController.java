package com.example.driver.controller;

import com.example.driver.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @PutMapping("/loc")
    public ResponseEntity sendLocation() throws InterruptedException {
       long n=20;
        int m=1;
        while(n!=0) {
            driverService.updateLocation(m+" "+Math.random() + " , " + Math.random());
            Thread.sleep(1000);
            m++;
            n--;
        }

        return new ResponseEntity<>(Map.of("message", "Location Updated")
                , HttpStatus.OK);
    }

}
