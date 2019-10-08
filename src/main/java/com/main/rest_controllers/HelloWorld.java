/*
* Work Cited
* http://zetcode.com/spring/getmapping
* */

package com.main.rest_controllers;

import com.main.documents.TestCollection;
import com.main.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(value = "/tests", produces = "application/json")
    public List<TestCollection> testGet() {
        return testCollectionService.getAllTests();
    }

    /*The @CrossOrigin annotation makes things less secure
     * use with caution.*/
    @CrossOrigin
    @PostMapping(value = "/tests", consumes = "application/json")
    public void testPost(@RequestBody TestCollection testCollectionRequest) {
        TestCollection testCollection = new TestCollection();

        testCollection.setFirstName(testCollectionRequest.getFirstName());
        testCollection.setLastName(testCollectionRequest.getLastName());
        testCollection.setTTime(testCollectionRequest.getTTime());

        testCollectionService.saveTest(testCollection);
    }

    /*The @CrossOrigin annotation makes things less secure
     * use with caution.*/
    @CrossOrigin
    @PutMapping(value = "/tests", consumes = "application/json")
    public void testPut(@RequestBody TestCollection testCollectionRequest) {

        testCollectionService.updateTest(testCollectionRequest);
    }

    /*The @CrossOrigin annotation makes things less secure
     * use with caution.*/

    //I am using POST instead of a DELETE here, because I want to be able to send a body
    //as part of performing my delete. This is because I want only one entry, even if they
    //have the same first name, to be deleted. I want to use mongoDB's "_id", but
    //I do not want to send it as part of the URL. And Flutter's http library does
    //not have a "body" as part of its delete method as of Flutter 1.9,
    //and package http: ^0.12.0+2
    @CrossOrigin
    @PostMapping(value = "/testDelete", consumes = "application/json")
    public void testDelete(@RequestBody TestCollection testCollectionRequest) {

        testCollectionService.deleteById(testCollectionRequest);
    }
}
