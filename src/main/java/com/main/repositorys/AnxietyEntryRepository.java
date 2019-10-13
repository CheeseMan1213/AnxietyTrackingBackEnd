package com.main.repositorys;

import com.main.documents.AnxietyEntry;
import com.main.documents.TestCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface AnxietyEntryRepository extends MongoRepository<AnxietyEntry, String> {
    List<AnxietyEntry> findAllByDate(String date);
}
