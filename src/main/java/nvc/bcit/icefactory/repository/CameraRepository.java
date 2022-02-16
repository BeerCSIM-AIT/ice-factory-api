package nvc.bcit.icefactory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import nvc.bcit.icefactory.model.Camera;

public interface CameraRepository extends MongoRepository<Camera, String> {
    
}
