package inrtu.controller;

import inrtu.model.Auditory;
import inrtu.repository.AuditoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class AuditoryController {

    @Autowired
    private AuditoryRepository auditoryRepository;

    @GetMapping("auditory")
    public ResponseEntity<?> getAuditory(){
        List<Auditory>auditories = auditoryRepository.findAll();
        if (auditories != null) {
            return ResponseEntity.ok(auditories);
        }else{
            return new ResponseEntity("List of auditories not found", HttpStatus.NOT_FOUND);
        }
    }
}
