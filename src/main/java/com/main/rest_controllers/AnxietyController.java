/*
 * Work Cited
 *
 * */

package com.main.rest_controllers;

import com.main.documents.AnxietyEntry;
import com.main.service.AnxietyEntryService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/anxiety")
public class AnxietyController {

    @Autowired
    private AnxietyEntryService anxietyEntryService;

    /*The @CrossOrigin annotation makes things less secure
     * use with caution.*/
    @CrossOrigin
    @GetMapping(value = "/anxieties", produces = "application/json")
    public List<AnxietyEntry> getAllAnxieties() {
        return anxietyEntryService.getAllAnxieties();
    }

    /*The @CrossOrigin annotation makes things less secure
     * use with caution.*/
    @CrossOrigin
    @PostMapping(value = "/anxieties", consumes = "application/json")
    public void postAnxiety(@NotNull @RequestBody AnxietyEntry anxietyEntryRequest) {
        AnxietyEntry anxietyEntry = new AnxietyEntry();

        anxietyEntry.set_anxEntry(anxietyEntryRequest.get_anxEntry());
        anxietyEntry.set_date(anxietyEntryRequest.get_date());
        anxietyEntry.set_todayWas(anxietyEntryRequest.get_todayWas());

        anxietyEntryService.saveAnxiety(anxietyEntry);
    }
    /*The @CrossOrigin annotation makes things less secure
     * use with caution.*/
    @CrossOrigin
    @PutMapping(value = "/anxieties", consumes = "application/json")
    public void putAnxiety(@RequestBody AnxietyEntry anxietyEntryRequest) {

        anxietyEntryService.updateAnxiety(anxietyEntryRequest);
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
    @PostMapping(value = "/deleteAnxiety", consumes = "application/json")
    public void deleteAnxiety(@RequestBody AnxietyEntry anxietyEntryRequest) {

        anxietyEntryService.deleteById(anxietyEntryRequest);
    }
}
