package com.example.repository;

import com.example.model.TrainingCenter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
//import java.util.List;

@Repository
public interface TrainingCenterRepository extends MongoRepository<TrainingCenter, String> {
    // You don't need to define findAll(), MongoRepository already provides it
    // You can add custom queries if needed, for example:
    // List<TrainingCenter> findByName(String name);
}

//package com.example.repository;
//import com.example.model.TrainingCenter;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.stereotype.Repository;
//import java.util.List;
//
//@Repository
//public interface TrainingCenterRepository extends MongoRepository<TrainingCenter, String>
// 	List<TrainingCenter> findAll();
// }