package org.tisha.dockerdemo.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping( "/" )
public class DemoController
{

    @GetMapping
    public String demo()
    {
        log.info( "Demo Controller triggered." );
        return "Hello World.";
    }
}
