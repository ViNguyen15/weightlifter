package net.fluffy.weightlifter.services;

import net.fluffy.weightlifter.entities.WorkoutSet;
import net.fluffy.weightlifter.repo.WorkoutSetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutSetService implements SetService{

    @Autowired
    private WorkoutSetRepo setService;


    @Override
    public WorkoutSet createSet(WorkoutSet set) {
        return setService.save(set);
    }

    @Override
    public List<WorkoutSet> getAllSet(){
        return setService.findAll();
    }

    @Override
    public List<WorkoutSet> getSetByName(String name) {
        return setService.getWorkoutSetsByName(name);
    }

    @Override
    public void deleteSetById(Long id) {
        setService.deleteById(id);
        System.out.println("Deletion of id: " + id + " is complete");
    }

}
