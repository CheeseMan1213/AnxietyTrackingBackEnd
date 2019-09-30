package com.main.rest_controllers;

import com.main.documents.AnxietyEntry;
import com.main.service.AnxietyEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
