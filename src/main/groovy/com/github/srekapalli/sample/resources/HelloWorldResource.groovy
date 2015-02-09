package com.github.srekapalli.sample.resources

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.wordnik.swagger.annotations.ApiOperation
import static org.springframework.web.bind.annotation.RequestMethod.GET

@RestController
class HelloWorldResource {

    @RequestMapping(value = "/api", method = GET)
    @ApiOperation("hello world")
    Message hello() {
        new Message(text: "Hello world!")
    }
}

class Message {

   String text

}
