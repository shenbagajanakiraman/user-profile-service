package com.stackroute.repository;

import com.stackroute.model.BookedStorageUnit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookedRespository  extends MongoRepository <BookedStorageUnit,String> {

}
