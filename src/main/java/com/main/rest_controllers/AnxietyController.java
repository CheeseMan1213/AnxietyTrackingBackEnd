package com.main.rest_controllers;

import com.main.documents.AnxietyEntry;
import com.main.enums.TodayWas;
import com.main.service.AnxietyEntryService;
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

    @CrossOrigin
    @PostMapping(value = "/anxieties", produces = "application/json")
    public void postSingleAnxiety(@RequestBody AnxietyEntry anxietyEntryRequest) {

        AnxietyEntry anxietyEntry = new AnxietyEntry();

        anxietyEntry.set_anxEntry(anxietyEntryRequest.get_anxEntry());
        anxietyEntry.set_date(anxietyEntryRequest.get_date());
        anxietyEntry.set_todayWas(anxietyEntryRequest.get_todayWas());

        anxietyEntryService.saveAnxiety(anxietyEntry);
    }
}
