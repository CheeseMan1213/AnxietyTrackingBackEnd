package com.main.service;

import com.main.documents.TestCollection;
import com.main.repositorys.TestCollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestCollectionRepository testCollectionRepository;

    public List<TestCollection> getAllTests() {

        List<TestCollection> testCollection = new ArrayList<>();
        testCollectionRepository.findAll().forEach(testCollection::add);
        return testCollection;
    }
    public void saveTest(TestCollection testCollection) {
        testCollectionRepository.save(testCollection);
    }
    //The create and update calls are basically the same, but the already existing _id
    //will be needed to update.
    public void updateTest(TestCollection testCollection) {
        testCollectionRepository.save(testCollection);
    }
    public void deleteByFirstName(String firstName) {
        testCollectionRepository.deleteByFirstName(firstName);
    }
    public void deleteById(TestCollection testCollection) {
        testCollectionRepository.deleteById(testCollection.get_id());
    }
}
