package com.assignment.docker.dockerspring.resources;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
@RequestMapping("GET /time")
public class TimeResource {

    @GetMapping("/date/v1")
    public String dateTimeApiV1(
            @RequestParam("localdatetime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime localdatetime) {
            System.out.println(localdatetime);
            return "Done";
    }
}





