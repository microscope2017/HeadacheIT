package com.headacheit.dataAPI;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController{
    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getDataResponseBody(){
        return "Hello";
    }
}