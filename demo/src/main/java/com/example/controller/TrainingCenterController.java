package com.example.controller;

import com.example.model.TrainingCenter;
import com.example.service.TrainingCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {

    private final TrainingCenterService service;

    @Autowired
    public TrainingCenterController(TrainingCenterService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createTrainingCenter(trainingCenter));
    }

    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        return ResponseEntity.ok(service.getAllTrainingCenters());
    }
}

//package com.example.controller;
//import com.example.model.TrainingCenter;
//import com.example.service.TrainingCenterService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import javax.validation.Valid;
//import java.util.List;
//@RestController
//@RequestMapping("/api/training-centers")
//public class TrainingCenterController {
//	private final TrainingCenterService service;
//	@Autowired
//	public TrainingCenterController(TrainingCenterService service) {
//		this.service = service;
//	}
//	@PostMapping
//	public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody Traini
//			return ResponseEntity.status(HttpStatus.CREATED).body(service.createTrainingCente
//	}
//	@GetMapping
//	public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
//		return ResponseEntity.ok(service.getAllTrainingCenters());
//	}
//}