package inrtu.controller;

import inrtu.model.Auditory;
import inrtu.repository.AuditoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/auditories")
public class AuditoryController {

    @Autowired
    private AuditoryRepository auditoryRepository;

    @GetMapping
    public ResponseEntity<?> getAuditory(@RequestParam Long id){
        Optional<Auditory> auditoryOptional = auditoryRepository.findById(id);
        if (auditoryOptional.isPresent()){
            return ResponseEntity.ok(auditoryOptional.get());
        }else{
            return ResponseEntity.notFound().build();
        }

    }

    @GetMapping
    public ResponseEntity<?> getAuditories(){
        List<Auditory>auditories = auditoryRepository.findAll();
        return ResponseEntity.ok(auditories);
    }


    @PostMapping
    public ResponseEntity<?> createAuditory(@RequestBody Auditory auditory){
        return ResponseEntity.ok(auditoryRepository.save(auditory));
    }

    @PostMapping("/update")
    public ResponseEntity<?>updateAuditory(@RequestBody Auditory auditory){
        return ResponseEntity.ok(auditoryRepository.save(auditory));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?>deleteAuditory(@RequestBody Auditory auditory){
        auditoryRepository.delete(auditory);
        return ResponseEntity.ok().build();
    }

}
