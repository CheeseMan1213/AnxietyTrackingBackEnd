package com.main.repositorys;


import com.main.documents.TestCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface TestCollectionRepository extends MongoRepository<TestCollection, BigInteger> {
    //
}
