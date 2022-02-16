package nvc.bcit.icefactory.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.bcit.icefactory.model.Camera;
import nvc.bcit.icefactory.model.Event;
import nvc.bcit.icefactory.repository.CameraRepository;

@Service
public class CameraService {
    @Autowired
    private CameraRepository cameraRepository;

    public List<Camera> findAll(){
        return cameraRepository.findAll();
    }

    public Optional<Camera> findById(String id){
        return cameraRepository.findById(id);
    }

    public Camera addCamera(Camera camera){
        return cameraRepository.save(camera);
    }

    public Optional<Camera> addEvent(String id, Event event){
        Camera cam = cameraRepository.findById(id).get();
        List<Event> events = cam.getEvents();
        event.setCreatedAt(new Date(System.currentTimeMillis()));
        events.add(event);
        cam.setEvents(events);
        return Optional.of(cameraRepository.save(cam));
    }
}
