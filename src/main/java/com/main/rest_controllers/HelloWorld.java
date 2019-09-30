/*
* Work Cited
* http://zetcode.com/spring/getmapping
* */

package com.main.rest_controllers;

import com.main.documents.TestCollection;
import com.main.repositorys.TestCollectionRepository;
import com.main.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class HelloWorld {

    @Autowired
    private TestService testCollectionService;

    @GetMapping(value = "/hello", produces = "text/plain")
    public String HelloWorld() {
        return "Hello World!";
    }

    /*The @CrossOrigin annotation makes things less secure
    * use with caution.*/
    @CrossOrigin
    @GetMapping(value = "/test", produces = "application/json")
    public List<TestCollection> test() {
        return testCollectionService.getAllTests();
    }
}
