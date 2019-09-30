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
}
