package com.stackroute.repository;

import com.stackroute.model.ListedStorageUnit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ListedRepository extends MongoRepository<ListedStorageUnit,String> {
}
