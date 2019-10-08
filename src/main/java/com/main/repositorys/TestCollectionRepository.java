package com.main.repositorys;


import com.main.documents.TestCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestCollectionRepository extends MongoRepository<TestCollection, String> {
    void deleteByFirstName(String firstName);
}
