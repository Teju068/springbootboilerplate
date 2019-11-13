package com.aimids.restspis.aimidsrestapis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AimidsWebServiceResource {

    @GetMapping(path = "/")
    public String aimidsServiceRunning() {
        return "Welcome to Aimids WebService";
    }
}
