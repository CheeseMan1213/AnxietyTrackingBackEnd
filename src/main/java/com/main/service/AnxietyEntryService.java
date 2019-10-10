package com.main.service;

import com.main.documents.AnxietyEntry;
import com.main.repositorys.AnxietyEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnxietyEntryService {

    @Autowired
    private AnxietyEntryRepository anxietyEntryRepository;

    public List<AnxietyEntry> getAllAnxieties() {
        List<AnxietyEntry> anxietyEntry = new ArrayList<>();
        anxietyEntryRepository.findAll().forEach(anxietyEntry::add);
        return anxietyEntry;
    }
    public void saveAnxiety(AnxietyEntry anxietyEntry) {
        anxietyEntryRepository.save(anxietyEntry);
    }
    //The create and update calls are basically the same, but the already existing _id
    //will be needed to update.
    public void updateAnxiety(AnxietyEntry anxietyEntry) {
        anxietyEntryRepository.save(anxietyEntry);
    }
    public void deleteById(@org.jetbrains.annotations.NotNull AnxietyEntry anxietyEntry) {
        anxietyEntryRepository.deleteById(anxietyEntry.get_id());
    }
}
