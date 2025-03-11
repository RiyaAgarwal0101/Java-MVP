 package com.example.service;
 import com.example.model.TrainingCenter;
 import com.example.repository.TrainingCenterRepository;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import java.util.List;
 @Service
 public class TrainingCenterService {
 private final TrainingCenterRepository repository;
 @Autowired
 public TrainingCenterService(TrainingCenterRepository repository) {
 this.repository = repository;
 }
 public TrainingCenter createTrainingCenter(TrainingCenter center) {
 center.setCreatedOn(System.currentTimeMillis());
 return repository.save(center);
 }
 public List<TrainingCenter> getAllTrainingCenters() {
 return repository.findAll();
 }
 }