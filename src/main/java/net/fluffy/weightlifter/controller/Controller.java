package net.fluffy.weightlifter.controller;

import net.fluffy.weightlifter.entities.WorkoutSet;
import net.fluffy.weightlifter.services.SetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Controller {

    @Autowired
    public SetService service;


    @GetMapping("/allset")
    public List<WorkoutSet> getAllSet(){
        System.out.println("calling all set");
        return service.getAllSet();
    }

    @GetMapping("/allset/{name}")
    public List<WorkoutSet> getAllSetByName(@PathVariable String name){
        return service.getSetByName(name);
    }

    @PostMapping("/addset")
    public String addSet(@RequestBody WorkoutSet set){
        service.createSet(set);
        return "Success";
    }

    @DeleteMapping("/set/{id}")
    public String deleteSet(@PathVariable long id){
        service.deleteSetById(id);
        return "It has been deleted";
    }





}
